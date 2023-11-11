import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TwoDotTwo {
    public static int printTime(int n) {
        int nCopy = n;
        if (n <= 0) {
            System.out.println("Уже началось!");
            return 0;
        }
        int days = n / 1440;
        n %= 1440;
        int hours = n / 60;
        n %= 60;
        int minutes = n;
        String strDays = getDaysStr(days);
        String strHours = getHoursStr(hours);
        String strMinutes = getMinutesStr(minutes);

        System.out.println(nCopy + " - это " + strDays + ", " + strHours + ", " + strMinutes + ".");

        return 0;
    }

    private static String getDaysStr(int days) {
        String d = String.valueOf(days);

        if (d.charAt(0) == '1' && d.length() == 2) {
            return days + " дней";
        }
        if (days % 10 == 1) {
            return days + " день";
        }
        if (days % 10 == 2 || days % 10 == 3 || days % 10 == 4) {
            return days + " дня";
        } else {
            return days + " дней";
        }
    }

    private static String getHoursStr(int hours) {
        String h = String.valueOf(hours);
        if (h.charAt(0) == 1 && h.length() == 2) {
            return hours + " часов";
        }
        if (hours % 10 == 1) {
            return hours + " час";
        }
        if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) {
            return hours + " часа";
        } else {
            return hours + " часов";
        }
    }

    private static String getMinutesStr(int minutes) {
        String m = String.valueOf(minutes);
        if (m.charAt(0) == 1 && m.length() == 2) {
            return minutes + " минут";
        }
        if (minutes % 10 == 1) {
            return minutes + " минута";
        }
        if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) {
            return minutes + " минуты";
        } else {
            return minutes + " минут";
        }
    }
}
