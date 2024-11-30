import java.lang.Math;
import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        System.out.println("Welcome user! The calculator is currently configured to display 8 significant figures and the angle unit is in degrees. Happy calculating!");
        //the keypad
        Scanner keypad = new Scanner(System.in);

        //the variables
        double factorial = 1, angle_rad, angle_degree, sum = 0.0, result = 0.0, a = 0.0, b = 0.0;
        String prompt, operator = null;
        System.out.println("more modes are WIP if uni doesn't kill me, but for now, algebra or trigonometry?: ");
        prompt = keypad.nextLine();

        //the place where the magic happens (asking for user input and deciding where to go from there)
        if(prompt.equalsIgnoreCase("algebra")){ //algebra mode
            System.out.println("Please enter the numbers: ");
            a = keypad.nextDouble();
            b = keypad.nextDouble();

            keypad.nextLine();
            System.out.println("Now enter the operators(+ - * / ^ % !): ");
            operator = keypad.nextLine();

        }else if(prompt.equalsIgnoreCase("trigonometry")){ //trig mode
            System.out.print("sin cos tan\n=>");
            operator = keypad.nextLine();
        }else{
            operator = "invalid";
        }

        //the calculator
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
            case "%":
                result = a % b;
                System.out.println("The remainder is " + (float)result + " when " + a + " is divided by " + b);
                break;
            case "sin":
                System.out.println("angle(in degrees): ");
                angle_degree = keypad.nextDouble();

                if(angle_degree > 360 || angle_degree < -360){
                    angle_degree %= 360;
                }

                angle_rad = Math.toRadians(angle_degree);
                for(int n = 0; n <= 100; n++){    
                    factorial = 1;
                    for(int j = 1; j <= 2*n + 1; j++){
                        factorial *= j;
                    }
                    if(n % 2 == 0){
                        result += (Math.pow(angle_rad, 2*n + 1) / factorial);
                    }else{
                        result -= (Math.pow(angle_rad, 2*n + 1) / factorial);
                    }
                }
                break;
            case "cos":
                break;
            case "tan":
                break;
            default:
                System.out.println("Sorry the calculator has not yet been programmed to perform this operation :(");
                break;
        }

        System.out.println("\n= " + (float)result);

        keypad.close();
    }

}
