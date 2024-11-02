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
        scanner.close();
    }
}
