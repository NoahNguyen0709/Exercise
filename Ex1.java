
package assignment4;
import java.util.Scanner;
public class Ex1 {
     public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n1 = n.nextInt();
        if( n1 % 2 == 0){
            System.out.println(n1 + " is an even number!!!");
        } else{
        System.out.println(n1 + " is an odd number!!!");
    }
    }
}
