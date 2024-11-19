public class task1{
  public static void main(String[] args){
    int num1 = 18;
    for(int i = 1; i <= 6; i ++){
      if(i == 6){
        System.out.println(num1);
      }else{
        System.out.print(num1 + ", ");
      }
      num1 += 9;
    }
  }
}