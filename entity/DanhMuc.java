import java.util.ArrayList;
import java.util.List;

public class DanhMuc {
    private String maDM;
    private String tenDM;
    private String loai;
    private String moTa;

    private ChuCuaHang chuCuaHang;
    private List<SanPhamPhuKien> danhSachSanPham = new ArrayList<>();
    private List<DichVu> danhSachDichVu = new ArrayList<>();

    public DanhMuc() {
    }

    public DanhMuc(
            String maDM,
            String tenDM,
            String loai,
            String moTa
    ) {
        this.maDM = maDM;
        this.tenDM = tenDM;
        this.loai = loai;
        this.moTa = moTa;
    }

    public void themSanPham(SanPhamPhuKien sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public void themDichVu(DichVu dichVu) {
        danhSachDichVu.add(dichVu);
    }

    // Getter, setter
}