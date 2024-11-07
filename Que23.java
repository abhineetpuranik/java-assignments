public class Que23 {
    public static void main(String[] args) {
        int rows = 3;  
        int num = 1;   
        for (int i = 1; i <= rows; i++) {
            
            for (int j = i; j < rows; j++) {
                System.out.print("  ");  
            }
            // Print numbers with spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
        int r = 4; 
        for (int i = 1; i <= r; i++) {
            for (int j = i; j < r; j++) {
                System.out.print("  ");
            }
                for (int j = i; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                 
                    for (int j = 2; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
        }
    }
}
        

 