public class Que28{
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int s=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                s=s+a[i];
            }
        }
        System.out.println("Sum of Odd nunbers of the array is : " + s);
    }
}