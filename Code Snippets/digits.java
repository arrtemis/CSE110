public class digits {
    public static void main(String[] args) {
        int num1 = 1345234563, count = 0, even = 0, odd = 0, digit, sum = 0, result = 0;
        int i = num1;

        while(i != 0){
            count++;
            i /= 10;
        }
        i = num1;
        System.out.println("Number of digts in " + num1 + " is: " + count);

        while(i != 0){
            digit = i % 10;
            if(digit % 2 == 0){
                even++;
            }else{
                odd++;
            }
            i /= 10;
        }
        i = num1;
        System.out.println("Number of odd digits in " + num1 + " is: " + odd +  "\nNumber of even digits in " + num1 + " is: " + even);

        while(i != 0){
            digit = i % 10;
            sum += digit;
            i /= 10;
        }
        System.out.println("Sum of the numbers = " + sum);


        //armstrong numbers;
        int arm_num = 153;
        int j = arm_num;
        while (j != 0) {
            digit = j % 10;
            result += (digit * digit * digit);
            j /= 10;
        }if (result == arm_num) {
            System.out.println(arm_num + " is an armstrong number");   
        }
        
    }
}
