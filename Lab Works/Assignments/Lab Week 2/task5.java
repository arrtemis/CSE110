import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        number = sc.nextInt();
        if(number > 0){
            if(number % 2 == 0){
                System.out.println("Number is positive and even");
            }else{
                System.out.println("Number is positve and odd");
            }
        }else if(number < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
