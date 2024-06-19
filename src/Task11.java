public class Task11 {
    public static void main(String[] args) {
        ArrayFill();

    }

    private static void ArrayFill() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

