package ARRAY;
import java.util.*;
public class SpanofanArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n =sc.nextInt();

    int arr[]=new int[n];
    for(int i = 0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int max =arr[0];
    for(int i = 1;i<n;i++){
        if (arr[i]>max) {
            max = arr[i];
        }
    }
    int min =arr[0];
    for(int i=1;i<n;i++){
        if (min>arr[i]) {
            min=arr[i];
        }
    }

    int result = max-min;
    System.out.println(result);
}
    
}