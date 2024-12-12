import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String uppercase = "";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
                uppercase += (char)((int)input.charAt(i) - 32);
            }else{
                uppercase += input.charAt(i);
            }
        }
        System.out.println(uppercase);
        
        sc.close();
    }
}
