import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String temp = "";

        for(int i = 1; i <= word.length(); i++){
            temp += word.charAt(word.length() - i);
        }

        System.out.println(temp);
        sc.close();
    }    
}