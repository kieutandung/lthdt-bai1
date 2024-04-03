import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            String result = convertToWords(number);
            System.out.println(result);
        }
    }

    public static String convertToWords(int number) {
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            if (number % 10 == 0) {
                return tens[number / 10];
            } else {
                return teens[number % 10];
            }
        } else if (number < 100) {
            if (number % 10 == 0) {
                return tens[number / 10];
            } else {
                return tens[number / 10] + " " + units[number % 10];
            }
        } else {
            if (number % 100 == 0) {
                return units[number / 100] + " hundred";
            } else {
                return units[number / 100] + " hundred and " + convertToWords(number % 100);
            }
        }
    }
}
