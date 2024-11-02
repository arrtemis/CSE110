import java.lang.Math;
import java.util.Scanner;

public class text{
    public static void main(String args[]){
        Scanner keypad = new Scanner(System.in);

        int a, b, result, index;

        System.out.println("please enter the numbers: ");
        a = keypad.nextInt();
        b = keypad.nextInt();

        keypad.nextLine();
        System.out.println("now enter the operator (valid options: +, -, *, /, 'index'): ");
        String operator = keypad.nextLine();

        switch (operator) {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            case "*":
                result = a * b;
                System.out.println(result);
                break;
            case "/":
                result = a / b;
                System.out.println(result);
                break;
                
            default:
                System.out.println("unknown operator :( ");
                break;
        }
    }

}