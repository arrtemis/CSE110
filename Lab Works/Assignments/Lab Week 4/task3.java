import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, pos = 0, neg = 0;

        System.out.print("Enter an integer: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();
            if(num >= 0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println(pos + " Non-negative numbers");
        System.out.println(neg + " Negative numbers");
        sc.close();
    }
}

