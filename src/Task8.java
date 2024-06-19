public class Task8 {
    public static void main(String[] args) {
        printStringMultipleTimes("Привет", 6);

    }

    public static void printStringMultipleTimes(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
