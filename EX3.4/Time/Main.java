package Time;

public class Main {
    public static void main(String[] args) {
        try {
            MyTime time = new MyTime(23, 59, 59);
            System.out.println("Initial time: " + time);

            time.nextSecond();
            System.out.println("After next second: " + time);

            time.nextMinute();
            System.out.println("After next minute: " + time);

            time.nextHour();
            System.out.println("After next hour: " + time);

            time.previousSecond();
            System.out.println("After previous second: " + time);

            time.previousMinute();
            System.out.println("After previous minute: " + time);

            time.previousHour();
            System.out.println("After previous hour: " + time);

            // Testing invalid time
            try {
                time.setTime(24, 0, 0); // Invalid hour
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            try {
                time.setMinute(60); // Invalid minute
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            try {
                time.setSecond(60); // Invalid second
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Testing valid time setting
            time.setTime(12, 30, 45);
            System.out.println("Updated time: " + time);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}