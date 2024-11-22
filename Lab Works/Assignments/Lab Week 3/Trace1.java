public class Trace1{
  public static void main(String args[]){
    int x = 0, p = 0, sum = 0, n = 1;
    p = 1;
    x = 2;
    double q;
    sum = 0;
    while (p < 12){
      System.out.println("\niteration " + n);
      q =  x + p-(sum+7/3)/3.0%2 ;
      System.out.println("line 10 = " + q);
      sum = sum + (++x) + (int)q;
      System.out.println("line 12, sum = " + sum + " x = " + x);
      System.out.println(sum++);
      System.out.println("line 14 = " + sum);
      if (x > 5){
        p += 4/2;
        System.out.println("if successful = " + p);
      }else{
        p += 3%1;
        System.out.println("else = " + p);
      }
      n++;
    }
    sum = sum + p;
    System.out.println(sum);
  }
}