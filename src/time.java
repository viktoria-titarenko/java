public class time {

    public static void main(String[] args) {
        final int milli_per_second = 1000;
        final int second_per_minute = 60;
        final int minute_per_hour = 60;
        final int hour_per_day = 24;
        long milliseconds, seconds, seconds_now, minutes, minutes_now, hour, hour_now;
        milliseconds = System.currentTimeMillis();
        seconds = milliseconds/milli_per_second;
        seconds_now = seconds % second_per_minute;
        minutes = seconds / second_per_minute;
        minutes_now = minutes % minute_per_hour;
        hour = minutes / minute_per_hour;
        hour_now = hour % hour_per_day;
        hour_now +=7;

        System.out.println(hour_now + ":" +  minutes_now + ":" + seconds_now
        );
    }}
