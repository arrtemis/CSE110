import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int salary, age;
        double tax = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        age = sc.nextInt();
        System.out.print("Please enter your salary: ");
        salary = sc.nextInt();

        if(age >= 18 && salary > 10000){
            if(salary >= 10000 && salary <= 20000){
                tax = salary * .05;
                System.out.println("Your tax amount is " + tax + " Tk");
            }else if(salary > 20000){
                tax = salary * .1;
                System.out.println("Your tax amount is " + tax + " Tk");
            }
        }else{
            System.out.println("Your tax amount is " + tax + " Tk");
        }

    }
}
