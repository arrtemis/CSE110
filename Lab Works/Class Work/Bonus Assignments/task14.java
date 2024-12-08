import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0; 
        System.out.println("Rows? ");
        int rows = sc.nextInt();

        System.out.println();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(++a + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
