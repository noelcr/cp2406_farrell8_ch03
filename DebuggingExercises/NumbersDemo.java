import java.util.Scanner;

/**
 * Created by jc321443 on 15/08/16.
 */
public class NumbersDemo {
    public static void main(String []args){

        System.out.println("enter first number? >>>");
        Scanner inputNum = new Scanner(System.in);
        int Number1 = inputNum.nextInt();

        System.out.println("enter second number? >>>");
        Scanner inputNum2 = new Scanner(System.in);
        int Number2 = inputNum.nextInt();

        int num1 = Number1;
        int num2 = Number2;
        displayTwiceTheNumber(num1, num2);
        displayNumberPlusFive(num1, num2);
        displayNumberSquared(num1, num2);
    }
    public static void displayTwiceTheNumber(int num1, int num2){
        System.out.println(num1*2);
        System.out.println(num2*2);
    }
    public static void displayNumberPlusFive(int num1, int num2){
        System.out.println(num1+5);
        System.out.println(num2+5);
    }
    public static void displayNumberSquared(int num1, int num2){
        System.out.println(num1^2);
        System.out.println(num1^2);

    }

}
