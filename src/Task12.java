public class Task12 {
    public static void main(String[] args) {
        ArrayMultiplication();

    }

    private static void ArrayMultiplication() {
        {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}