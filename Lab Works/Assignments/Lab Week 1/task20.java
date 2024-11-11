public class task20 {
    public static void main(String[] args) {
        double a = 4.5, b = 9.5, c = Math.sqrt(a*a + b*b);

        double sinA = a/c, sinB = b/c, cosA = b/c, cosB = a/c;

        System.out.println("sin and cosine values of angle A");
        System.out.println("sinA = " + sinA + "\ncosA = " + cosA);
        
        System.out.println("\nsin and cosine values of angle B");
        System.out.println("sinB = " + sinB + "\ncosB = " + cosB);
    }
}
