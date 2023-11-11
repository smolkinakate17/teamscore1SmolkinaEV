import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //задача 1.1
        //OneDotOne.printTable();

        //задача 1.2
        //OneDotTwo.printTypeOf();

        //задача 1.3
        //OneDotThree.printResult();

        //задача 1.4
        //OneDotFour.printLongestSeries();

        //задача 2.1
        //TwoDotOne.printResult();

        //задача 2.2
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TwoDotTwo.printTime(n);
        in.close();
        //TwoDotTwo.printTime(Integer.parseInt(args[0]));
    }
}