package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DonDatPhongPhongId implements Serializable {
    @Column(name = "don_dat_phong_id", columnDefinition = "INTEGER(20)")
    private Integer donDatPhongId;
    @Column(name = "phong_Id", columnDefinition = "INTEGER(20)")
    private Integer phongId;

    public DonDatPhongPhongId() {
    }

    @Override
    public String toString() {
        return "DonDatPhongPhongId{" +
                "donDatPhongId=" + donDatPhongId +
                ", phongId=" + phongId +
                '}';
    }

    public Integer getDonDatPhongId() {
        return donDatPhongId;
    }

    public void setDonDatPhongId(Integer donDatPhongId) {
        this.donDatPhongId = donDatPhongId;
    }

    public Integer getPhongId() {
        return phongId;
    }

    public void setPhongId(Integer phongId) {
        this.phongId = phongId;
    }

    public DonDatPhongPhongId(Integer donDatPhongId, Integer phongId) {
        this.donDatPhongId = donDatPhongId;
        this.phongId = phongId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DonDatPhongPhongId)) return false;
        DonDatPhongPhongId that = (DonDatPhongPhongId) o;
        return Objects.equals(getDonDatPhongId(), that.getDonDatPhongId()) &&
                Objects.equals(getPhongId(), that.getPhongId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDonDatPhongId(), getPhongId());
    }
}
