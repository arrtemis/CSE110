public class task16 {
    public static void main(String[] args) {
        //minutes / 525600
        //(minutes % 525600) / 1440
        int minutes = 3456789;
        int years  = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
