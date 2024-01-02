import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee name:");
        String name = scanner.nextLine();

        System.out.println("Enter employee AGE:");
        int age = scanner.nextInt();

        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();

        
        System.out.println("\nEmployee Data:");
        System.out.println("Name: " + name);
        System.out.println("AGE: " + age);
        System.out.println("Salary: " + salary);

        scanner.close();
    }
}