package kunal;

public class Students {
    int rollNos;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

//    Students() {
//        this.rollNos = 12;
//        this.name = "Mohd Mohitur Rahaman";
//        this.marks = 90.8f;
//    }

    Students(int rollNos, String name, float marks) {
        this.rollNos = rollNos;
        this.name = name;
        this.marks = marks;
    }

    Students(Students other) {
        this.rollNos = other.rollNos;
        this.name = other.name;
        this.marks = other.marks;
    }

    Students() {
//    this is how you call a constructor fron another constructor
        // internally: new Student (13, "default person", 100.0f);
        this(13, "default person", 100.0f);
    }

    void changeName(String newName) {
        name = newName;
    }

    //    overriding garbage collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}