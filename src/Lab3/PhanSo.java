package Lab3;
public class PhanSo {
    public int tu;
    public int mau;
    public PhanSo() {
        tu = 1;
        mau = 1;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public PhanSo(int tu, int mau) {
        this.tu=tu;
        this.mau=mau;
    }
    public static int GCD(int so1, int so2) {
        int so11 = Math.abs(so1);
        int so21 = Math.abs(so2);
        while (so11!=so21) {
            if (so11>so21) {
                so11 = so11-so21;
            }
            else {
                so21= so21-so11;
            }
        }
        return so21;
    }
    public static int LCM(int so1, int so2) {
        int so11 = Math.abs(so1);
        int so21 = Math.abs(so2);
        return so11*so21/GCD(so1, so2);
    }
    public void Tong(PhanSo so1, PhanSo so2) {
        int tuTong = so1.tu*so2.mau + so2.tu*so1.mau;
        int mauTong = so1.mau*so2.mau;
        int iTong = GCD(tuTong, mauTong);
        this.tu = tuTong/iTong;
        this.mau = mauTong/iTong;
    }
    public void Hieu(PhanSo so1, PhanSo so2) {
        int tuHieu = so1.tu*so2.mau - so2.tu*so1.mau;
        int mauHieu = so1.mau*so2.mau;
        int iHieu = GCD(tuHieu, mauHieu);
        this.tu = tuHieu/iHieu;
        this.mau = mauHieu/iHieu;
    }
    public void Tich(PhanSo so1, PhanSo so2) {
        int tuTich = so1.tu*so2.tu;
        int mauTich = so1.mau*so2.mau;
        int iTich = GCD(tuTich, mauTich);
        this.tu = tuTich/iTich;
        this.mau = mauTich/iTich;
    }
    public void Thuong(PhanSo so1, PhanSo so2) {
        int tuThuong = so1.tu*so2.tu;
        int mauThuong = so1.mau*so2.mau;
        int iThuong = GCD(tuThuong, mauThuong);
        this.tu = tuThuong/iThuong;
        this.mau = mauThuong/iThuong;
    }
    public void inKetQua() {
        int tu = this.getTu();
        int mau = this.getMau();
        System.out.println(tu+"/"+mau);
    }

}
