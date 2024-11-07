import java.util.Scanner;

public class quiz_1 {
    public static void main(String[] args) {
        double id, courses, total_payment;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();   
        System.out.println("Enter your ID: ");
        id = sc.nextInt();
        System.out.println("Enter number of courses: ");
        courses = sc.nextInt();
        total_payment = 22500 * courses * (1.25);

        //123456 / 100000  
        if(id / 100000 >= 1 && id / 100000 < 10){
            if(courses > 3){
                System.out.println("need to pay: " + total_payment*(.95) ); 
            }else{
                System.out.println("need to pay: " + total_payment ); 
            }
        }
        sc.close();
    }
}
