import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private String maHD;
    private LocalDate ngayLap;
    private String maNV;
    private double tongTien;
    private String hinhThuc;
    private TrangThai trangThai;

    private NhanVien nhanVien;
    private ThuCung thuCung;
    private List<ChiTietHoaDon> chiTietHoaDons = new ArrayList<>();
    private List<KhuyenMai> khuyenMais = new ArrayList<>();

    public HoaDon() {
    }

    public HoaDon(
            String maHD,
            LocalDate ngayLap,
            String maNV,
            double tongTien,
            String hinhThuc,
            TrangThai trangThai
    ) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.tongTien = tongTien;
        this.hinhThuc = hinhThuc;
        this.trangThai = trangThai;
    }

    public void themChiTiet(ChiTietHoaDon chiTiet) {
        chiTietHoaDons.add(chiTiet);
        tinhTongTien();
    }

    public void themKhuyenMai(KhuyenMai khuyenMai) {
        khuyenMais.add(khuyenMai);
    }

    public void tinhTongTien() {
        tongTien = 0;

        for (ChiTietHoaDon chiTiet : chiTietHoaDons) {
            tongTien += chiTiet.tinhThanhTien();
        }
    }

    // Getter, setter
}