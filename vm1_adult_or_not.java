import java.util.*;

public class vm1_adult_or_not {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();

       if (age > 18) {
        System.out.println("Adult");
       }
       else {
        System.out.println("not adult");
       }
    }
}
