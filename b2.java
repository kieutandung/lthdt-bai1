import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {

        int rate = 23000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double usdAmount = scanner.nextDouble();


        double vndAmount = usdAmount * rate;
        System.out.println("Giá trị tương ứng trong VND: " + vndAmount + " VND");

        scanner.close();
    }
}
