import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please provide a number: ");
        int num1 = sc.nextInt(), count = 0;

        while(num1 != 0){
            count++;
            num1 /= 10;
        }
        
        System.out.println("Total digits = " + count);

        sc.close();
    }
}
