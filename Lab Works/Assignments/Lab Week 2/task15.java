public class task15 {
    public static void main(String[] args) {
        int N = 1, sum = 0;
        while(N != 201){
            sum += N;
            N++;
        }
        System.out.println("Sum = " + sum); 
        double avg = sum / 200.0;
        System.out.println("Average = " + avg);
    }
}
