public class unary_operators {
    public static void main(String[] args){
        int a,y;
        a = 5;
        y = ++a; 
        System.out.println("y = " + y + " " + "a = " + a);
        
        y = a++;
        System.out.println("y = " + y + " " + "a = " + a);

        int b = 10;
        int z;
        z = ++b;
        System.out.println("z = " + z + " " + "b = " + b);
        z = b++;
        System.out.println("z = " + z + " " + "b = " + b);

        //initialize num1 num2
        int num1 = 5, num2 = 10;

        //num1 6 num2 10
        int num3 = ++num1 + num2--;
        //num1 6 num2 10  num3 16 num2 9
        System.out.println("num1 = " + num1 + " " + "num2 = " + num2 + " num3 = " + num3); 

        //num1 6 num2 9
        num3 = num1-- + num2--;
        //num3 15 num1 5 num2 8
        System.out.println("num1 = " + num1 + " " + "num2 = " + num2 + " num3 = " + num3); 

        //num1 6 num2 7
        num3 = ++num1 + (--num2);
        //num3 13 num1 6 num2 7
        System.out.println("num1 = " + num1 + " " + "num2 = " + num2 + " num3 = " + num3); 
    }
}