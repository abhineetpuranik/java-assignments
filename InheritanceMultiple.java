interface Printable{
    void print();
}
interface Showable{
    void show();
}
class InheritanceMultiple implements Printable,Showable{ 
    public void print(){System.out.println("Hello");} 
    public void show(){System.out.println("Welcome");} 
    public static void main(String args[]){ 
    InheritanceMultiple obj = new InheritanceMultiple(); 
    obj.print(); 
    obj.show(); 
    } } 
