package ARRAY;
import java.util.*;
public class CeilandFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int data = sc.nextInt();
        int arr[] = new int[n];

        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int l =0;
        int h = arr.length-1;
        int ceil =0;
        int floor =0;
        while (l<=h) {
            int m = (l+h)/2;
            if (data<m) {
                h = m-1;
                ceil = arr[m];
            }
            else if (data>m) {
                l = m+1;
                floor =arr[m];
            }
            else{
                ceil = arr[m];
                floor = arr[m];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);


    }
}
