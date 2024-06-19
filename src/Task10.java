import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        ArrayInvert();

    }

    private static void ArrayInvert() {
        int[] num = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] == 0 ? 1 : 0;
        }
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}