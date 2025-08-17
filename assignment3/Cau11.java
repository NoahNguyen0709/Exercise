
package assignment3;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Cau11 {
    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.print("Enter id: ");
        String id1 = id.nextLine();
        
        Scanner name = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name1 = name.nextLine();
        
        Scanner bday = new Scanner(System.in);
        System.out.print("Enter birthday: ");
        String bday1 = bday.nextLine();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try{
            date = f.parse(bday1);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        
        Scanner major = new Scanner(System.in);
        System.out.print("Enter major: ");
        String major1 = major.nextLine();
        
        Scanner gpa = new Scanner(System.in);
        System.out.print("Enter gpa: ");
        float gpa1 = gpa.nextFloat();
        
        System.out.println("Student Infomation:");
        System.out.println("- Id: " + id1);
        System.out.println("- Full name: " + name1);
        System.out.println("- Birthday: " + date);
        System.out.println("- Major: " + major1);
        System.out.println("- GPA: " + gpa1);
    }
}
