
package assignment4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = n.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = n.nextInt();
        System.out.print("Enter an operator: ");
        char operator = n.next().charAt(0);
        
        switch(operator){
            case '+' : System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            break;
            case '-' : System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            break;
            case '*' : System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            break;
            case '/' : 
                if(n2 != 0){
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                } else {
                    System.out.println("Error: 0 is not allowed!!!");
                }
            break;
            default: System.out.println("Error: Invalid operator");
        }
    }
}
