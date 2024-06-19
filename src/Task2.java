public class Task2 {

    public static void main(String[] args) {
        checkSumSign(0, -3);
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}

