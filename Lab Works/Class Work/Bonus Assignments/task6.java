import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows? ");
        int rows = sc.nextInt();
        System.out.println("Symbol? ");
        String symbol = sc.next();

        System.out.println();
        for(int i = 0; i <= rows; i++){
            for(int spaces = 0; spaces < i; spaces++){
                System.out.print(" ");
            }
            for(int stars = rows; stars > i; stars--){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    
        sc.close();
    }
}
