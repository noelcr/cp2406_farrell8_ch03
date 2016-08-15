import java.util.Scanner;

/**
 * Created by jc321443 on 15/08/16.
 */
public class BookstoreCredit {
    public static void main(String []args){
        System.out.println("please enter your GPA>>>");
        Scanner userGpa = new Scanner(System.in);
        double gpa = userGpa.nextDouble();

        System.out.println("please enter your Name>>>");
        Scanner userName = new Scanner(System.in);
        String name = userName.nextLine();

        displayCredit(gpa, name);

    }
    public static void displayCredit(double gpa, String name){
        System.out.println(gpa + name);
        double storeCredit = gpa * 10.0;
        System.out.println("Hello " + name + ", your bookstore credit is " +storeCredit);

    }
}