import java.util.Scanner;

public class quadratics{
    public static void main(String[] args) {
        int a, b, c, discriminant;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the coefficients of the quadratics: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        discriminant = b*b - 4*a*c; 
        if(discriminant > 0){
            System.out.println("The polynomial has two real and unequal roots");
        }else if(discriminant == 0){
            System.out.println("The polynomial has two real and equal roots");
        }else{
            System.out.println("The polynomial has two imaginary roots");
        }
    }
}
