import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows? ");
        int rows = sc.nextInt();
        System.out.println("Symbol? ");
        String symbol = sc.next();

        System.out.println();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
