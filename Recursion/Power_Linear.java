package Recursion;
import java.util.*;
public class Power_Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int x = sc.nextInt();

        int result = power(n, x);
        System.out.println(result);
    }
    static int power(int n, int x){
        if (n==1 || x==0) {
            return 1;
        }
        return n*power(n, x-1);
    }
}
