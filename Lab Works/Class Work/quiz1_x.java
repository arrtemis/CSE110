public class quiz1_x {
    public static void main(String[] args) {
        int num1 = 762853;
        int x = num1 / 10000;
        int y = (num1 / 100 ) % 100;
        int z = num1 % 100;

        double result_intermediate = ((x*x + y*y + z*z) / 3);
        double result = Math.sqrt(result_intermediate);

        System.out.printf("%.2f\n",result);

    }
}
