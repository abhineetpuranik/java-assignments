class Que16{
    static int hcf(int x,int y){
        if(x==0)
            return y;
        if(y==0)
            return x;
        if(x==y)
            return x;
        if(x>y){
            return hcf(x-y,y);
        }else{
            return hcf(x,y-x);  
        }
    }
    public static void main(String[] args) {
        int x=100,y=80;
        System.out.println("HCF of " + x +" and " + y + " is " + hcf(x, y));
    }
}
