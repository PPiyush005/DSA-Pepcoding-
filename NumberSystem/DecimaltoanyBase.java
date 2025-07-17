package NumberSystem;
import java.util.*;
public class DecimaltoanyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int pow = 1;
        int result=0;
        while (n!=0) {
            int dig = n%b;
            n/=b;
            result+=dig*pow;
            pow*=10;
        }
        System.out.println(result);
    }
}
