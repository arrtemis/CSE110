public class palindromes {
    public static void main(String[] args) {
        int palindrome = 132231, num1 = palindrome, digits = 0, reverse = 0;
        while(palindrome != 0){
            digits = palindrome % 10;
            reverse = reverse * 10 + digits;
            palindrome /= 10;
        }
        if(reverse == num1){
            System.out.println("number is palindromic");
        }else{
            System.out.println("Number is not palindromic");
        }
    }
}
