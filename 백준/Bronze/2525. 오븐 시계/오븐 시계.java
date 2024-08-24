import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int minute = in.nextInt();
        int cookTime = in.nextInt();

        minute += cookTime;

        hour += minute / 60;
        minute = minute % 60;

        if (hour > 23) {
            hour -= 24;
        }

        System.out.println(hour + " " + minute);

    }

}
