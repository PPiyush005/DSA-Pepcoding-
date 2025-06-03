/*Take two arrays A,B of same size, multiply corresponding elements, 
store them in a third array and print it. */
package ARRAY;
import java.util.*;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];

        for(int i =0; i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i =0; i<n;i++){
            b[i]=sc.nextInt();
        }

        for(int i =0; i<n;i++){
            c[i]= a[i]*b[i];
            System.out.print(c[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}
