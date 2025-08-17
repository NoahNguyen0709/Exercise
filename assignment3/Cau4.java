
package assignment3;
import java.util.Scanner;
public class Cau4 {
     public static void main(String argr[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 1st float number: ");
        float n1 = n.nextFloat();
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter 2nd float number: ");
        float a1 = a.nextFloat();
        
        System.out.println("Average: " + ((n1+a1)/2));
    }
}
