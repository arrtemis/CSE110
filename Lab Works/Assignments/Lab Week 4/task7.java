import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, X, Y, sum = 0, a = 0;

        N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            sum = 0;
            
            X = sc.nextInt();
            Y = sc.nextInt();

            if(X % 2 == 0){
                a = ++X;
            }else{
                a = X;
            }

            for(int j = 1; j <= Y; j++){
                sum += a;
                a += 2;
            }

            System.out.println(sum);
        }

        sc.close();

    }
}
