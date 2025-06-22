package ARRAY;
import java.util.*;
public class Differenceoftwoarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i = 0; i<n1;i++){
            a1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int j = 0; j<n2;j++){
            a2[j]=sc.nextInt();
        }
        int diff[] = new int[n2];
        
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;
        int borrow = 0;

        while (k>=0) {
            int d1 = i >= 0 ? a1[i] : 0;
            int d2 = a2[j];

            d2+=borrow;
            int d=0;
            if (d2>=d1) {
                d = d2-d1;
                borrow =0;
            }
            else{
                d = (d2 + 10) - d1;
                borrow = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int indx =0;
        while (indx < diff.length) {
            if (diff[indx]==0) {
                indx++;
            }
            else{
                break;
            }
        }

        while (indx<diff.length) {
            System.out.print(diff[indx]);
            indx++;
        }
    }
}
