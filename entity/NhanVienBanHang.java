import java.time.LocalDate;

public class NhanVienBanHang extends NhanVien {
    private String maNBH;
    private String soLanViec;

    public NhanVienBanHang() {
    }

    public NhanVienBanHang(
            String maNV,
            String hoTen,
            String gioiTinh,
            LocalDate ngaySinh,
            LocalDate ngayVaoLam,
            boolean trangThai,
            String maNBH,
            String soLanViec
    ) {
        super(maNV, hoTen, gioiTinh, ngaySinh, ngayVaoLam, trangThai);
        this.maNBH = maNBH;
        this.soLanViec = soLanViec;
    }

    public void banHang() {
        System.out.println("Nhân viên bán hàng đang bán hàng");
    }
}