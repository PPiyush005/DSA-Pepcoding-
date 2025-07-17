package ARRAY;
import java.util.*;
public class SubsetsofanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int limits = (int)Math.pow(2, n);

        for(int i =0 ; i<limits;i++){
            String set ="";
            int temp =i;
            for(int j =arr.length-1 ; j>=0;j--){
                int rem = temp%2;
                temp=temp/2;
                if (rem == 0) {
                    set = "- " + set;
                }
                else{
                    set = arr[j]+" " + set;
                }
            }
            System.out.println(set);
        }
    }
}
