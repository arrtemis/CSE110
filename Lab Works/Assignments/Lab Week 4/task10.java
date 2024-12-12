import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        
        for(int i = 1; i <= rows; i++){
            for(int spaces = rows*2 - 1; spaces > i*2 - 1; spaces--){
                System.out.print(" ");
            }
            for(int numbers = 1; numbers <= i*2 - 1; numbers++){
                System.out.print(numbers + " ");
            }
        System.out.println();
        }
        sc.close();
    }
}
