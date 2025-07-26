/*Given an array of n integers, find the most frequent element in it i.e., 
the element that occurs the maximum number of times. 
If there are multiple elements that appear a maximum number of times, 
find the smallest of them. */
package Hashing;
import java.util.*;
public class highestLowestFrequency {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max=arr[0];
        for(int i = 1; i<n; i++ ){
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        max++;
        int hashh[] = new int[max];
        for(int i = 0 ; i<n ; i++){
            hashh[arr[i]]++;
        }

        int min = hashh[0];
        int maxi = hashh[0];
        for (int i = 0; i < hashh.length; i++) {
    if (hashh[i] > 0 && hashh[i] <= min) {
        min = hashh[i];
    }
    if (hashh[i] > maxi) {
        maxi = hashh[i];
    }
}
        System.out.println(min);
        System.out.println(maxi);
    }
}
