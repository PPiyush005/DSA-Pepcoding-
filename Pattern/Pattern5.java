import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = (n/2)+1;
        for (int i = 1; i <= temp; i++) {
            for (int space = 1; space <= n - i-2; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = temp - 1; i >= 1; i--) {
            for (int space = 1; space <= temp - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
