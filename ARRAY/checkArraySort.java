package ARRAY;
import java.util.*;
public class checkArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i = 0 ;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                count++;
            }
        }
        if (count>0) {
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }
    }
}
