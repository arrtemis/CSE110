public class mid_q3 {
    public static void main(String[] args) {
        int i = 3, sum = 0, t = 4;
        int k = 4, j = 0;
        boolean flag = true;
        int n = 0;
        while (j < 7) {
            System.out.println("\nIteration = " + n);
            n++;

            i++;
            System.out.println("line 7 = "+ i);
            if (flag == true) {
                System.out.println("if successful");
                System.out.println("sum = " + sum + " t = " + t + " i = " + i);
                sum += t-- - i + 2 - 3 * k;
                System.out.println("sum = " + sum + " t = " + t + " i = " + i);
                System.out.println(sum++);
                System.out.println("sum = " + sum + " t = " + t + " i = " + i);
            } else {
                System.out.println("else successful");
                System.out.println("sum = " + sum + " t = " + t + " i = " + i);
                sum += t++ % i + 3 - 5 * k;
                System.out.println("sum = " + sum + " t = " + t + " i = " + i);
                System.out.println(sum--);
                System.out.println("sum = " + sum + " t = " + t + " i = " + i);
            }
            flag = !flag;
            j++;
        }
    }
}
