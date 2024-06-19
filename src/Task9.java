public class Task9 {
    public static void main(String[] args) {
        IsLeapYear(100);

    }

    private static void IsLeapYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}