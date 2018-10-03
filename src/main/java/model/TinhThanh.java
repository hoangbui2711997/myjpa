package model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TinhThanh {
    @Id @GeneratedValue
    @Column(columnDefinition = "INTEGER(2)")
    private Integer ma;
    @Column(length = 45)
    private String tenTinhThanh;
    @OneToMany
    private Set<QuanHuyen> quanHuyen;

    public TinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }

    public TinhThanh() {
    }

    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public String getTenTinhThanh() {
        return tenTinhThanh;
    }

    public void setTenTinhThanh(String tenTinhThanh) {
        this.tenTinhThanh = tenTinhThanh;
    }

    @Override
    public String toString() {
        return "TinhThanh{" +
                "ma=" + ma +
                ", tenTinhThanh='" + tenTinhThanh + '\'' +
                '}';
    }
}
