package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class KhachHang {
    @Id @GeneratedValue
    @Column(columnDefinition = "INTEGER(10)")
    private Integer ma;
    @Column(length = 45)
    private String ten;
    @Column(columnDefinition = "TINYINT(1)")
    private Integer gioiTinh;
    @Column(length = 45)
    private String email;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer maThanhPho;
    @OneToOne
    private TaiKhoan taiKhoan;
    @OneToMany
    private Set<DonDatPhong> donDatPhong;

    public KhachHang() {
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaThanhPho() {
        return maThanhPho;
    }

    public void setMaThanhPho(int maThanhPho) {
        this.maThanhPho = maThanhPho;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public Set<DonDatPhong> getDonDatPhong() {
        return donDatPhong;
    }

    public void setDonDatPhong(Set<DonDatPhong> donDatPhong) {
        this.donDatPhong = donDatPhong;
    }

    public KhachHang(String ten, Integer gioiTinh, String email, int maThanhPho, TaiKhoan taiKhoan, Set<DonDatPhong> donDatPhong) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.maThanhPho = maThanhPho;
        this.taiKhoan = taiKhoan;
        this.donDatPhong = donDatPhong;
    }

    // Dang cho...
}
