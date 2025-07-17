package NumberSystem;
import java.util.*;
public class Anybasetoanybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int result = 0;
        int pow = 1;
        while (n!=0) {
            int dig = n % b2;
            n/=b2;
            result += dig * pow;
            pow*=b1; 
        }
        System.out.println(result);
    }
}
