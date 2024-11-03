public class variables_and_data_types{
    public static void main(String[] args) {
        //question A
        int a = 15, b = 4;
        System.out.println(a+b);
        float a1 = a, b1 = b;
        String a2 = Integer.toString(a), b2 = Integer.toString(b);
        System.out.println(a1+b1);
        System.out.println(a1==a);
        System.out.println(a2+b2);
        System.out.println(a2+"Hi"+b2);
        System.out.println("Hi"+Integer.toString(b+1));

        //question B
        int x = 5, y = 7;
        System.out.println(x+y);
        float x1 = x, y1 = y;
        String x2 = Integer.toString(x), y2 = Integer.toString(y);
        System.out.println(x1+y1);
        System.out.println(x2+y2);

        //question E
        //lossy conversion aka narrow type casting
        float f1= 2.56f;
        float f2 = (float)5.56;
        long l1 = (long)2.5;
        byte b_1 = (byte)6.7;
        System.out.println(f1 + f2 + l1 + b_1);
    }
}
