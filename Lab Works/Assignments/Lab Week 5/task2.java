import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reversed = "";

        for(int i = 1; i <= word.length(); i++){
            reversed += word.charAt(word.length() - i);
        }
        
        System.out.println(reversed.equals(word));
        sc.close();
    }
}
