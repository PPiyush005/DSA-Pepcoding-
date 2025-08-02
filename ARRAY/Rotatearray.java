package ARRAY;
import java.util.*;
public class Rotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int j=0;
        int temp[] = new int[n];
        for(int i = k;i<n;i++){
            temp[j++]=arr[i];
        }
        for(int i = 0;i<k;i++){
            temp[j++]=arr[i];
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(temp[i]+" ");
        }
    }
}
