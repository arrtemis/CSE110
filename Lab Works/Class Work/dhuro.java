public class dhuro {
    public static void main(String[] args) {
        int a = 10;
        int b = 150500;
        double sum = a / 1.0;
        int n = 1;
        while (b / a != 0) {
            System.out.println("\nIteration " + n);
            n++;
            sum += 1.2;
            System.out.println("line 9 = " + sum);
            sum = b % 3 + (--a) * 2 + sum;
            System.out.println("line 11 sum = " + sum + " a = " + a);
            if (a >= 6) {
                System.out.println((int) sum);
            } else {
                System.out.println(sum);
            }
            System.out.print("b = " + b + "/" + a + " = ");
            b = b / a;
            System.out.println(b);
        }
    }
}
