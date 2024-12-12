import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean cycle = true;
        char letter;
        String alt_caps = "", temp = "";

        for(int i = 0; i < input.length(); i++){
            letter = input.charAt(i);
            temp += letter;
            if((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
                if(cycle){
                    alt_caps += temp.toLowerCase();
                    cycle = !cycle;
                }else{
                    alt_caps += temp.toUpperCase();
                    cycle = true;
                }
            }else{
                alt_caps += letter;
            }
            temp = "";
        }
        System.out.println(alt_caps);
        sc.close();
    }
}