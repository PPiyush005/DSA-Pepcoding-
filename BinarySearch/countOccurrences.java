import java.util.*;
public class countOccurrences {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int res=0;
        for(int i = 0 ; i<n ; i++){
            if (target==arr[i]) {
                res++;
            }
            else{
                res = -1;
            }
        }
        System.out.print(res);
    }
}
