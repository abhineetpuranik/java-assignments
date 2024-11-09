class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking");}
}
class Pup extends Dog{
    void weep(){System.out.println("weeping");}
}
class Q13A2{
    public static void main(String[] args) {
        Pup p=new Pup();
        p.weep();
        p.bark();
        p.eat();
    }
}