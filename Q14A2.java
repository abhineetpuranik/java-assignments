import java.util.Scanner;

class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    private double gross_salary;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter Employee Name: ");
        emp_name = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic_salary = scanner.nextDouble();
        calculateGrossSalary();
    }

    private void calculateGrossSalary() {
        double hra = 0.20 * basic_salary;  //House Rent Allowance
        double da = 0.50 * basic_salary;   //Dearness Allowance
        gross_salary = basic_salary + hra + da;
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.printf("Basic Salary: %.2f%n", basic_salary);
        System.out.printf("Gross Salary: %.2f%n", gross_salary);
    }
}
public class Q14A2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.displayDetails();
    }
}
