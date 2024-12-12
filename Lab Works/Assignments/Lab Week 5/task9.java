import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passwd = sc.nextLine();
        int uppercase = 0,
            lowercase = 0,
            digits = 0,
            sp_char = 0;

        if (passwd.length() >= 8) {
            for(int i = 0; i < passwd.length(); i++){
                if(passwd.charAt(i) >= 'A' && passwd.charAt(i) <= 'Z') uppercase++;
                else if(passwd.charAt(i) >= 'a' && passwd.charAt(i) <= 'z') lowercase++;
                else if(passwd.charAt(i) >= '0' && passwd.charAt(i) <= '9') digits++;
                else sp_char++;
            }

            if(uppercase >= 1 && lowercase >= 1 && digits >= 1 && sp_char >= 1){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }else{
            System.out.println("False");
        }
        
        sc.close();
    }
}