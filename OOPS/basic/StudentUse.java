package basic;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Student s1 = new Student("Mohitur");
//        Student s2 = new Student("Rahaman", 13);
//        s1.print();
//        s2.print();
        Student s3 = new Student("Mohitur", 1);
//        System.out.println(s3);
        s3.print();
        Student s4 = new Student("Rohan", 2);
//        System.out.println(s4);
        s4.print();
        System.out.println(Student.getNumStudents());
    }
}