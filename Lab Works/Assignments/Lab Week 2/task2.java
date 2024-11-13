import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String grade = "F";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        int marks = sc.nextInt();
        if(marks <= 100 && marks >= 0){
            if(marks >= 90 && marks <= 100){
                grade = "A";
            }
            if(marks <= 89 && marks >= 85){
                grade = "A-";
            }
        }else{
            System.out.println(marks + " is not a valid mark");
        }
        System.out.println("Your grade is: " + grade);
    }
}
