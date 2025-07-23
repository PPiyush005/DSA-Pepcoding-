package Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of element:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortinsertion(arr, n);
    }
    static void sortinsertion(int arr[],int n){
        int prev =0;
        for(int i = 1; i<n ; i++){
            int curr = arr[i];
             prev = i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i]);
        }
    }
}
