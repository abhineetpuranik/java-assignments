public class classmethods {
    int logic(int a,int b){
        int z;
        if(a>b){
           z=a+b;
        }else{
            z=b-a;
        }
        return z;
}    
public static void main(String[] args){
      int a=2;
      int b=5;
      classmethods o1=new classmethods();
      int z=o1.logic(a,b);
      System.out.println(z);
}
}