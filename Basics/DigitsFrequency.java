package Basics;
import java.util.Scanner;
public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int temp=0;
        int count=0;
        while (n!=0) {
            temp = n % 10;
            
            if (temp==d) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
