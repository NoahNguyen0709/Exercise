
package assignment4;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x1 = Double.parseDouble(x.next());
        Scanner y = new Scanner(System.in);
        System.out.print("Enter y: ");
        double y1 = Double.parseDouble(y.next());
        if(x1>0 && y1>0){
            System.out.println("The point is in the 1st quadrant");
        } else if(x1<0 && y1>0){
            System.out.println("The point is in the 2nd quadrant");
        } else if(x1<0 && y1<0){
            System.out.println("The point is in the 3rd quadrant");
        } else if(x1>0 && y1<0) {
            System.out.println("The point is in the 4th quadrant");
        } else {
            System.out.println("The point is on an axis");
        }
    }
}
