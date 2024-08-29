public class constructors {
    double a;
    double b;
    constructors(){}
    constructors(int x){
       this.a=x;
       System.out.println(a);
    }
    constructors(int x,int y){
       this.a=x;
       this.b=y;
       System.out.println(a + " " + b);
    }
    constructors(int x,double y){
        a=x;
        b=y;
        System.out.println(a + " " + b);
    }
    constructors(double x, double y){
        a=x;
        b=y;
        System.out.println(a + " " + b);
    }
    public static void main(String[] args){
        constructors o1= new constructors(4);
        constructors o2=new constructors(5,6);
        constructors o3=new constructors(2,6.4);
        constructors o4=new constructors(7.98,5.87);
    }
}
