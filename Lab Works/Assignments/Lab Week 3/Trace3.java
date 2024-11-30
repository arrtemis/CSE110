public class Trace3 {
    public static void main(String[] args) {
      int m = 17, n = 13, p = 1, sum = 30, i = 0;
      while(0 < p % 10){
         i++;
         System.out.println("\nIteration no. " + i);
         System.out.println("p % 10 = " + p + "(p) " + "% 10 = " + p%10);
         System.out.println("m % 10 = " + m % 10);

         if(m % 10 == 0){
            System.out.println("sum = " + sum + "(sum) * " + m + "(m) % " + n +"(n) + " + p + "(p) / " + n + "(n) ");
            System.out.println("sum = " + sum * m + " % " + n  + " + " + p / n);
            System.out.println("sum = " + sum * m % n  + " + " + p / n);
            sum = sum * m % n + p / n ;
         }
         else{
            System.out.println("m % 4 = " + m % 4);
            if(m % 4 == 0){
               System.out.print("sum = " + sum);
               sum += n + (--m);
               System.out.println("(sum) + " + n + "(n) + " + m + "(m)");
               System.out.println("--m = " + m);
            }
            else{
               System.out.println("sum = " + sum + "(sum) - " + m +"(m)");
               sum -= m--;
               System.out.println("m-- = " + m);
            }
         }
         p+=1;
         System.out.println("sum = " + sum);
      }
      System.out.println(!(n%13 == 0) && !false || p>10);
    }
  }
  
  