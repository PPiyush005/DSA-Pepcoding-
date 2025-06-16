package Basicmaths;
import java.util.*;
public class Reverseanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp=n;
        int digit =0;

        while (temp!=0) {
            temp/=10;
            digit++;
        }

        for(int i=1;i<=digit;i++){
            int r=n%10;
            System.out.println(r);
            n=n/10;
        }
        sc.close();
    }
}
