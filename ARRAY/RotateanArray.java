package ARRAY;
import java.util.*;
public class RotateanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i<n;i++){
            a[i]=sc.nextInt();
        }

        int k = sc.nextInt();

        int rot1[] = new int[n-k];
        int rot2[] = new int[k];
        int a2[] = new int[n];

        for(int i =0; i<n-k;i++){
            rot1[i]=a[n-k-i-1];
        }
        
        for (int i = 0; i < k; i++) {
            rot2[i] = a[n - 1 - i];    
        }
        
        int index = 0;
        for (int i = 0; i < rot1.length; i++) {
            a2[index++] = rot1[i];
        }

        for (int i = 0; i < rot2.length; i++) {
            a2[index++] = rot2[i];
        }
        
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = a2[left];
            a2[left] = a2[right];
            a2[right] = temp;
            left++;
            right--;
        }       


        for (int i = 0; i < n; i++) {
             System.out.print(a2[i] + " ");
        }
    }
}

