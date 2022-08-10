package kunal;

public class StudentsUse {
    public static void main(String[] args) {
//        Students[] students = new Students[5];
        Students mohitur = new Students();
        Students kunal = new Students(15, "Kunal Kushwaha", 45.7f);
//        mohitur.changeName("Kunal Kushwaha");
//        mohitur.greeting();
//        System.out.println(kunal.rollNos);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);
//        System.out.println();
//        System.out.println(mohitur.rollNos);
//        System.out.println(mohitur.name);
//        System.out.println(mohitur.marks);
        final Students test = new Students(12, "Testing name", 65.8f);
        test.name = "Final change testing";
        System.out.println(test.name);
    }
}