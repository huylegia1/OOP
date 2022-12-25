package Lab5p1;

public class Cam extends HoaQua {
    public String NguonGoc;

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        NguonGoc = nguonGoc;
    }
    public void getInfo() {
        System.out.println(getTen() + ": " + getGia() + ", " + getVi() + ", " + getNguonGoc());
    }

    public static void main(String[] args) {
        Cam CamCP = new Cam();
        CamCP.setGia("10000 VND/kg");
        CamCP.setTen("Cam Cao Phong");
        CamCP.setVi("Chua");
        CamCP.setNguonGoc("Cao Phong");
        Cam CamC = new Cam();
        CamC.setGia("5000 VND/kg");
        CamC.setTen("Cam Canh");
        CamC.setVi("Ngot");
        CamC.setNguonGoc("Mien Bac");
        CamCP.getInfo();
        CamC.getInfo();
    }
}
