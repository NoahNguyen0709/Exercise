
package assignment4;
import java.util.Scanner;
public class Ex7 {
     public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap 3 so nguyen: ");
        int a = Integer.parseInt(n.next());
        int b = Integer.parseInt(n.next());
        int c = Integer.parseInt(n.next());
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println("So lon nhat la " + max);
    }
}
