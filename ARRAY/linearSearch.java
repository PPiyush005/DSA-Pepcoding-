package ARRAY;
import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int z=0;
        
        for(int i = 0; i<n ;i++){
            if (target==arr[i]) {
                z=i;
                break;
            }
            else{
                z=-1;
            }
        }
        System.out.println(z);
    }
}
