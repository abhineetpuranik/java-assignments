interface A {
    void methodA1();
    void methodA2();
}

interface B {
    void methodB1();
    void methodB2();
}

interface C {
    void methodC1();
    void methodC2();
}

interface D extends A, B, C {
    void methodD();
}

class ConcreteClass {
    public void baseMethod() {
        System.out.println("This is from the base concrete class.");
    }
}

class MyClass extends ConcreteClass implements D {
    public void methodA1() { System.out.println("Method A1"); }
    public void methodA2() { System.out.println("Method A2"); }
    public void methodB1() { System.out.println("Method B1"); }
    public void methodB2() { System.out.println("Method B2"); }
    public void methodC1() { System.out.println("Method C1"); }
    public void methodC2() { System.out.println("Method C2"); }
    public void methodD() { System.out.println("Method D"); }
}

public class Q18A2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA1();
        obj.methodB1();
        obj.methodC1();
        obj.methodD();
        obj.baseMethod();
    }
}