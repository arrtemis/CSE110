import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input_1 = sc.nextLine();
        String input_2 = sc.nextLine();

        char letter_1, letter_2;
        boolean common = false;
        String common_str = "";
        String temp = "";
        int inputs = 2;

        while(inputs != 0){
            for(int i = 0; i < input_1.length(); i++){
                letter_1 = input_1.charAt(i);
                for(int j = 0; j < input_2.length(); j++){
                    letter_2 = input_2.charAt(j);
                    if(letter_1 == letter_2){
                        common = !common;
                    }
                }
                if(!common){
                    common_str += letter_1;
                }
                common = false;
            }
            temp += input_1;
            input_1 = "";
            input_1 += input_2;
            input_2 = "";
            input_2 += temp;
            inputs--;
        }
        System.out.println(common_str.toUpperCase());
        sc.close();
    }
}