public class odd_digits{
    public static void main(String[] args) {
        int num = 123456, digits = 0;
        while(num != 0){
            digits = num % 10;
            if(digits % 2 == 1){
                System.out.println(digits);
            }
            num /= 10;
        }
    }
}