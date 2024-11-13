import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print("The largest number is: ");
        if(a > b && a > c){
            System.out.println(a);
        }else if(b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
