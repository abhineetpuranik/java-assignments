public class Que32 {
    int a;
    int b;
    public Que32(int x,int y){
       this.a=x;
       this.b=y;
    }
    public void display(){
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
    public static void main(String[] args){
        Que32 obj=new Que32(5,6);
        obj.display();
    }
}
