public class Que31 {
    String name;
    int age;

    public Que31() {
        name = "ABC";
        age = 10;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Que31 person = new Que31();
        person.displayInfo();
    }
}
