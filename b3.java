import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm chuyên cần: ");
        double diemChuyenCan = scanner.nextDouble();

        System.out.println("Nhập điểm kiểm tra: ");
        double diemKiemTra = scanner.nextDouble();

        System.out.println("Nhập điểm thi học kỳ: ");
        double diemThi = scanner.nextDouble();

        double diemTrungBinh = (diemChuyenCan + diemKiemTra + diemThi) / 3;

        if (diemTrungBinh >= 8.5) {
            System.out.println("Xếp loại: A");
        } else if (diemTrungBinh >= 7 && diemTrungBinh < 8.5) {
            System.out.println("Xếp loại: B");
        } else if (diemTrungBinh >= 5.5 && diemTrungBinh < 7) {
            System.out.println("Xếp loại: C");
        } else if (diemTrungBinh >= 4 && diemTrungBinh < 5.5) {
            System.out.println("Xếp loại: D");
        } else {
            System.out.println("Xếp loại: F");
        }
    }
}
