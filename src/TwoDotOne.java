import java.util.Locale;
import java.util.Scanner;

public class TwoDotOne {
    public static void printResult() {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double price = in.nextDouble();
        int kopeckPrice = (int) (price * 100);
        int kopeckNds = (kopeckPrice * 20) / 120;
        int kopeckWithoutNds = kopeckPrice-kopeckNds;

        System.out.println("Стоимость товара без НДС " + (double) kopeckWithoutNds / 100);
        System.out.println("Сумма НДС в чеке " + (double) kopeckNds / 100);
        System.out.println("Сумма НДС для налоговой декларации " + Math.round((double) kopeckNds / 100));
        in.close();
    }

}
