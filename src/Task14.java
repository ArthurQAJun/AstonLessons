public class Task14 {
    public static void main(String[] args) {
        ArrayArgs();
    }

    private static void ArrayArgs() {
        int len = 8;
        int initialValue = 7;

        int[] result = createArray(len, initialValue);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}