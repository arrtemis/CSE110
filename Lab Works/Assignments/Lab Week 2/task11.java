import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner keypad = new Scanner(System.in);
        int due, paid, change;
        int hundreds = 0,
            fifties = 0,
            twenties = 0,
            tens = 0,
            five = 0,
            two = 0,
            one = 0;

        System.out.print("Amount to be paid: ");
        due = keypad.nextInt();
        System.out.print("Amount given: ");
        paid = keypad.nextInt();
        
        change = paid - due;

        if(change < 0){
            System.out.println("Please pay " + -change + " taka more");
        }else if(change > 0){
            if(change >= 100){
                hundreds = change / 100;
                change %= 100;
            }
            if(change >= 50){
                fifties = change / 50;
                change %= 50;
            }
            if(change >= 20){
                twenties = change / 20;
                change %= 20;
            }
            if(change >= 10){
                tens = change / 10;
                change %= 10;
            }
            if(change >= 5){
                five = change / 5;
                change %= 5;
            }
            if(change >= 2){
                two = change / 2;
                change %= 2;
            }
            if(change >= 1){
                one = 1;
            }
            System.out.println("100 taka note: " + hundreds);
            System.out.println("50 taka note: " + fifties);
            System.out.println("20 taka note: " + twenties);
            System.out.println("10 taka note: " + tens);
            System.out.println("5 taka coin: " + five);
            System.out.println("2 taka coin: " + two);
            System.out.println("1 taka coin: " + one);
        }else{
            System.out.println("The returned amount is 0 taka.");
        }
    keypad.close();
    }
}
