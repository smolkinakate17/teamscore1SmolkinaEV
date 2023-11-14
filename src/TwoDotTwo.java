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

        System.out.println(nCopy + getTimeStr(days, hours, minutes));

        return 0;
    }

    private static String getTimeStr(int days, int hours, int minutes) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" - это ");

        int temp;
        //флаг для определения записали ли мы уже дни в stringBuilder
        boolean appendDays=false;
        String dayStr=String.valueOf(days);
        if(dayStr.length()>=2){
            //если предпоследняя цифра числа = 1
            if(dayStr.charAt(dayStr.length()-2)=='1'){
                stringBuilder.append(days).append(" дней");
                appendDays=true;
            }

        }

        if(!appendDays){
            if (days % 10 == 1) {
                stringBuilder.append(days).append(" день");
            } else if (days % 10 == 2 || days % 10 == 3 || days % 10 == 4) {
                stringBuilder.append(days).append(" дня");
            } else {
                stringBuilder.append(days).append(" дней");
            }
        }

        stringBuilder.append(", ");

        temp = hours / 10;
        if (temp == 1) {
            stringBuilder.append(hours).append(" часов");

        } else if (hours % 10 == 1) {
            stringBuilder.append(hours).append(" час");
        } else if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) {
            stringBuilder.append(hours).append(" часа");
        } else {
            stringBuilder.append(hours).append(" часов");
        }
        stringBuilder.append(", ");

        temp = minutes / 10;
        if (temp == 1) {
            stringBuilder.append(minutes).append(" минут");
        } else if (minutes % 10 == 1) {
            stringBuilder.append(minutes).append(" минута");
        } else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) {
            stringBuilder.append(minutes).append(" минуты");
        } else {
            stringBuilder.append(minutes).append(" минут");
        }
        stringBuilder.append(".");
        return stringBuilder.toString();
    }


}
