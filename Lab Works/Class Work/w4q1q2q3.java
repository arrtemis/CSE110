public class w4q1q2q3{
    public static void main(String[] args){
        int num = 4224179, digits = 0, sum = 0, new_num = 0;
        while(num != 0){
            digits = num % 10;
            if(digits % 2 == 0){
                sum += digits;
            }else{
                new_num = new_num * 10 + digits;
            }
            num /= 10;
        }
        System.out.println(sum + "' Latitutde" + "\n" + new_num + "' Longitude");
    }
}