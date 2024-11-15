public class quiz_past {
    public static void main(String[] args) {
        int money = 1910;
        int five_h = 0, two_h = 0, twenty = 0;
        if(money > 0){
            if(money >= 500){
                five_h = money / 500;
                money %= 500;
            }
            if(money >= 200){
                two_h = money / 200;
                money %= 200;
            }
            if(money >= 20){
                twenty = money / 20;
                money %= 20;
            }
            System.out.println("500Tk. note = " + five_h + "\n200Tk. note = " + two_h + "\n20Tk. note = " + twenty + "\nLeft = " + money + "Tk.");
        }
    }
}
