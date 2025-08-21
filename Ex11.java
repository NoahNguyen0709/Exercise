
package assignment4;
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a1 = Double.parseDouble(a.next());
        Scanner b = new Scanner(System.in);
        System.out.print("Nhap b: ");
        double b1 = Double.parseDouble(b.next());
        Scanner c = new Scanner(System.in);
        System.out.print("Nhap c: ");
        double c1 = Double.parseDouble(c.next());
        //System.out.println(a1 + "x^2 + " + b1 + "x + " + c1);
        if(a1==0){
            System.out.println("Phuong trinh co 1 nghiem: x = " + (-c1/b1));
        } else{
            double delta = b1*b1 - 4*a1*c1;
            if(delta==0){
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + (-b1/(2*a1)));
            } else if(delta>0){
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + (-b1 + Math.sqrt(delta))/(2*a1));
                System.out.println("x1 = " + (-b1 - Math.sqrt(delta))/(2*a1));
            } else{
                System.out.println("Phuong trinh khong co nghiem thuc");
            }
        }
    }
}
