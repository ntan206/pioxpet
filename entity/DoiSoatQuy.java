import java.time.LocalDate;

public class DoiSoatQuy {
    private String maDSQ;
    private LocalDate ngayQuyetSoat;
    private String loai;
    private double soTienChenh;
    private double soTienThu;
    private String ghiChu;

    private DoanhThu doanhThu;

    public DoiSoatQuy() {
    }

    public DoiSoatQuy(
            String maDSQ,
            LocalDate ngayQuyetSoat,
            String loai,
            double soTienChenh,
            double soTienThu,
            String ghiChu
    ) {
        this.maDSQ = maDSQ;
        this.ngayQuyetSoat = ngayQuyetSoat;
        this.loai = loai;
        this.soTienChenh = soTienChenh;
        this.soTienThu = soTienThu;
        this.ghiChu = ghiChu;
    }

    public boolean hopLe() {
        return soTienChenh == 0;
    }

    // Getter, setter
}