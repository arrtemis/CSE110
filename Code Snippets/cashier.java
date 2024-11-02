import java.util.Scanner;

import java.lang.Math;

public class cashier {
    public static void main(String[] args) {
        //input due and paid amounts
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount the customer needs to pay ");
        int due = scanner.nextInt();
        System.out.println("Enter the amount given ");
        int paid = scanner.nextInt();

        //calcuate change
        int change = paid - due;
        
        int
            hundreds = 0,
            fifty = 0,
            tens = 0,
            twenties = 0,
            five = 0,
            two = 0,
            one = 0;


        //print change/ or extra amount needed based on due and paid amounts
        if (change < 0){
            System.out.println("Please pay " + Math.abs(change) + " taka more.");
        }else if(change > 0){
            System.out.println("The returned amount is " + change + " taka. ");

            if(change >= 100){
                hundreds = change / 100;
                change %= 100;
            }
            if(change >= 50){
                fifty = change / 50;
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
            System.out.println("50 taka note: " + fifty);
            System.out.println("20 taka note: " + twenties);
            System.out.println("10 taka note: " + tens);
            System.out.println("5 taka coin: " + five);
            System.out.println("2 taka coin: " + two);
            System.out.println("1 taka coin: " + one);
        }else{
            System.out.println("The returned amount is 0 taka.");
        }
    scanner.close();
    }
}