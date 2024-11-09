class Complex {
    public static void f1()
    {
        System.out.println(
            "f1 method of the Complex class is executed.");
    }
}
 
class Sample extends Complex {
    public static void f1()
    {
        System.out.println(
            "f1 of the Sample class is executed.");
    }
}
public class Q8A2 {
 
    public static void main(String args[])
    {
        Complex d1 = new Complex();
        Complex d2 = new Sample();
        d1.f1();
        d2.f1();
    }
}