import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, max, min;
        System.out.println("Please enter 3 numbers");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if(a > b && a > c){
            max = a;

            if(b > c){
                min = c;
            }else{
                min = b;
            }

        }else if(b > c && b > a){
            max = b;

            if(c > a){
                min = a;
            }else{
                min = c;
            }

        }else{
            max = c;

            if(b > a){
                min = a;
            }else{
                min = b;
            }

        }

        System.out.println("Maximum number is " + max + "\nMinimum number is " + min);
        sc.close();
    }
}
