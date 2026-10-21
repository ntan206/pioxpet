import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected String gioiTinh;
    protected LocalDate ngaySinh;
    protected LocalDate ngayVaoLam;
    protected boolean trangThai;

    protected TaiKhoan taiKhoan;
    protected ChuCuaHang chuCuaHang;
    protected List<HoaDon> danhSachHoaDon = new ArrayList<>();

    public NhanVien() {
    }

    public NhanVien(
            String maNV,
            String hoTen,
            String gioiTinh,
            LocalDate ngaySinh,
            LocalDate ngayVaoLam,
            boolean trangThai
    ) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.trangThai = trangThai;
    }

    public void lapHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void hienThiThongTin() {
        System.out.println(maNV + " - " + hoTen);
    }

    // Getter, setter
}