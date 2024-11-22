public class binary_to_decimal {
    public static void main(String[] args) {
        int binary = 101011, digits, decimal = 0, n = 0;
        while(binary != 0){
            digits = binary % 10;
            decimal += digits * Math.pow(2, n);
            n++;
            binary /= 10; 
        }
        System.out.println(decimal);

    }
}
