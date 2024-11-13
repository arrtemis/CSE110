import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.print("Please give a x value for the piecewise function: ");
        x = sc.nextInt();

        if(x < 0){
            y = 2 * x;
        }else if(x >= 0 && x < 2){
            y = x + 1;
        }else if(x >= 2 && x < 5){
            y = x*x -1;
        }else{
            y = 3*Math.pow(x, 2) + 2;
        }

        System.out.println("output: " + y);

        sc.close();
    }
}