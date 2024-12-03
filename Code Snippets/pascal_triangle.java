public class pascal_triangle {
    public static void main(String[] args) {

        /*1       1
         *2      1 1
         *3     1 2 1
         *4    1 3 3 1
         *5   1 4 6 4 1
         *6  1 5 10 10 5
         *7 1 6 15 20 15 1
         *
         * given (row, column), print the element
         * e.g. 5th row, 3rd column = 6
         * need to find (r-1)C(c-1)
         */
        int row = 5; int column = 3;
        int n = row - 1;
        int r = column - 1;
        int factorial = 1;
        for(int i = 0; i < r; i++){
            factorial *= n - i;
            factorial /= i+1;
        }
        System.out.println(n + "C" + r + " = " + factorial);

        /*
         * print nth row
         * e.g. 5th row
         * so, 1 4 6 4 1
         */
        int element = 1;
        System.out.print(element + " ");
        for(int i = 1; i < row; i++){
            element *= row - i;
            element /= i;
            System.out.print(element + " ");
        }

        /*
         * print the entire thing, 5 rows
         */
        System.out.println("\n");
        int rows = 5;
        for(int i = 1; i <= rows; i++){
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
        }
    }    
}
