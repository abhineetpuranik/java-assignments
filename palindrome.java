public class palindrome {
        public static void main(String[] args){
            String s1="NITIN";
            int lptr=0;
            int rptr=s1.length()-1;
            while(lptr<=rptr){
                if(s1.charAt(lptr)!=s1.charAt(rptr)){
                    System.out.println("string is not a palindrome");
                    return;
                }
                    lptr++;
                    rptr--;
                    
        }
    System.out.println("string is a palindrome");
    
    }
}
