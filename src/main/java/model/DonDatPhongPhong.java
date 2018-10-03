package model;

import javax.persistence.*;

@Entity
public class DonDatPhongPhong {
    @EmbeddedId
    private DonDatPhongPhongId donDatPhongPhongId;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("donDatPhongId")
    private DonDatPhong donDatPhong;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("phongId")
    private Phong phong;

    @Column(columnDefinition = "INTEGER(11)")
    private Integer gia;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer khuyenMai;
    @Column(columnDefinition = "INTEGER(2)")
    private Integer phiHuyPhong;
    @Column(columnDefinition = "INTEGER(11)")
    private Integer soLuongPhong;
    @Column(columnDefinition = "INTEGER(11)")
    private Integer soPhongDaHuy;

    @Override
    public String toString() {
        return "DonDatPhongPhong{" +
                "donDatPhongPhongId=" + donDatPhongPhongId +
                ", donDatPhong=" + donDatPhong +
                ", phong=" + phong +
                ", gia=" + gia +
                ", khuyenMai=" + khuyenMai +
                ", phiHuyPhong=" + phiHuyPhong +
                ", soLuongPhong=" + soLuongPhong +
                ", soPhongDaHuy=" + soPhongDaHuy +
                '}';
    }

    public DonDatPhongPhong(DonDatPhongPhongId donDatPhongPhongId, DonDatPhong donDatPhong, Phong phong, Integer gia, Integer khuyenMai, Integer phiHuyPhong, Integer soLuongPhong, Integer soPhongDaHuy) {
        this.donDatPhongPhongId = donDatPhongPhongId;
        this.donDatPhong = donDatPhong;
        this.phong = phong;
        this.gia = gia;
        this.khuyenMai = khuyenMai;
        this.phiHuyPhong = phiHuyPhong;
        this.soLuongPhong = soLuongPhong;
        this.soPhongDaHuy = soPhongDaHuy;
    }

    public DonDatPhongPhong() {
    }

    public DonDatPhongPhongId getDonDatPhongPhongId() {
        return donDatPhongPhongId;
    }

    public void setDonDatPhongPhongId(DonDatPhongPhongId donDatPhongPhongId) {
        this.donDatPhongPhongId = donDatPhongPhongId;
    }

    public DonDatPhong getDonDatPhong() {
        return donDatPhong;
    }

    public void setDonDatPhong(DonDatPhong donDatPhong) {
        this.donDatPhong = donDatPhong;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
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

    public Integer getSoPhongDaHuy() {
        return soPhongDaHuy;
    }

    public void setSoPhongDaHuy(Integer soPhongDaHuy) {
        this.soPhongDaHuy = soPhongDaHuy;
    }
}
