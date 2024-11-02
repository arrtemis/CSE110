import java.util.Scanner;

public class optimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name: ");

        //Here we declare a variable that will catch all the values
        String whole_name = scanner.nextLine();

        System.out.println("Please enter middle name: ");
        //Now here comes the tricky part. In VB, you can add String values to another Strings.
        //So basically what you do is passing the new value with an extra space before.
        whole_name += ' ' + scanner.nextLine();

        System.out.println("Please enter last name: ");
        //Same process as above!
        whole_name += ' ' + scanner.nextLine();
        //Now to "polisha" our variable: change double spaces with one single space and delete extra spaces at the end.
        whole_name = whole_name.replace("  ", " "); //To avoid no middle name variable
        System.out.println(whole_name.trim()); //Trim cuts starting or ending spaces
        scanner.close();
 
    }
}