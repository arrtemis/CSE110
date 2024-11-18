import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Please enter 3 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }else if(num1 != num2 && num2 != num3 && num3 != num1){
            System.out.println("all numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}
