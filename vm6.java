import java.util.Scanner;

public class vm6 {
    public static void main(String[] args) {
        System.out.println("CBSE Board Exam Percentage Calculator");

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.print("Enter marks for English (out of 100): ");
        int englishMarks = scanner.nextInt();

        System.out.print("Enter marks for Mathematics (out of 100): ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter marks for Science (out of 100): ");
        int scienceMarks = scanner.nextInt();

        System.out.print("Enter marks for Social Science (out of 100): ");
        int socialScienceMarks = scanner.nextInt();

        System.out.print("Enter marks for Hindi (out of 100): ");
        int hindiMarks = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate total marks and percentage
        int totalMarks = englishMarks + mathMarks + scienceMarks + socialScienceMarks + hindiMarks;
        double percentage = (double) totalMarks / 500 * 100;

        // Display the result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + " %");
    }
}
