public class Que17 {
    public static void main(String[] args) {
        int a=15,b=10;
        int lcm=(a>b) ? a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0)
                break;
            lcm++;
        }
        System.out.println("LCM of " + a + " and "+ b + " is " + lcm);
    }
}
