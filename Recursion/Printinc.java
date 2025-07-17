package Recursion;
import java.util.*;
public class Printinc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printincrease(n);
    }
    static void printincrease(int n){
        if (n>=1) {
        printincrease(n-1);
        System.out.print(n+" ");
        }
        
    }
}
