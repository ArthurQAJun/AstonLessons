public class Task6 {
    public static void main(String[] args) {
        printPositiveOrNegative(-2);

    }

    private static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
