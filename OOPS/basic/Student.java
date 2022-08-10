package basic;

public class Student {
    String name;
    private final int rollNumber;
    private static int numStudents;

    //    public Student(String n, int rn) {
//        name = n;
//        rollNumber = rn;
//    }
    public Student(String name, int rollNumber) {
//        System.out.println(this);
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    public static int getNumStudents() {
        return numStudents;
    }
//    public Student(String n) {
//        name = n;
//    }

    public void print() {
        System.out.println(name + " : " + rollNumber);
    }
}