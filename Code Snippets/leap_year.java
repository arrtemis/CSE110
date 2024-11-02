import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");

        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            if(year >= 2024){
                System.out.println(year + " will be a leap year");
            }else{
                System.out.println(year + " was a leap year");
            }
        }else{
            if(year >= 2024){
                System.out.println(year + " will not be a leap year");
            }else{
                System.out.println(year + " was not a leap year");
            }
        }
        scanner.close();
    }
    
}