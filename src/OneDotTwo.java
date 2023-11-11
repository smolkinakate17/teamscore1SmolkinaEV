import java.util.Locale;
import java.util.Scanner;

public class OneDotTwo {
    public static void printTypeOf() {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        if (in.hasNextInt()) {
            System.out.println("Целое число");
        } else if (in.hasNextDouble() || in.hasNextFloat()) {
            System.out.println("Рациональное число");
        } else if (in.hasNextBoolean()) {
            System.out.println("Логическое значение");
        } else if (in.hasNextLine()) {
            System.out.println("Текст");
        }
        in.close();
    }
}
