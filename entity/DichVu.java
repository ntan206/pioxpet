public class DichVu {
    private String maDV;
    private String tenDV;
    private double giaDV;
    private String moTa;
    private TrangThai trangThai;

    private DanhMuc danhMuc;
    private ThuCung thuCung;

    public DichVu() {
    }

    public DichVu(
            String maDV,
            String tenDV,
            double giaDV,
            String moTa,
            TrangThai trangThai
    ) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.giaDV = giaDV;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    public void hienThiDichVu() {
        System.out.println(tenDV + " - " + giaDV);
    }

    // Getter, setter
}