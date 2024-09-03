class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class InheritanceSingle{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
        Animal a = new Animal();
        a.eat(); //Bark method cannot be used, unindentified for class Animal
    }
}

