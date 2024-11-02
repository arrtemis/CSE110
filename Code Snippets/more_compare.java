import java.util.Scanner;

public class more_compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        if(a > b && a > c){
            System.out.println("Maximum number is " + a);
            if(b < c){
                System.out.println("Minimum number is " + b);
            }else{
                System.out.println("Minimum number is " + c);
            }
        }else if(b > c && b > a){
            System.out.println("Maximum number is " + b);
            if(c < a){
                System.out.println("Minimum number is " + c);
            }else{
                System.out.println("Minimum number is " + a);
            }
        }else if(c > b && c > a){
            System.out.println("Maximum number is " + c);
            if(b < a){
                System.out.println("Minimum number is " + b);
            }else{
                System.out.println("Minimum number is " + a);
            }
        }

        scanner.close();
    }
}
