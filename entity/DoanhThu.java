import java.time.LocalDate;

public class DoanhThu {
    private String maDT;
    private LocalDate ngay;
    private double tongDoanhThu;
    private double chiPhi;
    private double loiNhuan;

    private HoaDon hoaDon;
    private DoiSoatQuy doiSoatQuy;

    public DoanhThu() {
    }

    public DoanhThu(
            String maDT,
            LocalDate ngay,
            double tongDoanhThu,
            double chiPhi
    ) {
        this.maDT = maDT;
        this.ngay = ngay;
        this.tongDoanhThu = tongDoanhThu;
        this.chiPhi = chiPhi;
        this.loiNhuan = tongDoanhThu - chiPhi;
    }

    public void tinhLoiNhuan() {
        loiNhuan = tongDoanhThu - chiPhi;
    }

    // Getter, setter
}