package hust.soict.dsai.Lab01;
import java.util.Scanner;

public class ex64 {

    public static int convertMonth(String month) {
        switch (month.toLowerCase()) {
            case "january": case "jan": case "jan.": case "1": return 1;
            case "february": case "feb": case "feb.": case "2": return 2;
            case "march": case "mar": case "mar.": case "3": return 3;
            case "april": case "apr": case "apr.": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "aug.": case "8": return 8;
            case "september": case "sep": case "sep.": case "9": return 9;
            case "october": case "oct": case "oct.": case "10": return 10;
            case "november": case "nov": case "nov.": case "11": return 11;
            case "december": case "dec": case "dec.": case "12": return 12;
            default: return -1;
        }
    }

    public static int convertYear(String yearStr) {
        try {
            int year = Integer.parseInt(yearStr);
            if (year >= 0) {
                return year;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return calculateLeapYearDays(year);
            default: return 0;
        }
    }

    public static int calculateLeapYearDays(int year) {
        if (isLeapYear(year)) {
            return 29;
        } else {
            return 28;
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập tháng: ");
            String inputMonth = scanner.nextLine();

            System.out.print("Nhập năm: ");
            String inputYear = scanner.nextLine();

            int month = convertMonth(inputMonth);
            int year = convertYear(inputYear);

            if (month == -1 || year == -1) {
                System.out.println("Dữ liệu nhập không hợp lệ, vui lòng thử lại.");
                continue;
            }

            int days = getDaysInMonth(month, year);
            System.out.println("Số ngày trong tháng là: " + days);
            break;
        }
    }
}