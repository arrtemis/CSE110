public class Trace2 {
    public static void main(String[] args) {
        int x = 0, p = 0, sum = 0, n = 0;
        p = 1;
        x = 2;
        double q = 0.0;
        sum = 5;
        while (p < 15) {
            n++;
            System.out.println("\nIteration no. " + n);
            System.out.println("\nq = " + x + "(x) + " + p + "(p) - (" + sum + "(sum) + " + (int) (7/4) + ") / 3.0 % 2");
            System.out.println("=> q = " + (x +  p) + " - " + (sum + (int) (7/4)) + " / 3.0 % 2");
            System.out.println("=> q = " + (x  + p) + " - " + (sum + (int) (7/4))  / 3.0 + " % 2");
            System.out.println("=> q = " + (x  + p) + " - " + (sum + (int) (7/4))  / 3.0  % 2);
            
        	q = x + p - (sum + (int) (7 / 4)) / 3.0 % 2;
            System.out.println("Therefore, q = " + q);

            System.out.println("\nsum = " + sum + " + " + x + "(x) + " + (int)q + "(q) ");
        	sum = sum + x + (int) q;
            System.err.print("Therefore, sum = ");
        	x += 1;
        	System.out.println(sum);
            System.out.println("x++: " + x);
        	if (x > 5) {
                System.out.println("\np += (int) (5/2) => p += 2");
            	p += (int) (5 / 2);
                System.out.println("p = " + p);
        	} 
        	else {
                System.out.println("\np += 10 % 3 => p ++");
            	p += 10 % 3;
                System.out.println("p = " + p);
        	}
        }
        sum = sum + p;

        System.out.println("\nfinal: " + sum);
    }
}

