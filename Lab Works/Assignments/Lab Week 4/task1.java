import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inputs, max = 0, min = Integer.MAX_VALUE, average = 0, sum = 0, num, count = 0;
        inputs = sc.nextInt();

        while(inputs != 0){
            num = sc.nextInt();

            if(num > 0 && num % 2 == 0){
                if(num > max){ max = num; }
                if(num < min){ min = num; }
                count++;
                sum += num;
            }

            if(count == 0){
                average = 0; 
            }else{
                average = sum / count;
            }

            inputs--;
        }
        System.out.println("Max: " + max + "\nMin: " + min + "\nAverage: " + average);
        sc.close();
    }
}
