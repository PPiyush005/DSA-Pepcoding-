package ARRAY;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int rd=0;
        int temp[] = new int [n];
        temp[rd++]=arr[0];
        for(int i =1 ; i<temp.length-1;i++){
            boolean isduplicate =false;
            for(int j=0;j<rd;j++){
                if (arr[i]==arr[j]) {
                    isduplicate=true;
                    break;
                }
            }
            if (!isduplicate) {
                temp[rd++]=arr[i];
            }
        }
        for(int i = 0 ; i<rd ; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
