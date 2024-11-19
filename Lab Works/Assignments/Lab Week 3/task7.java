import java.util.Scanner;

public class task7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give a number: ");
    int num1 = sc.nextInt();

    System.out.println("Divisors of " + num1 + ": ");

    for(int i = 1; i <= num1; i++){
      if(num1 % i == 0){
        System.out.println(i);
      }
    }
    sc.close();
  }
}