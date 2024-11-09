public class Q15A2{
    int x;
    int z;
    Q15A2(int x){
    x=x;
    System.out.println(x);
    }
    Q15A2(int x, int z){
      this.x=x;
      this.z=z;
      System.out.println(x + " " + z);
    }
    public static void main(String[] args){
     Q15A2 o1=new Q15A2(5);
     Q15A2 o2=new Q15A2(2,3);
    }
}