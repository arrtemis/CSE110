public class reverse {
    public static void main(String[] args) {
        int num1 = 123;
        int last_num = num1 % 10;
        int first_num = num1 / 100;
        int middle_num = num1 - 100 * first_num - last_num;
        int rev_num = last_num * 100 + middle_num + first_num;
        System.out.println(rev_num);
    }
}
