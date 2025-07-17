package NumberSystem;
import java.util.*;
public class Anybasetodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        int pow = 1;

        while (n!=0) {
            int dig = n % 10;
            n/=10;
            result += dig * pow;
            pow*=b; 
        }
        System.out.println(result);
    }
}
