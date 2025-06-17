package Basicmaths;
import java.util.*;
public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int hy=0;
        int pe=0;
        int ba=0;

        if (a>b && a>c) {
            hy=a;
            pe=b;
            ba=c;
        }
        else if (b>a && b>c) {
            hy=b;
            pe=a;
            ba=c;
        }
        else{
            hy=c;
            pe=b;
            ba=a;
        }

        if ((hy*hy)==((pe*pe)+(ba*ba))) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        sc.close();
    }
}
