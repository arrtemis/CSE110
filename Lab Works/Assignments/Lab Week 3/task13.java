public class task13 {
    public static void main(String[] args) {
        int num1 = 32768, digits, counter = num1, count = 0, product = 1;

        //count the number of digits
        while(counter != 0){
            count++;
            counter /= 10;
        }
        
        //calculate starting power of ten
        for(int i = 2; i <= count; i++){
            product *= 10;
        }

        //print the numbers
        for(int j = 1; j <= count; j++){
            digits = num1 / product;
            num1 %= product;
            product /= 10;

            if(j == count){
                System.out.println(digits);
            }else{
                System.out.print(digits + ", ");
            }
        }
    }
}
