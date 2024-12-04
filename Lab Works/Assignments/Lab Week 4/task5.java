import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub_sum = 0, sum = 0, n;
        
        System.out.println("The value of N: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            sub_sum = 0;
            for(int j = 1; j <= i; j++){
                sub_sum +=j;
            }
            sum -= sub_sum;
        }
        System.out.println("The value of y: " + sum);

        sc.close();
    }
}
