public class task17 {
    public static void main(String[] args) {
        int a = 2, b = 5, c = 8;
        //simplifying d = ( 2b * (c-a)/3 ) + 7, we get d = 2bc/3 - 2ab/3 + 7
        int result = ((2*b*c) / 3) - ((2*a*b)/3) + 7;
        System.out.println(result);
    }
}
