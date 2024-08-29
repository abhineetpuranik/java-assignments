public class typeofdata {
    public static void main(String args[]){
        int i = 100;
        double bf = 4.67890;
        float f = 4.6f;
        String s = "Java";

        System.out.println(s.getClass().getName());
        System.out.println(((Object)i).getClass().getName());
        System.out.println(((Object)bf).getClass().getName());
        System.out.println(((Object)f).getClass().getName());
    }
}
