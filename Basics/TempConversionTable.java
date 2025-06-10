/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E), and Step Size (W),
 you need to convert all Fahrenheit values from Start to 
End at the gap of W into their corresponding Celsius values and print the table. */
package Basics;
import java.util.*;
public class TempConversionTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();

        for(int i=s;i<=e;i+=w){
           int c = (int)((5.0 / 9) * (i - 32));
            System.out.println(i+" "+c);
        }
    }
}
