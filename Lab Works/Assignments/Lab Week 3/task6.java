import java.util.Scanner;

public class task6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("n = ?");
    int n = sc.nextInt(), sum = 0;
    for(int i = 1; i <= n; i++){
      if(i % 2 == 1){
        sum += i*i;
      }else{
        sum -= i*i;
      }
    }
    System.out.println(sum);
    sc.close();
  }
}