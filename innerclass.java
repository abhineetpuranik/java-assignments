public class innerclass {
    void h(){System.out.println("Hello");}
    static class bye{
        void b(){System.out.println("Bye!");}
    }
    public static void main(String[] args) {
        innerclass h1=new innerclass();
        h1.h();
        //h1.b();
    }
}