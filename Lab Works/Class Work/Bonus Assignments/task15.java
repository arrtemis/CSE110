import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element = 1;

        System.out.println("How many rows of the pascal's triangle? ");
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++){
            
            for(int spaces = row; spaces > i; spaces--){
                System.out.print(" ");
            }

            element = 1;
            System.out.print(element + " ");
            for(int j = 1; j < i; j++){
                element *= i - j;
                element /= j;
                System.out.print(element + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
