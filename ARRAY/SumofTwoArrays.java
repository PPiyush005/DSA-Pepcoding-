//REVISE

package ARRAY;
import java.util.*;
public class SumofTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr1[]= new int[a];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }

        int b=sc.nextInt();
        int arr2[]= new int[b];
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }

        int arr3[]= new int[a>b? a:b];
        int carry=0;

        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;

        while (k>=0) {
            int d=carry;
            if (i>=0) {
                d+=arr1[i];
            }
            if (j>=0) {
                d+=arr2[j];
            }
            carry=d/10;
            d=d%10;

            arr3[k]=d;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.println(carry);
        }
        for(int val:arr3){
            System.out.println(val);
        }
    }
}
