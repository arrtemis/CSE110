public class task18 {
    public static void main(String[] args) {
        System.out.println("using example ID");
        int id = 23221454;
        int rightmost_1 = id % 10;
        int rightmost_2 = (id % 100) / 10;
        System.out.println(rightmost_1 + "" + rightmost_2);

        System.out.println("using my ID");
        int id_personal = 24201102;
        rightmost_1 = id_personal % 10;
        rightmost_2 = (id_personal % 100) / 10;
        System.out.println(rightmost_1 + "" + rightmost_2);
    }
}
