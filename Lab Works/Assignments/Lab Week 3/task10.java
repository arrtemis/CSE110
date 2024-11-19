import java.util.Scanner;

public class task10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1;
    
    System.out.print("Please enter a number: ");
    num1 = sc.nextInt();

    for(int i = 1; i <= num1; i++){
      if(i % 5 == 0 && i % 3 != 0){
        System.out.println(i);
      }
    }
    sc.close();
  }
}