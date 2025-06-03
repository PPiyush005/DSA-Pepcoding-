/*input:
First line of input contains n, the number of elements in the input array
Next n lines contain elements of the array of n integers, each in a new line.
Output:
First line of output contains all the odd numbers in the input array, seperated by a comma
Second line of output contains all the even numbers in the input array, seperated by a comma */
package ARRAY;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i =0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean first = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                if (!first) System.out.print(",");
                System.out.print(arr[i]);
                first = false;
            }
        }

        System.out.println();
        first = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                if (!first) System.out.print(",");
                System.out.print(arr[i]);
                first = false;
            }
        }

        
    }
}
