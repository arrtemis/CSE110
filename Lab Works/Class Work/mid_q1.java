public class mid_q1 {
    public static void main(String[] args) {
        int n = 15498934, m = n, power = 1, digits, ao = n, ao_digits, sum_digits, count = 0;

        while(n / 10 != 0){
            digits = n % 100;
            sum_digits = digits / 10 + digits % 10; 
            if(sum_digits >= 10){
                sum_digits %= 10;
            }
            n = (n/100) * 10 + sum_digits;
        }
        System.out.println("checksum: " + n);

        while(m != 0){
            count++;
            m /= 10;
        }
        for(int i = 2; i <= count; i++){
            power *= 10;
        }
        while(ao != 0){
            ao_digits = ao / power;
            if(ao_digits % 2 == 0 && n % 2 == 0){
                System.out.print(ao_digits + " ");
            }else if(ao_digits % 2 == 1 && n % 2 == 1){
                System.out.print(ao_digits + " ");
            }
            ao %= power;
            power /= 10;
        }
    }
}
