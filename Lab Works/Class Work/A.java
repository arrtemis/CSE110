public class A {
    public static void main(String args[]) {
        int p = 3, q = 7, result = 0, n = 0, m = 0;
        while (p % q == 3) {
            n++;
            System.out.println("\nouter iteration " + n);
            System.out.println("q = " + q + " p = " + p);
            q = p % 5 + 12;
            System.out.println("q = " + q + " p = " + p);
            while (q > 4) {
                m++;
                System.out.println("\ninner iteration " + m);
                if ((result != 10) && (result < 18)) {
                    System.out.println("if successful");
                    p += 1;
                    System.out.println("line 15 = " + p);
                    result += p % 2 * q + q / p;
                    System.out.println("line 17 = " + result);
                } else {
                    System.out.println("else successful");
                    System.out.println("q = " + q);
                    result = q++;
                    System.out.println("now result = " + result + " q = " + q);
                    p = 1 + (--result);
                    System.out.println("after p = 1 + (--result) result = " + result + " p = " + p);

                }
                System.out.println(result);
                q -= 3;
                System.out.println(q);
            }
        }
        p += 4;
        System.out.println(p);
    }
}
