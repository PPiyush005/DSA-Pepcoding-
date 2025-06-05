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

        int c=0;
        if (b>a) {
            c=b;
        }else{
            c=a;
        }
        int arr3[]= new int[c];
        for(int i=0;i<c;i++){
            arr3[i]=arr1[i]+arr2[i];
            System.out.println(arr3[i]);
        }
    }
}
