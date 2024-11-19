import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a number: ");
        int divisors = 0;
        int num1 = sc.nextInt();

        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0){
                divisors++;
            }
        }
        if(divisors == 2){
            System.out.println(num1 + " is a prime number");
        }else{
            System.out.println(num1 + " is not a prime number");
        }

        sc.close();
    }
}
