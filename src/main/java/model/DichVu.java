package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class DichVu {
    @Id
    @GeneratedValue
    @Column(length = 4)
    private Integer ma;
    @Column(length = 45)
    private String tenDichVu;
    @Column(columnDefinition = "TEXT")
    private String linkAnh;

    @Override
    public String toString() {
        return "DichVu{" +
                "ma=" + ma +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", linkAnh='" + linkAnh + '\'' +
                '}';
    }

    public DichVu() {
    }

    public DichVu(String tenDichVu, String linkAnh) {
        this.tenDichVu = tenDichVu;
        this.linkAnh = linkAnh;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLinkAnh() {
        return linkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        this.linkAnh = linkAnh;
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }
}
