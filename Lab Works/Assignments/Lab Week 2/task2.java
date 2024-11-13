import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String grade = "F";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        int marks = sc.nextInt();

        if(marks <= 100 && marks >= 0){
            if(marks >= 90){
                grade = "A";
            }
            if(marks >= 85 && marks <= 89){
                grade = "A-";
            }
            if(marks >= 70 && marks <= 84){
                grade = "B";
            }
            if(marks >= 57 && marks <= 69){
                grade = "C";
            }
            if(marks >= 50 && marks <= 56){
                grade = "D";
            }else{
                grade = "F";
            }
        }else{
            System.out.println(marks + " is not a valid mark");
        }
        System.out.println("Your grade is: " + grade);
        
        sc.close();
    }
}
