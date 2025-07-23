package Recursion;
import java.lang.reflect.Array;
import java.util.*;
public class WriteanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[]=new int[n];
        for(int i =0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
       displayingArray(arr, 0);
    }
    static void displayingArray(int arr[],int n){
        System.out.println(arr[n]);
        displayingArray(arr, n-1);
    }
}
