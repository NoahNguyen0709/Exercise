
package assignment4;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int n1 = n.nextInt();
        if( n1%100 == 0 || n1%4 != 0 && n1 % 400 != 0){
            System.out.println(n1 + " is not a leap year");
        } else {
            System.out.println(n1 + " is a leap year");
        }
    }
}
