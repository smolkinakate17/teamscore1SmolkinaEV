public class OneDotOne {
    private static String[] title = new String[]{"Number", "Math.rint", "Math.round", "Math.ceil", "Math.floor"};
    private static double[] array = new double[]{30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675};
    private static int maxColumnWidth = 20;

    public static void printTable() {
        System.out.println(getTitleRow());
        for (double i : array) {
            System.out.println(getNumberRow(i));
        }
    }

    private static String getNumberItem(double number) {
        int countOfSpace = maxColumnWidth - String.valueOf(number).length();
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < countOfSpace; i++) {
            space.append(" ");
        }
        return number + space.toString();
    }

    private static String getNumberRow(double number) {
        return getNumberItem(number) + getNumberItem(Math.rint(number)) +
                getNumberItem(Math.round(number)) + getNumberItem(Math.ceil(number)) +
                getNumberItem(Math.floor(number));
    }

    private static String getTitleColumn(String titleItem) {
        int countOfSpace = maxColumnWidth - titleItem.length();
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < countOfSpace; i++) {
            space.append(" ");
        }
        return titleItem + space.toString();
    }

    private static String getTitleRow() {
        StringBuilder titleRow = new StringBuilder();
        for (String i : title) {
            titleRow.append(getTitleColumn(i));
        }
        return titleRow.toString();
    }
}
