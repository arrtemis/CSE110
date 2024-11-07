public class task18 {
    public static void main(String[] args) {
        int id = 23221454;
        int rightmost_1 = id % 10;
        int rightmost_2 = (id % 100) / 10;
        System.out.println(rightmost_1+""+rightmost_2);
    }
}
