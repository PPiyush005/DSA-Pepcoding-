package ARRAY;
import java.util.*;
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        

        int low =0;
        int high = arr.length-1;

        while (low<=high) {
            int mid = (low + high)/2;
            if (target<arr[mid]) {
                high = mid-1;
            }
            else if (target>arr[mid]) {
                low=mid+1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
