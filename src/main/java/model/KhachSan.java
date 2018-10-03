package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class KhachSan {
    @Id @GeneratedValue
    @Column(columnDefinition = "INTEGER(10)")
    private Integer ma;
    @Column(length = 45)
    private String ten;
    @Column(columnDefinition = "TEXT")
    private String gioiThieu;
    @Column(columnDefinition = "TEXT")
    private String hinhAnh;
    @Column(length = 11)
    private String soDienThoai;
    @Column(columnDefinition = "INTEGER(3)")
    private Integer maQuanHuyen;
    @Column(length = 45)
    private String diaChi;
    @Column(columnDefinition = "TEXT")
    private String diemDuLichLanCan;

    @OneToOne
    private ChuKhachSan chuKhachSan;
    @OneToMany
    private Set<NhanVien> nhanViens;
    @OneToMany
    private Set<Phong> phongs;

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

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Integer getMaQuanHuyen() {
        return maQuanHuyen;
    }

    public void setMaQuanHuyen(Integer maQuanHuyen) {
        this.maQuanHuyen = maQuanHuyen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiemDuLichLanCan() {
        return diemDuLichLanCan;
    }

    public void setDiemDuLichLanCan(String diemDuLichLanCan) {
        this.diemDuLichLanCan = diemDuLichLanCan;
    }

    public ChuKhachSan getChuKhachSan() {
        return chuKhachSan;
    }

    public void setChuKhachSan(ChuKhachSan chuKhachSan) {
        this.chuKhachSan = chuKhachSan;
    }

    public Set<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(Set<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public Set<Phong> getPhongs() {
        return phongs;
    }

    public void setPhongs(Set<Phong> phongs) {
        this.phongs = phongs;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", gioiThieu='" + gioiThieu + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", maQuanHuyen=" + maQuanHuyen +
                ", diaChi='" + diaChi + '\'' +
                ", diemDuLichLanCan='" + diemDuLichLanCan + '\'' +
                ", chuKhachSan=" + chuKhachSan +
                ", nhanViens=" + nhanViens +
                ", phongs=" + phongs +
                '}';
    }

    public KhachSan() {
    }

    public KhachSan(String ten, String gioiThieu, String hinhAnh, String soDienThoai, Integer maQuanHuyen, String diaChi, String diemDuLichLanCan, ChuKhachSan chuKhachSan, Set<NhanVien> nhanViens, Set<Phong> phongs) {
        this.ten = ten;
        this.gioiThieu = gioiThieu;
        this.hinhAnh = hinhAnh;
        this.soDienThoai = soDienThoai;
        this.maQuanHuyen = maQuanHuyen;
        this.diaChi = diaChi;
        this.diemDuLichLanCan = diemDuLichLanCan;
        this.chuKhachSan = chuKhachSan;
        this.nhanViens = nhanViens;
        this.phongs = phongs;
    }

    // TODO: 10/1/2018
}
