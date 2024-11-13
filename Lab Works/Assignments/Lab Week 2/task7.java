import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Please enter your id: ");
        id = sc.nextInt();
        int year = (id / 100000) / 10;
        int session = (id / 100000) % 10;

        if(id / 10000000 <= 9 && id / 10000000 >= 1){
            if(session == 1){
                System.out.println("Student joined BRAC in Spring " + year);
            }else if(session == 2){
                System.out.println("Student joined BRAC in Fall " + year);
            }else if(session == 3){
                System.out.println("Student joined BRAC in Summer " + year);
            }else{
                System.out.println("invalid id");
            }
        }else{
            System.out.println("invalid id");
        }

        sc.close();
    }
}
