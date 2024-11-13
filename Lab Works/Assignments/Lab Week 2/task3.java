import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*if(divisible by both 5 & 7){
        *}else{
        * no}
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("please give a number: ");
        int number = sc.nextInt();

        int divisible = 0;
        if(number % 5 == 0){
            divisible++;
        }
        if(number % 7 == 0){
            divisible++;
        }

        if(divisible == 1){
            if(number % 5 == 0){
                System.out.println("Invalid: Divisible by 5 only");
            }else if(number % 7 == 0){
                System.out.println("Invalid: Divisible by 7 only");
            }
        }else if(divisible == 2){
            System.out.println("Divisible by both");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
