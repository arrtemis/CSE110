public class task9{
  public static void main(String[] args){
    int a = 1, sum = 1;
    for(int i  = 1; i <= 10; i++){
      System.out.println("Current Number: " + i + ", Sum: " + sum);
      sum += ++a;
    }
  }
}
