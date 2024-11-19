import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), digits;

        while(num1 != 0){
            digits = num1 % 10;
            if(num1 / 10 == 0){
                System.out.println(digits);
            }else{
                System.out.print(digits + ", ");
            }
            num1 /= 10;
        }
        sc.close();
    }
}
