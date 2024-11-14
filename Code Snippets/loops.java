public class loops {
    public static void main(String[] args) {
        int i;
        //print all multiples of 7 between 1 and 120
        for(i = 7; i <= 120; i+=7){
            if(i % 7 == 0){
                if(i == 119){
                    System.out.println(i);
                }else{
                    System.out.print(i + " ");
                }
            }
        }

        //sum of numbers
        int result = 0;
        for(i = 1; i <= 100; i++){
            result += i;
        }
        System.out.println(result);

        //product of numbers
        int product = 1;
        for(i = 1; i <= 25; i ++){
            product *= i;
        }
        System.out.println(product);

        //factorial
        int num1, factorial = 1;
        for(num1 = 5; num1 >= 1; num1--){
            factorial *= num1;
        }
        System.out.println("5! = " + factorial);

        //ap series sum
        int a = 5, sum = 0, d = 8, n = 15;
        int l = a + (n-1) * d;
        for(a = a; a <= l; a += d){
            sum += a;
        }
        System.out.println("sum = " + sum);

        //gp series sum
        double a_gp = 5, sum_gp = 0, r = 2; n = 10;
        double l_gp = 5 * Math.pow(r, n-1);
        for(a_gp = a_gp; a_gp <= l_gp; a_gp *= r){
            sum_gp += a_gp;
        }
        System.out.println("sum = " + sum_gp);
    }
}
