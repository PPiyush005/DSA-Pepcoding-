/*Take 10 elements in an array and find the sum of all elements. */
package ARRAY;
import java.util.*;
public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int arr[]=new int[10];

        for(int i =0 ; i<10;i++){
            arr[i]=sc.nextInt();
        }

        for(int i =0 ; i<10;i++){
           sum += arr[i];
        }
        System.out.println(sum);

    }
}