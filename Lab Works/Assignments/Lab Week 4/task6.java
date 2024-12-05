import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, divisors = 0;
        while(true){
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if(num % 2 == 1){
                break;
            }else if(num > 0 && num % 2 == 0){
                for(int i = 1; i <= num; i++){
                    if(num % i == 0){
                        divisors++;
                    }
                }
                System.out.println(num + " has " + divisors + " divisors");
                divisors = 0;
            }
        }

        sc.close();
    }
}
