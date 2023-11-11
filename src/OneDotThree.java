import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class OneDotThree {
    public static void printResult() {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int count = 0;
        double sum = 0;
        double min = 0;
        double max = 0;
        try {
            min = Double.parseDouble(in.nextLine());
            max = min;
            count++;
            sum += min;
        } catch (Exception e) {
            System.out.println("Введите хотя бы одно число");
        }
        String line;
        do {
            line = in.nextLine();
            try {
                double number = Double.parseDouble(line);
                count++;
                sum += number;
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } catch (Exception e) {
                break;
            }
        }
        while (true);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);
        System.out.println("avr = " + sum / count);
        in.close();
    }
}
