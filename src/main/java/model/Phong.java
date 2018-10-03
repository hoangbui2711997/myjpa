package model;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Phong {
    @Id @GeneratedValue
    @Column(columnDefinition = "INTEGER(20)")
    private Long ma;
    @Column(length = 100)
    private String ten;
    private String hinhAnh;
    @Column(columnDefinition = "TINYINT(1)")
    private Integer mienPhiAnSang;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer soNguoi;
    @Column(length = 45)
    private String huongPhong;
    @Column(length = 45)
    private String loaiGiuong;
    @Column(columnDefinition = "INTEGER(11)")
    private Integer gia;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer khuyenMai;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer phiHuyPhong;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer soLuongPhong;
    @ManyToOne
    private KhachSan khachSan;

    @ManyToMany
    @JoinTable(name = "PhongDichVu",
            joinColumns = @JoinColumn(name = "maPhong"),
            inverseJoinColumns = @JoinColumn(name = "maDichVu")
    )
    private Set<DichVu> dichVu;

    @OneToMany
    private Set<DonDatPhongPhong> dongDatPhongPhongs;

    public Long getMa() {
        return ma;
    }

    public void setMa(Long ma) {
        this.ma = ma;
    }
    // TODO: 10/1/2018 waiting define


    public Phong() {
    }

    public Integer getMienPhiAnSang() {
        return mienPhiAnSang;
    }

    public void setMienPhiAnSang(Integer mienPhiAnSang) {
        this.mienPhiAnSang = mienPhiAnSang;
    }

    public Phong(String ten, String hinhAnh, Integer mienPhiAnSang, int soNguoi, String huongPhong, String loaiGiuong, Integer gia, Integer khuyenMai, Integer phiHuyPhong, Integer soLuongPhong, KhachSan khachSan, Set<DichVu> dichVu, Set<DonDatPhongPhong> dongDatPhongPhongs) {
        this.ten = ten;
        this.hinhAnh = hinhAnh;
        this.mienPhiAnSang = mienPhiAnSang;
        this.soNguoi = soNguoi;
        this.huongPhong = huongPhong;
        this.loaiGiuong = loaiGiuong;
        this.gia = gia;
        this.khuyenMai = khuyenMai;
        this.phiHuyPhong = phiHuyPhong;
        this.soLuongPhong = soLuongPhong;
        this.khachSan = khachSan;
        this.dichVu = dichVu;
        this.dongDatPhongPhongs = dongDatPhongPhongs;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", mienPhiAnSang=" + mienPhiAnSang +
                ", soNguoi=" + soNguoi +
                ", huongPhong='" + huongPhong + '\'' +
                ", loaiGiuong='" + loaiGiuong + '\'' +
                ", gia=" + gia +
                ", khuyenMai=" + khuyenMai +
                ", phiHuyPhong=" + phiHuyPhong +
                ", soLuongPhong=" + soLuongPhong +
                ", khachSan=" + khachSan +
                ", dichVu=" + dichVu +
                ", dongDatPhongPhongs=" + dongDatPhongPhongs +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getHuongPhong() {
        return huongPhong;
    }

    public void setHuongPhong(String huongPhong) {
        this.huongPhong = huongPhong;
    }

    public String getLoaiGiuong() {
        return loaiGiuong;
    }

    public void setLoaiGiuong(String loaiGiuong) {
        this.loaiGiuong = loaiGiuong;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(Integer khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public Integer getPhiHuyPhong() {
        return phiHuyPhong;
    }

    public void setPhiHuyPhong(Integer phiHuyPhong) {
        this.phiHuyPhong = phiHuyPhong;
    }

    public Integer getSoLuongPhong() {
        return soLuongPhong;
    }

    public void setSoLuongPhong(Integer soLuongPhong) {
        this.soLuongPhong = soLuongPhong;
    }

    public KhachSan getKhachSan() {
        return khachSan;
    }

    public void setKhachSan(KhachSan khachSan) {
        this.khachSan = khachSan;
    }

    public Set<DichVu> getDichVu() {
        return dichVu;
    }

    public void setDichVu(Set<DichVu> dichVu) {
        this.dichVu = dichVu;
    }

    public Set<DonDatPhongPhong> getDongDatPhongPhongs() {
        return dongDatPhongPhongs;
    }

    public void setDongDatPhongPhongs(Set<DonDatPhongPhong> dongDatPhongPhongs) {
        this.dongDatPhongPhongs = dongDatPhongPhongs;
    }
}
