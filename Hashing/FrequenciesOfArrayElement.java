/*Given an array nums of size n which may contain duplicate elements, return a list of pairs 
where each pair contains a unique element from the array and its frequency in the array */
package Hashing;
import java.util.*;
public class FrequenciesOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter element of array: ");
        int nums[] = new int[n];
        for(int i = 0; i<n; i++ ){
            nums[i]=sc.nextInt();
        }
        int max=nums[0];
        for(int i = 1; i<n; i++ ){
            if (max<nums[i]) {
                max=nums[i];
            }
        }
        max++;
        int hashh[] = new int[max];
        for(int i=0 ; i<n; i++){
            hashh[nums[i]]++;
        } 
        for(int i =0 ; i<max ; i++){
            if(hashh[i]>0){
                System.out.print("["+i+ ","+hashh[i]+"]");
            }
        }

    }
}
