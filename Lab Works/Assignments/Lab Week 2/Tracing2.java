
public class Tracing2 {
    public static void main(String[] args) {
        boolean var1, var2, var3, var4, var5, var6;
        boolean result1, result2, result3, result4, result5;
        boolean result6, result7, result8, result9, result10;
        var1 = var2 = var3 = var4 = var5 = var6 = false;
        result1 = result2 = result3 = result4 = result5 = false;
        result6 = result7 = result8 = result9 = result10 = false;
        var1 = (!false || false) && true;
        var2 = var1 && true;
        var3 = false && !true;
        var4 = true;
        var5 = false;
        var6 = var3 && true;
        result1 = (var1 && var2) && (40 % 3 > 45) || (var5 && var6);
        result2 = (var1 || var2) || (result1 && false);
        result3 = (var1 && result1) || result2 || var5;
        result4 = (var1 || var2) || ((var3 && var1) && false);
        result5 = (var1 && var2) && (result3 || var1);
        result6 = ((var3 || !var2) && result5) || true;
        result7 = (var4 && result1) && ((result1 && false) || true);
        result8 = ((var1 && result3) && (!var5 || var6)) && true;
        result9 = ((result2 && var2) || (!result7 && var1)) && !false;
        result10 = !(var1 && true);
        System.out.println(result1 + " " + result2);
        System.out.println(result3 + " " + result4);
        System.out.println(result5 + " " + result6);
        System.out.println(result7 + " " + result8);
        System.out.println(result9 + " " + result10);
    }
}
