import java.time.LocalDate;

public class TaiKhoan {
    private String maTK;
    private String tenDangNhap;
    private String matKhau;
    private boolean trangThai;
    private VaiTro vaiTro;
    private LocalDate ngayTao;

    private NhanVien nhanVien;

    public TaiKhoan() {
    }

    public TaiKhoan(
            String maTK,
            String tenDangNhap,
            String matKhau,
            boolean trangThai,
            VaiTro vaiTro,
            LocalDate ngayTao
    ) {
        this.maTK = maTK;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
        this.vaiTro = vaiTro;
        this.ngayTao = ngayTao;
    }

    public void dangNhap() {
        System.out.println("Đăng nhập với tài khoản: " + tenDangNhap);
    }

    public void dangXuat() {
        System.out.println("Đã đăng xuất");
    }

    // Getter, setter
}