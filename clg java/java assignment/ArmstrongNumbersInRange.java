import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

  
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
