
package assignment4;
import java.util.Scanner;
public class Ex9 {
     public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap n: ");
        double n1 = Double.parseDouble(n.next());
        double n2 = (n1>=0) ? n1:(-n1);
        System.out.println("Gia tri tuyet doi: " + n2);
    }
}
