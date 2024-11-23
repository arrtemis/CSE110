public class mid_q2_spr {
    public static void main(String[] args) {
        int price = 300, qty = 10;
        if(price < 0 || qty < 0){
            System.out.println("Invalid input");
        }else{
            price *= qty;
            if(price >= 2200){
                System.out.println("VAT APPLIED");
                price += price * 8/100;
            }else{
                System.out.println("No VAT");
            }
        }
        System.out.println("Final amount: " + price);
    }
}
