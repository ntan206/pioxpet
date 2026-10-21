import java.util.ArrayList;
import java.util.List;

public class ThuCung {
    private String maTC;
    private String ten;
    private String loai;
    private int tuoi;
    private GioiTinh gioiTinh;
    private TrangThai trangThai;

    private List<DichVu> danhSachDichVu = new ArrayList<>();
    private List<HoaDon> danhSachHoaDon = new ArrayList<>();

    public ThuCung() {
    }

    public ThuCung(
            String maTC,
            String ten,
            String loai,
            int tuoi,
            GioiTinh gioiTinh,
            TrangThai trangThai
    ) {
        this.maTC = maTC;
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public void themDichVu(DichVu dichVu) {
        danhSachDichVu.add(dichVu);
    }

    public void capNhatTuoi(int tuoiMoi) {
        this.tuoi = tuoiMoi;
    }

    public String getTen() {
        return ten;
    }

    // Getter, setter
}