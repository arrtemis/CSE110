import java.util.Scanner;

public class nested_for_loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        String symbol = "";

        System.out.println("Rows? ");
        rows = sc.nextInt();
        System.out.println("symbol? ");
        symbol = sc.next();

        System.out.println("\nTriangle");
        //triangle (rhs)
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        System.out.println("\nReverse Triangle");
        //upside-down triangle (rhs)
        for(int i = 1; i <= rows; i++){
            for(int j = rows; j >= i; j--){
                System.out.print(symbol);
            }
            System.out.println();
        }

        System.out.println("\nboth");
        //both
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        for(int i = 2; i <= rows; i++){
            for(int j = rows; j >= i; j--){
                System.out.print(symbol);
            }
            System.out.println();
        }

        System.out.println("\nLeftie triangle");
        //triangle(Lhs)
        for(int i = 0; i <= rows; i++){
            for(int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        
        System.out.println("\n2D pyramid");
        //2D Pyramid
        for(int i = 0; i < rows; i++){
            for(int j = rows; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }  

        //pascal's triangle
        int element;
        System.out.println("\nPascal's Triangle");
        for(int i = 1; i <= rows; i++){
            if(rows <= 4){
                for(int j = rows; j > i; j--){
                    System.out.print(" ");
                }
                element = 1;
                System.out.print(element + " ");
                for(int j = 1; j < i; j++){
                    element *= i - j;
                    element /= j;
                    System.out.print(element + " ");
                }
                System.out.println();
            }else{
                element = 1;
                System.out.print(element + " ");
                for(int j = 1; j < i; j++){
                    element *= i - j;
                    element /= j;
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            
        }
        sc.close();
    }
}