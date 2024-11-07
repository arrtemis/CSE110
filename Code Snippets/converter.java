public class converter {
    public static void main(String[] args) {
        int seconds = 10000;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;
        System.out.println("hours = " + hours + "\nminutes = " + minutes + "\nseconds = " + seconds);
    }
}
