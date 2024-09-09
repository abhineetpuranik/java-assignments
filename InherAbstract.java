abstract class Bike{
    abstract void run();
}

class InherAbstract extends Bike{
    void run(){System.out.println("Bike running properly");}
    public static void main(String[] args) {
        Bike obj = new InherAbstract();
        obj.run();
        //abstractclass obj = new Bike(); Bike is abstract, cannot be instantiated
    }
}