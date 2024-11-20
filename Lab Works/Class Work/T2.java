public class T2{
    public static void main(String[] args) {
        int x = 0, p = 0, sum = 0;
        p = 1;
        x = 2;
        double q;
        sum = 0;
        while(p < 3){
            q = x + p - (sum - 4/6)/5.0%3;
            sum = (++sum) + (x++) + (int)q;
            System.out.println(sum++);
            if(x > 5){
                p += 4/2;
            }else{
                p -= 3%1;
            }
        }
        sum += p;
        System.out.println(sum);

        System.out.println(5 < 5);
        System.out.println(5 > 5);
    }
}