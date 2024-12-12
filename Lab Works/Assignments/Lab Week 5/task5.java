import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        int vowels = 0, consonants = 0;

        for(int i = 0; i < phrase.length(); i++){
            char letter = phrase.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        if((vowels > 0 && vowels % 3 == 0) && (consonants > 0 && consonants % 5 == 0)){
            System.out.println("Aaarr! Me Plunder!!");
        }else{
            System.out.println("Blimey! No Plunder!!");
        }
        sc.close();
    }
}
