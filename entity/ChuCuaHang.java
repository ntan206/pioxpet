import java.util.ArrayList;
import java.util.List;

public class ChuCuaHang {
    private String maChu;
    private String hoTen;
    private String email;
    private String diaChi;
    private String thongTinCuaHang;

    private List<NhanVien> danhSachNhanVien = new ArrayList<>();
    private List<DanhMuc> danhSachDanhMuc = new ArrayList<>();

    public ChuCuaHang() {
    }

    public ChuCuaHang(
            String maChu,
            String hoTen,
            String email,
            String diaChi,
            String thongTinCuaHang
    ) {
        this.maChu = maChu;
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.thongTinCuaHang = thongTinCuaHang;
    }

    public void themNhanVien(NhanVien nhanVien) {
        danhSachNhanVien.add(nhanVien);
    }

    public void themDanhMuc(DanhMuc danhMuc) {
        danhSachDanhMuc.add(danhMuc);
    }

    // Getter, setter
}