
package assignment3;
import java.util.Scanner;
public class Cau2 {
     public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Type user's name: ");
        String n1 = n.next();
        
        Scanner a = new Scanner(System.in);
        System.out.print("Type user's age: ");
        int a1 = a.nextInt();
        
        System.out.println("Hello " + n1 + ", you are " + a1 + " years old.");
    }
}
