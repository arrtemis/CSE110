import java.lang.Math;
import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        System.out.println("Welcome user! The calculator is currently configured to display 8 significant figures and the angle unit is in degrees. Happy calculating!");
        //the keypad
        Scanner keypad = new Scanner(System.in);

        //the variables
        double factorial = 1, angle_rad, angle_degree, result = 0.0, a = 0.0, b = 0.0;
        int fact = 1;
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
                System.out.println("\n= " + (float)result);
                break;
            case "-":
                result = a - b;
                System.out.println("\n= " + (float)result);
                break;
            case "*":
                result = a * b;
                System.out.println("\n= " + (float)result);
                break;
            case "/":
                result = a / b;
                System.out.println("\n= " + (float)result);
                break;
            case "^":
                result = Math.pow(a, b);
                System.out.println("\n= " + (float)result);
                break;
            case "%":
                result = a % b;
                System.out.println("The remainder is " + (float)result + " when " + a + " is divided by " + b);
                break;
            case "!":
                a = (int)a;
                b = (int)b;
                System.out.println("Calculating factorial of " + a + " and " + b + " as only integers' factorial can be computed");
                for(int i = 1; i <= a; i++){
                    factorial *= i; 
                }
                System.out.println("factorial of " + a + " = " + (float)factorial);

                factorial = 1;
                for(int i = 1; i <= b; i++){
                    factorial *= i;
                }
                System.out.println("factorial of " + b + " = " + (float)factorial);
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
                    result += fact * (Math.pow(angle_rad, 2*n + 1) / factorial);
                    fact *= -1;
                }

                System.out.println("\n= " + (float)result);
                break;
            case "cos":
                fact = 1;
                System.out.println("angle(in degrees): ");
                angle_degree = keypad.nextDouble();

                if(angle_degree > 360 || angle_degree < -360){
                    angle_degree %= 360;
                }

                angle_rad = Math.toRadians(angle_degree);
                for(int n = 0; n <= 100; n++){    
                    factorial = 1;
                    for(int j = 1; j <= 2*n; j++){
                        factorial *= j;
                    }
                    result += fact * (Math.pow(angle_rad, 2*n) / factorial);
                    fact *= -1;
                }

                System.out.println("\n= " + (float)result);
                break;
            case "tan":
                System.out.println("angle(in degrees): ");
                angle_degree = keypad.nextDouble();
                fact = 1;

                if(angle_degree > 90 || angle_degree < -90){
                    angle_degree %= 360;
                }
                if(angle_degree == 90 || angle_degree == -90){
                    System.out.println("sorry that's an asymptote of the tan graph");
                    break;
                }

                angle_rad = Math.toRadians(angle_degree);
                //sin part
                double sin = 0;
                for(int n = 0; n <= 100; n++){    
                    factorial = 1;
                    for(int j = 1; j <= 2*n + 1; j++){
                        factorial *= j;
                    }
                    sin += fact * (Math.pow(angle_rad, 2*n + 1) / factorial);
                    fact *= -1;
                }
                //cos part
                double cos = 0;
                fact = 1;
                for(int n = 0; n <= 100; n++){    
                    factorial = 1;
                    for(int j = 1; j <= 2*n; j++){
                        factorial *= j;
                    }
                    cos += fact * (Math.pow(angle_rad, 2*n) / factorial);
                    fact *= -1;
                }
                result = sin/cos;
                System.out.println("\n= " + (float)result);
                break;
            default:
                System.out.println("Sorry the calculator has not yet been programmed to perform this operation :(");
                break;
        }

        keypad.close();
    }

}
