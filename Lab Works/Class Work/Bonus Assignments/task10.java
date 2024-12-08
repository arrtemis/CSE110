import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows? ");
        int rows = sc.nextInt();
        System.out.println("Symbol? ");
        String symbol = sc.next();

        System.out.println();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                if(i == 0 || i == rows-1){
                    System.out.print(symbol + " ");
                }else if(j == 0 || j == rows - 1){
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
