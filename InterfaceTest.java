interface Drawable{
    void draw();
}                                
class rectangle implements Drawable{
    public void draw(){System.out.println("Drawing Rectange");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("Drawing Circle");}
}

class InterfaceTest{
    public static void main(String[] args) {
        //Drawable d=new Drawable();    Drawable is abstract, cannot be instantiated
        Drawable d=new rectangle();
        d.draw();
        Drawable d1=new Circle();
        d1.draw();
    }
}