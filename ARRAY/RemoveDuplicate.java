package ARRAY;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int temp[] = new int [n];
        for(int i =0 ; i<temp.length-1;i++){
            if (arr[i]==arr[i+1]) {
                temp[i]=arr[i+1];
            }
        }
        for(int i = 0 ; i<n ; i++){
            if (temp[i]==0) {
                continue;
            }
            else{
            System.out.print(temp[i] + " ");
            }
        }
    }
}
