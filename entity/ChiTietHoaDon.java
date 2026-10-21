public class ChiTietHoaDon {
    private int soLuong;
    private double donGia;
    private double thanhTien;

    private HoaDon hoaDon;
    private SanPhamPhuKien sanPhamPhuKien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int soLuong, double donGia) {
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = tinhThanhTien();
    }

    public double tinhThanhTien() {
        this.thanhTien = soLuong * donGia;
        return thanhTien;
    }

    // Getter, setter
}