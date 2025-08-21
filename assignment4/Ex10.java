
package assignment4;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap 3 canh tam giac: ");
        int a = Integer.parseInt(n.next());
        int b = Integer.parseInt(n.next());
        int c = Integer.parseInt(n.next());
        if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("Khong the tao thanh tam giac");
        } else if(a==b && a==c && b==c){
            System.out.println("Tam giac deu");
        } else if(a==b || a==c || b==c){
            System.out.println("Tam giac can");
        } else if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)){
            System.out.println("Tam giac vuong");
        }
    }
}
