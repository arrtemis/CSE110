import java.util.Scanner;

public class task8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int terms, sum = 0, a = 1;

    System.out.println("Number of terms: ");
    terms = sc.nextInt();

    System.out.println("The odd numbers are: ");
    for(int i = 1; i <= terms; i++){
        System.out.println(a);
        sum += a;
        a += 2;
    }
    System.out.println("The sum of odd natural numbers up to " + terms + " terms is: "  + sum);
    sc.close();
  }
}