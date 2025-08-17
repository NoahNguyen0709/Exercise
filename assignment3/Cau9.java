
package assignment3;
import java.util.Scanner;
public class Cau9 {
    public class FixNextIntAndNextLine {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter an integer: ");
 int number = scanner.nextInt();

 // Fixing the issue by adding an extra nextLine()
 scanner.nextLine(); // To consume the newline character

 System.out.print("Enter a sentence: ");
 String sentence = scanner.nextLine();

 System.out.println("Number: " + number);
 System.out.println("Sentence: " + sentence);
 }
}

}
