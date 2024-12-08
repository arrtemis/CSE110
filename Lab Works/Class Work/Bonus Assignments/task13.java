import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows? ");
        int rows = sc.nextInt();
        System.out.println("Symbol? ");
        String symbol = sc.next();

        System.out.println();
        for(int i = 0; i < rows; i++){
            if(i == rows-1){
                break;
            }
            for(int spaces = rows-1; spaces > i; spaces--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                if(i <= 1 || j == 0 || j == rows-1 || j == i){
                    System.out.print(symbol+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = 0; i < rows; i++){
            for(int spaces = 0; spaces < i; spaces++){
                System.out.print(" ");
            }
            for(int j = rows; j > i; j--){
                if(i >= rows-2 || j == rows || j == i+1){
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
