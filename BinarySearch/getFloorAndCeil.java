import java.util.*;
public class getFloorAndCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int low=0;
        int high=n-1;
        int floor=-1;
        int ceil=-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==x) {
                floor=x;
                ceil=x;
                break;
            }
            else if (arr[mid]<x) {
                floor = arr[mid];
                low=mid+1;
            }
            else{
                ceil=arr[mid]; 
                high=mid-1;
            }
        }
        System.out.print(floor+ " " +ceil);
    }
}
