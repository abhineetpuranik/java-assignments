class Que19{
    static int reversenum(int n){
        int rnum=0;
        while (n>0){
            rnum=rnum*10+ n%10;
            n=n/10;
        }
        return rnum;
    }
    public static void main(String[] args) {
        int n= 123321;
        int r= reversenum(n);
        System.out.println("Reverse number is " + r);
        if(n==r){
            System.out.println(n + " is palindrome");
        }else{
            System.out.println("Not a palindrome!");
        }
    }
}