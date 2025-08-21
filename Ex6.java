
package assignment4;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter an average score: ");
        double n1 = n.nextDouble();
        if(9 <= n1 && n1 <= 10){
            System.out.println("Excellent");
        } else if(8 <= n1 && n1 <= 8.9){
            System.out.println("Good");
        } else if(6.5 <= n1 && n1 <= 7.9){
            System.out.println("Fair");
        } else if(5 <= n1 && n1 <= 6.4){
            System.out.println("Average");
        } else if(n1 < 5){
            System.out.println("Fail");
        }
    }
}
