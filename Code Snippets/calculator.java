import java.lang.Math;
import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        Scanner keypad = new Scanner(System.in);

        int a, b, c, temp;
        double result;
        String prompt;

        System.out.println("please enter the numbers: ");
        a = keypad.nextInt();
        b = keypad.nextInt();

        keypad.nextLine();
        System.out.println("now enter the operator (valid options: +, -, *, /, ^, %, sin, cos, tan): ");
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
            case "^":
                result = Math.pow(a, b);
                System.out.println(result);
                break;
            case "%":
                result = a % b;
                System.out.println("The remainder when " + a + " is divided by " + b + " is = " + result);
                break;
            case "sin":
                System.out.println("please enter the third side: ");
                c = keypad.nextInt();
                if(a > b && a > c){
                    System.out.println("Assuming " + b + " to be the length of opposite side\nDo you want to proceed?(y/n): ");
                    prompt = keypad.nextLine();
                    if(prompt == "y"){
                        result = b/a;
                        System.out.println("sin = " + result);
                    }else if(prompt == "n"){
                        System.out.println("Okay, swapping the sides.");
                        result = c/a;
                        System.out.println("sin = " + result);
                    }
                }
                //to-do: add this
                if(b > a && b > c){}
                if(c > a && c > b){}
                break;
            case "cos":
                break;
            case "tan":
                break;
            default:
                System.out.println("Sorry the calculator has not yet been programmed to perform this operation :(");
                break;
        }

        keypad.close();
    }

}
