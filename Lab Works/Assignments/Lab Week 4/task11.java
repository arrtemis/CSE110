import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, digit = 0, result = 0, j;

        System.out.print("Start: ");
        start = sc.nextInt();
        System.out.print("End: ");
        end = sc.nextInt();

        System.out.println("Armstrong numbers: ");
        for(int i = start; i <= end; i++){
            j = i;
            while (j != 0) {
                digit = j % 10;
                result += (digit * digit * digit);
                j /= 10;
            }
            if (result == i) {
                System.out.println(i);   
            }
            
            start++;
            result = 0;
        }
        sc.close();
    }
}
