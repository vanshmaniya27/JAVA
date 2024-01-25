import java.util.*;

public class vm1_btns {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int btn = sc.nextInt();

       if (btn == 1) {
        System.out.println("btn 1");
       }
       else if (btn == 2){
        System.out.println("btn 2");
       }
       else if (btn == 3){
        System.out.println("btn 3");
       }
       else {
        System.out.println("invalid input");
       }
    }
}
