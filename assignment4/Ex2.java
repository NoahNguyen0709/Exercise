
package assignment4;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter an age: ");
        int a1 = a.nextInt();
        if (0 <= a1 && a1 <=12){
            System.out.println("Child");
        } else if(13 <= a1 && a1 <= 19){
            System.out.println("Teenager");
        } else if(20 <= a1 && a1 <= 59){
            System.out.println("Adult");
        } else if(60 <= a1){
            System.out.println("Senior");
        }
    }
}
