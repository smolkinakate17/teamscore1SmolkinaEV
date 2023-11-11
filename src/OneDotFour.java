import java.util.*;

public class OneDotFour {
    public static void printLongestSeries() {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int signCount = 0;
        int prev = rnd.nextInt(-1000, 1001);
        for (int i = 0; i < n; i++) {
            int cur = rnd.nextInt(-1000, 1001);
            if ((cur > 0 && prev > 0) || (cur < 0 && prev < 0)) {
                signCount++;
            } else if (signCount != 0) {
                if (signCount > result) {
                    result = signCount;
                }
                signCount = 0;
            }

            prev = cur;
        }
        if (signCount > result) {
            result = signCount;
        }
        System.out.println("Самая длинная серия " + result);
        in.close();
    }
}
