public class Task5 {
    public static void main(String[] args) {
        checkSumInRange(4, 10);

    }

    public static boolean checkSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        if (
                sum >= 10 && sum <= 20
        )
            return true;
        else
            return false;

    }
}