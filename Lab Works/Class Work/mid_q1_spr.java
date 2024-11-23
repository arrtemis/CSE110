public class mid_q1_spr{
    public static void main(String[] args) {
        int id = 24364589, digits, sum = 0;
        double price_1 = 80.0, price_2 = 60.0, price_3 = 20.0, discount;
        double discounted_price = 0.0;
        String item_1 = "burger", item_2 = "sandwich", item_3 = "water";

        while(id != 0){
            digits = id % 10;
            sum += digits * digits;
            id /= 10;
        }
        discount = (sum % 100) / 100.0;
        System.out.println("Discount = " + discount);
        if(price_1 > price_2){
            if(price_1 > price_3){
                System.out.println(item_1 + " is the item with the highest price " + price_1 + " taka");
                discounted_price = price_1 * (1 - discount) + price_2 + price_3;
            }
        }else{
            if(price_2 > price_3){
                System.out.println(item_2 + " is the item with the highest price " + price_2 + " taka");
                discounted_price = price_1 + price_2 * (1 - discount) + price_3;
            }else{
                System.out.println(item_3 + " is the item with the highest price " + price_3 + " taka");
                discounted_price = price_1 + price_2 + price_3 * (1 - discount);
            }
        }
        System.out.println("Amount before discount: " + (price_1+price_2+price_3) + " taka");
        System.out.println("Amount after discount: " + discounted_price + " taka");
    }
    
}