import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x > y && x != y){
            System.out.println("first is greater");
        }else if(x == y){
            System.out.println("the numbers are equal");
        }else{
            System.out.println("second is greater");
        }
    }

}