public class SanPhamPhuKien {
    private String maSP;
    private String tenSP;
    private double giaBan;
    private int soLuongTon;
    private String moTa;
    private TrangThai trangThai;

    private DanhMuc danhMuc;

    public SanPhamPhuKien() {
    }

    public SanPhamPhuKien(
            String maSP,
            String tenSP,
            double giaBan,
            int soLuongTon,
            String moTa,
            TrangThai trangThai
    ) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    public void capNhatSoLuong(int soLuong) {
        this.soLuongTon += soLuong;
    }

    public boolean conHang() {
        return soLuongTon > 0;
    }

    // Getter, setter
}