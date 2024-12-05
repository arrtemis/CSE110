public class mid_q1 {
    public static void main(String[] args) {
        int n = 15489723, m = n, digits, sum_digits, rev = 0;

        while(n / 10 != 0){
            digits = n % 100;
            sum_digits = (digits / 10 + digits % 10) % 10; 
            n = (n/100) * 10 + sum_digits;
        }
        System.out.println("checksum: " + n);

        if(n % 2 == 0){
            System.out.println("Checksum is even");
        }else{
            System.out.println("Checksum is odd");
        }

        while(m != 0){
            digits = m % 10;
            rev = rev*10 + digits;
            m /=10;
        }
        digits = 0;

        if(n % 2 == 0){
            System.out.print("Even digits of the number: ");
            while(rev != 0){
                digits = rev % 10;
                if(digits % 2 == 0){
                    System.out.print(digits + " ");
                }
                rev /= 10;
            }
        }else{
            System.out.print("Odd digits of the number: ");
            while(rev != 0){
                digits = rev % 10;
                if(digits % 2 == 1){
                    System.out.print(digits + " ");
                }
                rev /= 10;
            }
        }
    }
}
