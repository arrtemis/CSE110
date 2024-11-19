import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a number: ");
        int num1 = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0 && i != num1){
                    sum += i;
            }
        }
        if(sum == num1){
            System.out.println(num1 + " is a perfect number");
        }
        sc.close();
    }
}
