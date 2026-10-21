import java.time.LocalDate;

public class NhanVienSpa extends NhanVien {
    private String maNVSP;
    private String chuyenMon;
    private String soLanViec;

    public NhanVienSpa() {
    }

    public NhanVienSpa(
            String maNV,
            String hoTen,
            String gioiTinh,
            LocalDate ngaySinh,
            LocalDate ngayVaoLam,
            boolean trangThai,
            String maNVSP,
            String chuyenMon,
            String soLanViec
    ) {
        super(maNV, hoTen, gioiTinh, ngaySinh, ngayVaoLam, trangThai);
        this.maNVSP = maNVSP;
        this.chuyenMon = chuyenMon;
        this.soLanViec = soLanViec;
    }

    public void chamSocThuCung(ThuCung thuCung) {
        System.out.println("Đang chăm sóc thú cưng: " + thuCung.getTen());
    }
}