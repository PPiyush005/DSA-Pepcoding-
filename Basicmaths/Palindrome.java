//Given an integer x, return true if x is a palindrome, and false otherwise.
package Basicmaths;
import java.util.*;
public class Palindrome {
    static boolean checkPal(int x){
        String s = Integer.toString(x);
        String reversed = new StringBuilder(s).reverse().toString();

        if (s == reversed) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        checkPal(x);

    }
}
