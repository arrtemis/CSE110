public class task15 {
    public static void main(String[] args) {
        //a
        int x = 2420, y = 1102, temp;
        System.out.println("a: ");
        System.out.println("Before: x = " + x + ", y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After: x = " + x + ", y = " + y);

        //b
        //x = 1102, y = 2420
        System.out.println("b: ");
        System.out.println("Before: x = " + x + ", y = " + y);
        x += y; //x = 3522
        y = x - y; // y = 3522 - 2420 = 1102
        x -= y; // x = 3522 - 1102 = 1102
        System.out.println("After: x = " + x + ", y = " + y);
    }
}
