import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        int x = scanner.nextInt();
        
        System.out.println("Input the 2nd number: ");
        int y = scanner.nextInt();

        System.out.println("Input the 3rd number: ");
        int z = scanner.nextInt();

        if(x != y && y !=z && z !=x){
            System.out.println("All numbers are different");
        }
        if(x == y && y == z && z == x){
            System.out.println("All numbers are equal");
        }
        scanner.close();
    }
}
