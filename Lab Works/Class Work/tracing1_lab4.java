public class tracing1_lab4{
    public static void main(String[] args) {
        int p = 9, q = 6, sum = 0;

        while(p > q){
            int r = 1;
            boolean val = (p + q > r + 8);
            while(val){
                if(r % 3 == 0){
                    sum = 17;
                    System.out.println(sum);
                }else if(r % 3 == 1){
                    sum = p + q * r + (int)Math.pow(3 % r, 2);
                    System.out.println(sum);
                }else{
                    System.out.println(p+q+r);
                }
                r++;
                val = (p + q > r + 8);
            }
            p -= 2;
        }
    }
}