import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows? ");
        int rows = sc.nextInt();
        System.out.println("Symbol? ");
        String symbol = sc.next();

        System.out.println();
        for(int i = 0; i < rows; i++){
            for(int spaces = 0; spaces < i; spaces++){
                System.out.print(" ");
            }
            for(int j = rows; j > i; j--){
                if(i == 0 || i >= rows-2 || j == rows || j == i+1){
                    System.out.print(symbol + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
