public class SwapNumbers {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;

        System.out.println("Before swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}
