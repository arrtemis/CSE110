public class task3{
  public static void main(String[] args){
    int sum = 0;
    for(int i = 63; i <= 600; i ++){ //LCM of 7 and 9 is 63, so we're starting from 63 to cut the number of iterations
      if(i % 63 == 0){
        sum += i;
      }
    }
    System.out.println(sum);
  }
}