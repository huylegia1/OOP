package Lab3;
import java.util.Scanner;
public class PS {
    public static boolean BangNhau(PhanSo so1, PhanSo so2) {
        PhanSo Diff = new PhanSo();
        Diff.Hieu(so1, so2);
        if (Diff.getTu()!=0) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        PhanSo so1 = new PhanSo();
        PhanSo so2 = new PhanSo();
        int tu1 = so.nextInt();
        int mau1 = so.nextInt();
        int tu2 = so.nextInt();
        int mau2 = so.nextInt();
        so1.setTu(tu1);
        so1.setMau(mau1);
        so2.setTu(tu2);
        so2.setMau(mau2);
        PhanSo diff = new PhanSo();
        diff.Hieu(so1, so2);
        diff.inKetQua();
        if (BangNhau(so1, so2)) {
            System.out.println("Bang nhau");
        }
        else {
            System.out.println("Khong bang nhau");
        }
    }
}
