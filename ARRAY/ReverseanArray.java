package ARRAY;
import java.util.*;
public class ReverseanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n;i++){
            a[i]=sc.nextInt();
        }

        int reva[]=new int[n];

        for(int i = 0; i<a.length ;i++){
            reva[i] = a[a.length-i-1];
        }
        System.out.print("Given Array:- ");
        for(int i = 0; i<n;i++){
            System.out.print(a[i]);
        }
        
        System.out.println("");

        System.out.print("Reversed Array:- ");
        for(int i = 0; i<n;i++){
            System.out.print(reva[i]);
        }


    }
}
