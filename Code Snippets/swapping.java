import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        //two and three number swapping
        Scanner scanner = new Scanner(System.in);

        int numbers, num1, num2, num3, temp;

        System.out.println("How many numbers?");
        numbers = scanner.nextInt();
        switch (numbers) {
            case 2:   
                System.out.println("what are the numbers?");                            
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();

                System.out.println("Before: " + num1 + " " + num2);
                temp = num1;
                num1 = num2;
                num2 = temp;
                System.out.println("After: " + num1 + " " + num2);

                break;
            case 3:   
                System.out.println("what are the numbers?");                            
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                num3 = scanner.nextInt();

                System.out.println("Before: " + num1 + " " + num2 + " " + num3);
                temp = num2;
                num2 = num1;
                num1 = num3;
                num3 = temp;
                System.out.println("After: " + num1 + " " + num2 + " " + num3);

                break;

            default:
                System.out.println("Sorry this program currently doesn't support swapping " + numbers + " numbers");
                break;
        }

        scanner.close();
    }
}
