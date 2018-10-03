package model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.sql.Date;
import java.util.Set;

@Entity
public class DonDatPhong {
    @Id
    @GeneratedValue
    @Column(length = 20)
    private Long ma;
    @OneToOne
    private KhachHang khachHang;
    @ManyToOne
    private NhanVien nhanVien;
    @Column(length = 20)
    private String maBiMat;
    @Future
    private Date ngayDat;
    @Future
    private Date ngayDen;
    @Column(length = 4)
    private Integer soNgayThue;
    @Column(length = 45)
    private String tenKhachHang;
    @Column(length = 11)
    private String soDienThoai;
    @Column(length = 45)
    private String email;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer diaChi;
    @Column(columnDefinition = "INTEGER(1)")
    private Integer cachThanhToan;
    @Column(columnDefinition = "TINYINT(1)")
    private Integer daThanhToan;
    @Column(columnDefinition = "TINYINT(1)")
    private Integer daXacNhan;
    @OneToMany
    private Set<DonDatPhongPhong> donDatPhongPhongs;

    @Override
    public String toString() {
        return "DonDatPhong{" +
                "ma=" + ma +
                ", khachHang=" + khachHang +
                ", nhanVien=" + nhanVien +
                ", maBiMat='" + maBiMat + '\'' +
                ", ngayDat=" + ngayDat +
                ", ngayDen=" + ngayDen +
                ", soNgayThue=" + soNgayThue +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", diaChi=" + diaChi +
                ", cachThanhToan=" + cachThanhToan +
                ", daThanhToan=" + daThanhToan +
                ", daXacNhan=" + daXacNhan +
                ", donDatPhongPhongs=" + donDatPhongPhongs +
                '}';
    }

    public DonDatPhong(KhachHang khachHang, NhanVien nhanVien, String maBiMat, Date ngayDat, Date ngayDen, Integer soNgayThue, String tenKhachHang, String soDienThoai, String email, Integer diaChi, Integer cachThanhToan, Integer daThanhToan, Integer daXacNhan, Set<DonDatPhongPhong> donDatPhongPhongs) {
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maBiMat = maBiMat;
        this.ngayDat = ngayDat;
        this.ngayDen = ngayDen;
        this.soNgayThue = soNgayThue;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
        this.cachThanhToan = cachThanhToan;
        this.daThanhToan = daThanhToan;
        this.daXacNhan = daXacNhan;
        this.donDatPhongPhongs = donDatPhongPhongs;
    }

    public void setSoNgayThue(Integer soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(Integer diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getCachThanhToan() {
        return cachThanhToan;
    }

    public void setCachThanhToan(Integer cachThanhToan) {
        this.cachThanhToan = cachThanhToan;
    }

    public Integer getDaThanhToan() {
        return daThanhToan;
    }

    public void setDaThanhToan(Integer daThanhToan) {
        this.daThanhToan = daThanhToan;
    }

    public Integer getDaXacNhan() {
        return daXacNhan;
    }

    public void setDaXacNhan(Integer daXacNhan) {
        this.daXacNhan = daXacNhan;
    }

    public Set<DonDatPhongPhong> getDonDatPhongPhongs() {
        return donDatPhongPhongs;
    }

    public void setDonDatPhongPhongs(Set<DonDatPhongPhong> donDatPhongPhongs) {
        this.donDatPhongPhongs = donDatPhongPhongs;
    }

    public Long getMa() {
        return ma;
    }

    public void setMa(Long ma) {
        this.ma = ma;
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

    public String getMaBiMat() {
        return maBiMat;
    }

    public void setMaBiMat(String maBiMat) {
        this.maBiMat = maBiMat;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(Date ngayDen) {
        this.ngayDen = ngayDen;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public DonDatPhong() {
    }

    public DonDatPhong(KhachHang khachHang, NhanVien nhanVien, String maBiMat, Date ngayDat, Date ngayDen, int soNgayThue, String tenKhachHang, String soDienThoai) {
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.maBiMat = maBiMat;
        this.ngayDat = ngayDat;
        this.ngayDen = ngayDen;
        this.soNgayThue = soNgayThue;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
    }

}
