class A2 {
    void hello() {
        System.out.println("Hello from A1");
    }
}

class B2 extends A2 {
    void hello() {
        System.out.println("Hello from В1");
    }
}

class C2 extends B2 {
    void hello() {
        System.out.println("Hello from C1");
    }
}

class MethodOverriding2 {
    public static void main(String[] args) {
        A2 obj = new C2();
        obj.hello();
    }
}