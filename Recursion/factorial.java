package Recursion;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
    }
    static int fact(int n){
        int temp=0;
        if (n==0 || n==1) {
            return 1;
        }
        return n*fact(n-1); 
    }
}
