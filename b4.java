import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else if (number < 10) {
            System.out.println(convertOnesDigitToWord(number));
        } else if (number < 20) {
            System.out.println(convertTeensToWord(number));
        } else if (number < 100) {
            System.out.println(convertTensAndOnesToWord(number));
        } else {
            System.out.println(convertHundredsToWord(number));
        }
    }

    public static String convertOnesDigitToWord(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "out of ability";
        }
    }

    public static String convertTeensToWord(int number) {
        int ones = number % 10;
        switch (ones) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "fourteen";
            case 5:
                return "fifteen";
            case 6:
                return "sixteen";
            case 7:
                return "seventeen";
            case 8:
                return "eighteen";
            case 9:
                return "nineteen";
            default:
                return "out of ability";
        }
    }

    public static String convertTensAndOnesToWord(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String tenString = "";
        String oneString = "";
        switch (tens) {
            case 2:
                tenString = "twenty";
                break;
            case 3:
                tenString = "thirty";
                break;
            case 4:
                tenString = "forty";
                break;
            case 5:
                tenString = "fifty";
                break;
            case 6:
                tenString = "sixty";
                break;
            case 7:
                tenString = "seventy";
                break;
            case 8:
                tenString = "eighty";
                break;
            case 9:
                tenString = "ninety";
                break;
            default:
                return "out of ability";
        }
        if (ones != 0) {
            oneString = convertOnesDigitToWord(ones);
            return tenString + " " + oneString;
        } else {
            return tenString;
        }
    }

    public static String convertHundredsToWord(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        String hundredString = convertOnesDigitToWord(hundreds) + " hundred";
        String remainderString = "";
        if (tens != 0) {
            remainderString = convertTensAndOnesToWord(number % 100);
        } else if (ones != 0) {
            remainderString = convertOnesDigitToWord(ones);
        }
        if (!remainderString.equals("")) {
            return hundredString + " and " + remainderString;
        } else {
            return hundredString;
        }
    }
}
