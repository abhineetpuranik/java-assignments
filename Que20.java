public class Que20 {
    public static void main(String[] args) {
        int num= 29;
        boolean p=false;

        if(num==0||num==1){
            p=true;
        }
        for(int i=2; i<=num/2;i++){
            if (num%i==0){
                p=true;
                break;
            }
        }
        if(!p){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
