public class string {
    public static void main(String args[]){
        String S1="name";
        System.out.println("The length of String S1 is "+ S1.length());
        String s=S1.substring(0,2);
        System.out.println("A substring of S1 is "+ s);
        System.out.println("String in uppercase "+ S1.toUpperCase());
        String S2="Surname";
        System.out.println("Concatenation: "+ S1+S2);
        String S3 = "";
        if(S3.length()!=0){
            System.out.println("S3 is not an empty string!");
        }else{
            System.out.println("S3 is an empty string!");
        }

    }
}
