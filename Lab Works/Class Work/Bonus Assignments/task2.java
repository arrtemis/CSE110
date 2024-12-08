import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows? ");
        int rows = sc.nextInt();
        System.out.println("Symbol? ");
        String symbol = sc.next();

        System.out.println();
        for(int i = 0; i < rows; i++){
            for(int spaces = rows; spaces > i; spaces --){
                System.out.print(" ");
            }
            for(int stars = 0; stars  <= i; stars++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
