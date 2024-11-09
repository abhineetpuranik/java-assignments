class Vehicle{ 
    void run(){
        System.out.println("Vehicle is running");
    } 
} 
   
class Q7A2 extends Vehicle{ 
    void run(){
        System.out.println("Bike is running safely");
    } 
    public static void main(String args[]){ 
        Q7A2 obj = new Q7A2(); 
        obj.run(); 
    } 
}