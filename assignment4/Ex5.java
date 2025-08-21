
package assignment4;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number from 2 - 8: ");
        int n1 =n.nextInt();
        switch(n1){
            case 2: System.out.println("Thu hai"); break;
            case 3: System.out.println("Thu ba"); break;
            case 4: System.out.println("Thu tu"); break;
            case 5: System.out.println("Thu nam"); break;
            case 6: System.out.println("Thu sau"); break;
            case 7: System.out.println("Thu bay"); break;
            case 8: System.out.println("Chu nhat"); break;
            default: System.out.println("Error!!!");
        }
    }
}
