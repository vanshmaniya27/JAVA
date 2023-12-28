import java.util.Scanner;

public class EmployeeDetails{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Employee age:");
        String age = scanner.nextLine();

        System.out.println("Enter Employee Department:");
        String dept = scanner.nextLine();
        
        System.out.println("Employee name:"+ name);
        System.out.println("Employee age:"+ age);
        System.out.println("Employee department:"+ dept);
        scanner.close();
       
    }
    
}