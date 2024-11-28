public class mid_q2 {
    public static void main(String[] args) {
        int savings = 21000, members = 7, sajek_double_bed_cost = 400, srimangal_double_bed_cost = 200, money_left, each_share;
        double total_cost = 0.0;
        total_cost = ((members+1) / 2.0) * sajek_double_bed_cost;
        if(savings >= total_cost){
            System.out.println("we are going to sajek");
            money_left = savings - (int)total_cost;
            each_share = money_left / members;
            System.out.println(each_share);
        }else{
            total_cost = ((members+1) / 2) * srimangal_double_bed_cost;
            if(savings >= total_cost){
                System.out.println("we're going to Srimangal");
                money_left = savings - (int)total_cost;
                each_share = money_left / members;
                System.out.println(each_share);
            }else{
                System.out.println("I need to have more savings to afford a family trip;");
            }
        }
    }
}
