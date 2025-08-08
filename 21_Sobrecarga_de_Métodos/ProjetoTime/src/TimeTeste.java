public class TimeTeste {
    public static void main(String[] args) {

        Time time = new Time(13, 12, 12);

        System.out.println(time.showUniversalTime());
        System.out.println(time.showDefaultTime());

        time.setTime(
                2
        );

        System.out.println(time.showUniversalTime());
        System.out.println(time.showDefaultTime());

        time.setTime(
                17,
                59
        );

        System.out.println(time.showUniversalTime());
        System.out.println(time.showDefaultTime());

        time.setTime(
                23,
                7,
                59
        );

        System.out.println(time.showUniversalTime());
        System.out.println(time.showDefaultTime());

    }
}
