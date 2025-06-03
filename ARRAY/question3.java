/*input:
An array of 10 integers, each separated by a comma.
Output:
An integer - denoting the count of elements in the array that are divisible by 5 */
package ARRAY;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count=0;
        int arr[]=new int[10];

        for(int i =0 ; i<10;i++){
            arr[i]=sc.nextInt();
        }

        for(int i = 0 ; i<10;i++){
            if (arr[i]%5==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
