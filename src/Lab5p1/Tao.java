package Lab5p1;

public class Tao extends HoaQua {
    public String BaoQuan;

    public String getBaoQuan() {
        return BaoQuan;
    }

    public void setBaoQuan(String baoQuan) {
        BaoQuan = baoQuan;
    }
    public void getInfo() {
        System.out.println(getTen() + ": " + getGia() + ", " + getVi() + ", " + getBaoQuan());
    }
    public static void main(String[] args) {
        Tao TaoR = new Tao();
        TaoR.setTen("Tao Rockit");
        TaoR.setGia("50000 VND/kg");
        TaoR.setVi("Ngot");
        TaoR.setBaoQuan("Khong chat bao quan");
        Tao TaoT = new Tao();
        TaoT.setTen("Tao Tau");
        TaoT.setVi("Bui");
        TaoT.setGia("100000 VND/kg");
        TaoT.setBaoQuan("Co chat bao quan");
        TaoR.getInfo();
        TaoT.getInfo();
    }
}
