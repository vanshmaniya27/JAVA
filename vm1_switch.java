import java.util.*;

public class vm1_switch {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int btn = sc.nextInt();

       switch (btn) {
        case 1:
            System.out.println("switch 1");
            break;
        case 2:
            System.out.println("switch 2");
            break;
        default:
        System.out.println("default");
            break;
       }
    
    }
}