import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please give the side lengths: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b && b == c){
            System.out.println("This is a Equilateral triangle");
        }else if(a != b && b != c && c != a){
            System.out.println("This is a Scalene triangle");
        }else{
            System.out.println("This is a Isosceles triangle");
        }
        sc.close();

    }
}
