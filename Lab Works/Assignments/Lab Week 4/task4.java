import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num = 2, divisors, prime_count = 0;
        N = sc.nextInt();

        while(prime_count < N){
            divisors = 0;
            for(int j = 1; j <= num; j++){
                if(num % j == 0){
                    divisors++;
                }
            }
            if(divisors == 2){
                prime_count++;
                System.out.println(num);
            }
            num++;
        }
        sc.close();
    }
}

