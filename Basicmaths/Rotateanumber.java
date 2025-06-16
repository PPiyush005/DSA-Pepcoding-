package Basicmaths;
import java.util.*;
public class Rotateanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int temp =n;
        int nod =0;

        while (temp!=0) {
            temp=temp/10;
            nod++;
        }

        k = k % nod;
        if (k < 0) {
            k += nod; //This converts any negative rotation into an equivalent positive right rotation.
        }


        int quo = n / (int)Math.pow(10, k);
        int rem = n % (int)Math.pow(10, k);
        int multip = rem *( int)Math.pow(10, nod-k);
        int result = multip+quo;

        System.out.println(result);
        sc.close();
        
    }
}
