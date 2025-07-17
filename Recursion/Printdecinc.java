package Recursion;
import java.util.*;
public class Printdecinc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdecreaseincrease(n);
    }
    static void printdecreaseincrease(int n){

        if (n>=1) {
            System.out.print(n + " ");
            printdecreaseincrease(n-1);
            System.out.print(n+ " ");
        }

    }
}
