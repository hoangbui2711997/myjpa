package model;

import javax.persistence.*;

@Entity
public class QuanHuyen {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "INTEGER(3)")
    private Integer ma;
    @ManyToOne
    private TinhThanh tinhThanh;
    @Column(length = 45)
    private String tenQuanHuyen;


    public Integer getMa() {
        return ma;
    }

    public void setMa(Integer ma) {
        this.ma = ma;
    }

    public QuanHuyen(TinhThanh tinhThanh, String tenQuanHuyen) {
        this.tinhThanh = tinhThanh;
        this.tenQuanHuyen = tenQuanHuyen;
    }

    public QuanHuyen() {
    }

    public TinhThanh getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(TinhThanh tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public String getTenQuanHuyen() {
        return tenQuanHuyen;
    }

    public void setTenQuanHuyen(String tenQuanHuyen) {
        this.tenQuanHuyen = tenQuanHuyen;
    }
}
