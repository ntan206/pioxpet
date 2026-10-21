import java.time.LocalDate;

public class KhuyenMai {
    private String maKM;
    private String tenKM;
    private LoaiKhuyenMai loaiKM;
    private double giaTri;
    private String dieuKien;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private TrangThai trangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(
            String maKM,
            String tenKM,
            LoaiKhuyenMai loaiKM,
            double giaTri,
            String dieuKien,
            LocalDate ngayBatDau,
            LocalDate ngayKetThuc,
            TrangThai trangThai
    ) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.loaiKM = loaiKM;
        this.giaTri = giaTri;
        this.dieuKien = dieuKien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public double tinhGiamGia(double tongTien) {
        return tongTien * giaTri / 100;
    }

    // Getter, setter
}