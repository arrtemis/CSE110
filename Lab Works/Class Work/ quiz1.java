public class quiz1{
    public static void main(String[] args) {
    //set A
    int years, days_in_week, weeks, leap_years, days;
    years = 7000;
    days_in_week = 7;
    leap_years = years/7;
    days = 365*years + leap_years;
    weeks = days / days_in_week;
    days %= days_in_week;
    System.out.println("Approximately " + weeks + " weeks and " + days + " days\n");

    //set B;
    double er = 115, fc = 6500;
    double bdt = er/100 * fc;
    System.out.printf("Converted amount: %.2f BDT\n", bdt);
    System.out.printf("Final amount: %.2f BDT", bdt*.9);
    
    }
}
