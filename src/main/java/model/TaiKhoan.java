package model;

import javax.persistence.*;

@Entity
public class TaiKhoan {

    @Id @GeneratedValue
    @Column(name = "tenTaiKhoan", length = 45)
    private String tenTaiKhoan;
    @Column(name = "matKhau", length = 45)
    private String matKhau;
    @Column(name = "loaiTaiKhoan", columnDefinition = "INTEGER(1)")
    private Integer loaiTaiKhoan;

    @OneToOne
    private KhachHang khachHang;

    @OneToOne
    private NhanVien nhanVien;

    @OneToOne
    private ChuKhachSan chuKhachSan;

    @OneToOne
    private Admin admin;

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", loaiTaiKhoan=" + loaiTaiKhoan +
                ", khachHang=" + khachHang +
                ", nhanVien=" + nhanVien +
                ", chuKhachSan=" + chuKhachSan +
                ", admin=" + admin +
                '}';
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public TaiKhoan(String matKhau, int loaiTaiKhoan, KhachHang khachHang, NhanVien nhanVien, ChuKhachSan chuKhachSan, Admin admin) {
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.chuKhachSan = chuKhachSan;
        this.admin = admin;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public ChuKhachSan getChuKhachSan() {
        return chuKhachSan;
    }

    public void setChuKhachSan(ChuKhachSan chuKhachSan) {
        this.chuKhachSan = chuKhachSan;
    }

    public TaiKhoan() {
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(int loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

}
