package Basicmaths;
import java.util.*;
public class Digitsofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp=n;
        int digit=0;
        while (temp!=0) {
            temp=temp/10;
            digit++;
        }

        for(int i=(int)Math.pow(10, digit-1);i!=0;i=i/10){
            int q =n/i;
            System.out.println(q);
            n=n%i;
        }
        sc.close();
    }
}
