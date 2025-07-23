package Recursion;
import java.util.*;
public class SumoffirstNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int result = sum(n);
        System.out.println(result);
    }
    static int sum(int n){
        if (n == 0) {
           return 0; 
        }

        return (n+sum(n-1));
    }
}
