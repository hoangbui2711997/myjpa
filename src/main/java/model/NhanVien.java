package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class NhanVien {
    @Id @GeneratedValue
    @Column(columnDefinition = "INTEGER(10)")
    private Integer ma;
    @OneToOne
    private TaiKhoan taiKhoan;
    @Column(length = 45)
    private String ten;
    @Column(columnDefinition = "TINYINT(1)")
    private Integer gioiTinh;
    @Column(name = "soDienThoai", length = 11)
    private String soDienThoai;
    @Column(length = 45)
    private String email;
    @OneToMany
    private Set<DonDatPhong> donDatPhongs;
    @ManyToOne
    private KhachSan khachSan;

    public NhanVien(TaiKhoan taiKhoan, String ten, Integer gioiTinh, String soDienThoai, String email, Set<DonDatPhong> donDatPhongs, KhachSan khachSan) {
        this.taiKhoan = taiKhoan;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.donDatPhongs = donDatPhongs;
        this.khachSan = khachSan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ma=" + ma +
                ", taiKhoan=" + taiKhoan +
                ", ten='" + ten + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", donDatPhongs=" + donDatPhongs +
                ", khachSan=" + khachSan +
                '}';
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
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

    public Set<DonDatPhong> getDonDatPhongs() {
        return donDatPhongs;
    }

    public void setDonDatPhongs(Set<DonDatPhong> donDatPhongs) {
        this.donDatPhongs = donDatPhongs;
    }

    public KhachSan getKhachSan() {
        return khachSan;
    }

    public void setKhachSan(KhachSan khachSan) {
        this.khachSan = khachSan;
    }

    public NhanVien() {
    }
}
