package model;

import javax.persistence.*;

@Entity
public class ChuKhachSan {
    @Id @GeneratedValue
    @Column(columnDefinition = "INTEGER(20)")
    private Integer ma;
    @Column(length = 45)
    private String ten;
    @Column(columnDefinition = "TINYINT(1)")
    private Integer gioiTinh;
    @Column(length = 11)
    private String soDienThoai;
    @Column(length = 45)
    private String email;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer maThanhPho;
    @Column(length = 45)
    private String diaChi;

    @OneToOne
    private TaiKhoan taiKhoan;
    @OneToOne
    private KhachSan khachSan;

    @Override
    public String toString() {
        return "ChuKhachSan{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", maThanhPho=" + maThanhPho +
                ", diaChi='" + diaChi + '\'' +
                ", taiKhoan=" + taiKhoan +
                ", khachSan=" + khachSan +
                '}';
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMaThanhPho() {
        return maThanhPho;
    }

    public void setMaThanhPho(Integer maThanhPho) {
        this.maThanhPho = maThanhPho;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public KhachSan getKhachSan() {
        return khachSan;
    }

    public void setKhachSan(KhachSan khachSan) {
        this.khachSan = khachSan;
    }

    public ChuKhachSan() {
    }

    public ChuKhachSan(String ten, Integer gioiTinh, String soDienThoai, String email, Integer maThanhPho, String diaChi, TaiKhoan taiKhoan, KhachSan khachSan) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.maThanhPho = maThanhPho;
        this.diaChi = diaChi;
        this.taiKhoan = taiKhoan;
        this.khachSan = khachSan;
    }
}
