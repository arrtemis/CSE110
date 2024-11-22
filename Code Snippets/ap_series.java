public class ap_series {
    public static void main(String[] args) {
    int a = 10, d = 20, l = 134;
    int n = ((l - a) / d) + 1;
    for(int i = 1; i <= n; i++){
        if(i == n) System.out.println(a);
        else System.out.print(a + ", ");

        a += d;
    }
    }
}
