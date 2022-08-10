package kunal;

//only outside classes can't be static
public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Mohitur"); // to make this line error less we need to make the 'Test' class static
//  but if I want to make 'Test' non-static then I need to put this outside the 'InnerClass'
        Test b = new Test("Rahaman");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a); // this will print a random hash value to prevent that we need to override toString method
    }
}