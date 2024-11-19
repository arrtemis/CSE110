import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        double a,b,c,max,min;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 3 numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        //find the maximum
        if(a > b){
            if(a > c){
                max = a;
            }else{
                max = c;
            }
        }else{
            if(b > c){
                max = b;
            }else{
                max = c;
            }
        }

        //find te minimum
        if(a < b){
            if(a < c){
                min = a;
            }else{
                min = c;
            }
        }else{
            if(b < c){
                min = b;
            }else{
                min = c;
            }
        }
        System.err.println(max + "  " + min);
        sc.close();
    }
}
