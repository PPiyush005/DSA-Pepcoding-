package Recursion;
import java.util.*;
public class Printdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdecrease(n);
    }
    static void printdecrease(int n){
        if (n>=1) {
        System.out.print(n + " ");              
        printdecrease(n-1);
        }
        
    }
}
