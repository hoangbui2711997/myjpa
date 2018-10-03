package model;

import model.TaiKhoan;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Admin {

    @Id @GeneratedValue
    @Column(columnDefinition = "INTEGER(4)")
    private Integer ma;
    @Column(length = 45)
    private String ten;

    @OneToOne
    private TaiKhoan taiKhoan;

    public Admin() {
    }

    public Admin(String ten, TaiKhoan taiKhoan) {
        this.ten = ten;
        this.taiKhoan = taiKhoan;
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

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
}
