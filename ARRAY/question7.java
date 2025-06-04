/*Take an array with several 0s in it, push all the 0s to 
the start of the array and print the array. */
package ARRAY;
import java.util.*;
public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr1[]=new int[n];
        for(int i =0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        int arr2[]=new int[n];
        for(int i =0;i<n;i++){
            if (arr1[i]==0) {
                arr2[i]=arr1[i];
                System.out.println(arr2[i]);
            }
        }
    }
}
