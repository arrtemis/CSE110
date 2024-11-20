public class quiz_2 {
    public static void main(String[] args) {
        int rank = 1, prob_solve = 8, time = 45, penalties = 0, prize_money = 0;
        if(prob_solve >= 5 && time <= 120 && penalties == 0){
            if(rank == 1){
                prize_money = 5000;
            }else if(rank == 2){
                prize_money = 3000;
            }else if(rank == 3){
                prize_money = 2000;
            }else if(rank >= 4 && rank <= 8){
                prize_money = 1000;
            }else if(rank == 9 || rank == 10){
                prize_money = 500;
            }
        }else{
            System.out.println("Not eligible");
        }
        System.out.println("Congratulations! You have won BDT " + prize_money);
    }
}
