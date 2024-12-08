import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows? ");
        int rows = sc.nextInt();
        System.out.println("Symbol? ");
        String symbol = sc.next();

        System.out.println();

        for(int i = 0; i < rows; i++){
            if(i == rows - 2){
                continue;
            }
            for(int spaces = 0; spaces < i; spaces++){
                System.out.print(" ");
            }
            for(int stars = rows; stars >= i; stars--){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        for(int i = 0; i <= rows; i++){
            if(i == 2){
                continue;
            }
            for(int spaces = rows; spaces > i; spaces--){
                System.out.print(" ");
            }
            for(int stars = 0; stars <= i; stars++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
