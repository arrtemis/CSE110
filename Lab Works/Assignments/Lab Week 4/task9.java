import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int spaces = rows; spaces > i; spaces--){
                System.out.print(" ");
            }
            for(int numbers = 1; numbers <= i; numbers++){
                System.out.print(numbers);
            }
            System.out.println();
        }
        sc.close();
    }
}
