public class task11 {
    public static void main(String[] args) {
        //2.1
        int num1 = 23;
        System.out.println(num1);

        //2.2
        int num2 = 24;
        System.out.println(num1 + num2); // 23 + 24 should equal 47

        //2.3
        System.out.println(num1 *  num2);
        System.out.println(num1 / num2);

        //2.4
        double num3 = 23, num4 = 24, sum, product, quotient;
        sum = num3 + num4;
        product = num3 * num4;
        quotient = num3 / num4;
        System.out.println("Sum = " + sum + "\nProduct = " + product + "\nQuotient = " + quotient);

        //2.5
        int num5 = 23;
        double num6 = 24;
        sum = num5 + num6;
        product = num5 * num6;
        quotient = num5 / num6;
        System.out.println("Sum = " + sum + "\nProduct = " + product + "\nQuotient = " + quotient);

        //2.6
        String str1 = "23", str2 = "24huh";
        String sum_str = str1 + str2;
        String sum_diff =  num1 + str1;
        //int sum_diff_int = num1 + str1; 
        //string cannot be converted to int, hence invalid operation

        System.out.println("Addition of strings = " + sum_str + "\nAddition of an int and string = invalid");

    }
}
