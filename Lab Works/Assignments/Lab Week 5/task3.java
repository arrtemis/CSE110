import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String split_by = sc.next();
        String split = "";

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != split_by.charAt(0)){
                split += input.charAt(i);
            }else{
                System.out.println(split);
                split = "";
            }
        }
        System.out.println(split);
        sc.close();
    }
}
