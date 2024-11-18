public class task14 {
    public static void main(String[] args) {
        int num1 = -10;
        for(int i = 1; i <= 7; i++){
            if(num1 == 20){
                System.out.println(num1);
            }else{
                System.out.print(num1 + ", ");
            }
            num1 += 5;
        }
    }
}
