import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String temp = "", reversed = "";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                temp += input.charAt(i);
            }else{
                reversed = " " + temp + reversed;
                temp = "";
            }
        }
        System.out.println(temp + reversed);

        sc.close();
    }
}
