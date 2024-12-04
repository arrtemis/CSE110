import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if(num >= 0){
                System.out.println(num + " ^ 2 = " + (int)Math.pow(num, 2));
            }else{
                break;
            }
        }
        sc.close();
    }
}
