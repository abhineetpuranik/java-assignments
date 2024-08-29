public class pattern {
    public static void main(String[]args){
        //1st 
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        //2nd
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //3rd
        int a=65;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)a);
                a++;
            }System.out.println();
        }System.out.println();

        //4th
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i==1 || i==6 || j==1 || j==6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
} 
    
