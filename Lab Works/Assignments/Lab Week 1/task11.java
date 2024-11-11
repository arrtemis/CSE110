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
        sum = num3 + num4; //23.0 + 24.0 = 47.0
        product = num3 * num4; //23.0 * 24.0 = 552.0
        quotient = num3 / num4; //23.0 / 24.0 = 0.958 (truncated)
        System.out.println("Sum = " + sum + "\nProduct = " + product + "\nQuotient = " + quotient);

        //2.5
        int num5 = 90;
        double num6 = 10;
        sum = num5 + num6; //90.0(int -> double) + 10.0 = 100.0
        product = num5 * num6; //90.0(int -> double) * 10 = 900.0
        quotient = num5 / num6; //90.0(int -> double) / 10 = 9.0
        System.out.println("Sum = " + sum + "\nProduct = " + product + "\nQuotient = " + quotient);

        //2.6
        String str1 = "cse110", str2 = " is fun";
        String addition_str = str1 + str2; //"cse110" + "is fun" = "cse110 is fun"
        System.out.println("Addition of strings = " + sum_str + "\nAddition of an int and string = invalid");
        //the addition operator joins two string together.
        
        //if the first variable was an int and the second variable was a string and vice versa then the addition would still be valid, e.g:
        System.out.println(num1 + str1);

    }
}
