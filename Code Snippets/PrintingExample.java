import java.util.Scanner;

public class PrintingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String first_name = scanner.nextLine();
        System.out.println("Please enter middle name: ");
        String middle_name = scanner.nextLine();
        System.out.println("Please enter last name: ");
        String last_name = scanner.nextLine();

        if(middle_name == ""){
            System.out.println(first_name + " " + last_name);
        }else{
            System.out.println(first_name +" "+ middle_name +" "+ last_name);
        }

        //formatted strings;
        int num1 = 24;
        int num2 = -23;
        int big_num = 234567976;
        System.out.printf("%2$,3.2f %1$s\n", "meters", 1260.5052);
        
        // Default
        System.out.printf("%f%n", 123456.78);

        // Two decimal digits
        System.out.printf("%.2f%n", 123456.78);

        // No decimal digits
        System.out.printf("%.0f%n", 123456.78);

        // No decimal digits but keep the decimal point
        System.out.printf("%#.0f%n", 123456.78);

        // Group digits
        System.out.printf("%,.2f%n", 123456.78);

        // Scientific notation with two digits of precision
        System.out.printf("%.2e\n", 123456.78);

        //finally
        float f1 = 212224.3436573f;
        int num3 = 234546;
        System.out.printf("This %1$+,.2f and %2$+,d is showing with printf\n", f1, num3);
        scanner.close();
    }
}
