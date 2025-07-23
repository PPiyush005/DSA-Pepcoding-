package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of element:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortSelection(arr, n);
    }
    static void sortSelection(int arr[], int n){
        for(int i = 0 ; i<n ; i++){
            int Smallest_Index = i;
            for(int j=i+1 ; j<n ; j++){
                if (arr[Smallest_Index]>arr[j]) {
                    Smallest_Index = j;
                }
            }
                    int temp =arr[Smallest_Index];
                    arr[Smallest_Index]=arr[i];
                    arr[i]=temp;
        }

        for(int i =0 ; i<n ;i++){
        System.out.print(arr[i] + " ");
        }
    }
}
