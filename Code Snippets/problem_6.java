public class problem_6 {
    public static void main(String[] args) {
        int n = 4;
        float sum = 0f;
        for(double i = 1; i <= n; i++){
            if(i % 4 != 0){
                sum += 1/i;
            }else{
                sum -= 1/i;
            }
        }
        System.err.printf("%.4f%n", sum);
    }
}
