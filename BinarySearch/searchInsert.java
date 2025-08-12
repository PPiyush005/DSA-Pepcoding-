import java.util.*;
public class searchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int low=0;
        int high=n-1;
        int res=n;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==target) {
               res=mid;
               break;
            }
            else if (arr[mid]<target) {
                low=mid+1;
            }
            else {
                res=mid;
                high=mid-1;
            }
        }
        System.out.print(res);
    }
}
