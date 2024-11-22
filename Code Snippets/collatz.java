public class collatz {
    public static void main(String[] args) {
        int n = 6;

        System.out.print(n + ", ");
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
                if(n != 1){
                    System.out.print(n + ", ");
                }else{
                    System.out.println(n);
                }
            }else{
                n = 3*n + 1;
                System.out.print(n + ", ");
            }
        }
    }
}
