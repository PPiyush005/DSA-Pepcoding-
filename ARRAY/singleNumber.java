package ARRAY;
import java.util.*;
public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ;i<n ; i++) {
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        for(int i = 1; i<n; i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        int temp[] = new int[max+1];
        for(int i = 0; i<n;i++){
            temp[arr[i]]++;
        }
        int res=0;
        for(int i = 0; i<=max; i++){
            if (temp[arr[i]]==1) {
                res=arr[i];
            }
        }
        System.out.print(res);
    }
}
