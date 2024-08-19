package programming_questions;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {

        System.out.println("Enter the year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        boolean isLeapYear = leapYear(year);

        if (isLeapYear) {
            System.out.printf("%d is not a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }

    public static boolean leapYear(int year) {

        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }
}
