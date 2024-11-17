import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people, age, price = 0;
        System.out.println("how many people? ");
        people = sc.nextInt();
        for(int i = 1; i <= people; i++){
            System.out.println("Age of person no. " + i + "?");
            age = sc.nextInt();
            if(age >= 5 && age < 12){
                price += 10;
            }else if(age >= 12){
                price += 20;
            }
        }
        System.out.println("Total price is: " + price);

    }
}
