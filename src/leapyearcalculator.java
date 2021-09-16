import java.util.Scanner;

public class leapyearcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapyear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapyear = true;
                }
            } else {
                isLeapyear = true;
            }
        }
        if (isLeapyear) {
            System.out.printf("%d is a Leap Year", year);
        } else {
            System.out.printf("%d is Not a Leap Year", year);
        }
    }
}
