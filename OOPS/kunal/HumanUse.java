package kunal;

public class HumanUse {
    public static void main(String[] args) {
        Human mohitur = new Human(22, "Mohitur Rahaman", 50000, false);
        Human kunal = new Human(23, "Kunal Kushwaha", 60000, true);

//        static variables are not dependent on objects,
//        if I remove above lines which creates two objects named mohitur & kunal nothing happens to below two lines
//        it will print as always
        System.out.println(Human.population);
        System.out.println(Human.population);

//        declare greeting function as static only then you can use it inside main
//        greeting();
    }


    // this is not dependent on objects
    static void fun() {
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it

//      In short terms, to access non-static stuffs inside the static you just need an object to reference
        HumanUse obj = new HumanUse();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
//    means I can use a static inside a non-static one.
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}