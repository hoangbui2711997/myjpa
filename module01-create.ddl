CREATE TABLE ADMIN (MA INTEGER(4), TEN VARCHAR(45), TAIKHOAN_tenTaiKhoan VARCHAR(45), PRIMARY KEY (MA))
CREATE TABLE CHUKHACHSAN (MA INTEGER(20), DIACHI VARCHAR(45), EMAIL VARCHAR(45), GIOITINH TINYINT(1), MATHANHPHO INTEGER(2), SODIENTHOAI VARCHAR(11), TEN VARCHAR(45), KHACHSAN_MA INTEGER(10), TAIKHOAN_tenTaiKhoan VARCHAR(45), PRIMARY KEY (MA))
CREATE TABLE DICHVU (MA INTEGER NOT NULL, LINKANH TEXT, TENDICHVU VARCHAR(45), PRIMARY KEY (MA))
CREATE TABLE DONDATPHONG (MA BIGINT NOT NULL, CACHTHANHTOAN INTEGER(1), DATHANHTOAN TINYINT(1), DAXACNHAN TINYINT(1), DIACHI INTEGER(2), EMAIL VARCHAR(45), MABIMAT VARCHAR(20), NGAYDAT DATE, NGAYDEN DATE, SODIENTHOAI VARCHAR(11), SONGAYTHUE INTEGER, TENKHACHHANG VARCHAR(45), NHANVIEN_MA INTEGER(10), KHACHHANG_MA INTEGER(10), PRIMARY KEY (MA))
CREATE TABLE DONDATPHONGPHONG (GIA INTEGER(11), KHUYENMAI INTEGER(2), PHIHUYPHONG INTEGER(2), SOLUONGPHONG INTEGER(11), SOPHONGDAHUY INTEGER(11), DONDATPHONG_MA BIGINT NOT NULL, PHONG_MA INTEGER(20), PRIMARY KEY (DONDATPHONG_MA, PHONG_MA))
CREATE TABLE KHACHHANG (MA INTEGER(10), EMAIL VARCHAR(45), GIOITINH TINYINT(1), MATHANHPHO INTEGER(2), TEN VARCHAR(45), TAIKHOAN_tenTaiKhoan VARCHAR(45), PRIMARY KEY (MA))
CREATE TABLE KHACHSAN (MA INTEGER(10), DIACHI VARCHAR(45), DIEMDULICHLANCAN TEXT, GIOITHIEU TEXT, HINHANH TEXT, MAQUANHUYEN INTEGER(3), SODIENTHOAI VARCHAR(11), TEN VARCHAR(45), CHUKHACHSAN_MA INTEGER(20), PRIMARY KEY (MA))
CREATE TABLE NHANVIEN (MA INTEGER(10), EMAIL VARCHAR(45), GIOITINH TINYINT(1), soDienThoai VARCHAR(11), TEN VARCHAR(45), KHACHSAN_MA INTEGER(10), TAIKHOAN_tenTaiKhoan VARCHAR(45), PRIMARY KEY (MA))
CREATE TABLE PHONG (MA INTEGER(20), GIA INTEGER(11), HINHANH VARCHAR(255), HUONGPHONG VARCHAR(45), KHUYENMAI INTEGER(2), LOAIGIUONG VARCHAR(45), MIENPHIANSANG TINYINT(1), PHIHUYPHONG INTEGER(2), SOLUONGPHONG INTEGER(2), SONGUOI INTEGER(2), TEN VARCHAR(100), KHACHSAN_MA INTEGER(10), PRIMARY KEY (MA))
CREATE TABLE QUANHUYEN (MA INTEGER(3), TENQUANHUYEN VARCHAR(45), TINHTHANH_MA INTEGER(2), PRIMARY KEY (MA))
CREATE TABLE TAIKHOAN (tenTaiKhoan VARCHAR(45) NOT NULL, loaiTaiKhoan INTEGER(1), matKhau VARCHAR(45), ADMIN_MA INTEGER(4), CHUKHACHSAN_MA INTEGER(20), KHACHHANG_MA INTEGER(10), NHANVIEN_MA INTEGER(10), PRIMARY KEY (tenTaiKhoan))
CREATE TABLE TINHTHANH (MA INTEGER(2), TENTINHTHANH VARCHAR(45), PRIMARY KEY (MA))
CREATE TABLE DONDATPHONG_DONDATPHONGPHONG (DonDatPhong_MA BIGINT NOT NULL, PHONG_MA BIGINT NOT NULL, PRIMARY KEY (DonDatPhong_MA, PHONG_MA))
CREATE TABLE KHACHHANG_DONDATPHONG (KhachHang_MA INTEGER(10), donDatPhong_MA BIGINT NOT NULL, PRIMARY KEY (KhachHang_MA, donDatPhong_MA))
CREATE TABLE KHACHSAN_NHANVIEN (KhachSan_MA INTEGER(10), nhanViens_MA INTEGER(10), PRIMARY KEY (KhachSan_MA, nhanViens_MA))
CREATE TABLE KHACHSAN_PHONG (KhachSan_MA INTEGER(10), phongs_MA INTEGER(20), PRIMARY KEY (KhachSan_MA, phongs_MA))
CREATE TABLE NHANVIEN_DONDATPHONG (NhanVien_MA INTEGER(10), donDatPhongs_MA BIGINT NOT NULL, PRIMARY KEY (NhanVien_MA, donDatPhongs_MA))
CREATE TABLE PhongDichVu (maPhong INTEGER(20), maDichVu INTEGER NOT NULL, PRIMARY KEY (maPhong, maDichVu))
CREATE TABLE PHONG_DONDATPHONGPHONG (Phong_MA INTEGER(20), DONDATPHONG_MA BIGINT NOT NULL, PRIMARY KEY (Phong_MA, DONDATPHONG_MA))
CREATE TABLE TINHTHANH_QUANHUYEN (TinhThanh_MA INTEGER(2), quanHuyen_MA INTEGER(3), PRIMARY KEY (TinhThanh_MA, quanHuyen_MA))
ALTER TABLE ADMIN ADD CONSTRAINT FK_ADMIN_TAIKHOAN_tenTaiKhoan FOREIGN KEY (TAIKHOAN_tenTaiKhoan) REFERENCES TAIKHOAN (tenTaiKhoan)
ALTER TABLE CHUKHACHSAN ADD CONSTRAINT FK_CHUKHACHSAN_KHACHSAN_MA FOREIGN KEY (KHACHSAN_MA) REFERENCES KHACHSAN (MA)
ALTER TABLE CHUKHACHSAN ADD CONSTRAINT FK_CHUKHACHSAN_TAIKHOAN_tenTaiKhoan FOREIGN KEY (TAIKHOAN_tenTaiKhoan) REFERENCES TAIKHOAN (tenTaiKhoan)
ALTER TABLE DONDATPHONG ADD CONSTRAINT FK_DONDATPHONG_KHACHHANG_MA FOREIGN KEY (KHACHHANG_MA) REFERENCES KHACHHANG (MA)
ALTER TABLE DONDATPHONG ADD CONSTRAINT FK_DONDATPHONG_NHANVIEN_MA FOREIGN KEY (NHANVIEN_MA) REFERENCES NHANVIEN (MA)
ALTER TABLE DONDATPHONGPHONG ADD CONSTRAINT FK_DONDATPHONGPHONG_PHONG_MA FOREIGN KEY (PHONG_MA) REFERENCES PHONG (MA)
ALTER TABLE DONDATPHONGPHONG ADD CONSTRAINT FK_DONDATPHONGPHONG_DONDATPHONG_MA FOREIGN KEY (DONDATPHONG_MA) REFERENCES DONDATPHONG (MA)
ALTER TABLE KHACHHANG ADD CONSTRAINT FK_KHACHHANG_TAIKHOAN_tenTaiKhoan FOREIGN KEY (TAIKHOAN_tenTaiKhoan) REFERENCES TAIKHOAN (tenTaiKhoan)
ALTER TABLE KHACHSAN ADD CONSTRAINT FK_KHACHSAN_CHUKHACHSAN_MA FOREIGN KEY (CHUKHACHSAN_MA) REFERENCES CHUKHACHSAN (MA)
ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NHANVIEN_KHACHSAN_MA FOREIGN KEY (KHACHSAN_MA) REFERENCES KHACHSAN (MA)
ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NHANVIEN_TAIKHOAN_tenTaiKhoan FOREIGN KEY (TAIKHOAN_tenTaiKhoan) REFERENCES TAIKHOAN (tenTaiKhoan)
ALTER TABLE PHONG ADD CONSTRAINT FK_PHONG_KHACHSAN_MA FOREIGN KEY (KHACHSAN_MA) REFERENCES KHACHSAN (MA)
ALTER TABLE QUANHUYEN ADD CONSTRAINT FK_QUANHUYEN_TINHTHANH_MA FOREIGN KEY (TINHTHANH_MA) REFERENCES TINHTHANH (MA)
ALTER TABLE TAIKHOAN ADD CONSTRAINT FK_TAIKHOAN_ADMIN_MA FOREIGN KEY (ADMIN_MA) REFERENCES ADMIN (MA)
ALTER TABLE TAIKHOAN ADD CONSTRAINT FK_TAIKHOAN_CHUKHACHSAN_MA FOREIGN KEY (CHUKHACHSAN_MA) REFERENCES CHUKHACHSAN (MA)
ALTER TABLE TAIKHOAN ADD CONSTRAINT FK_TAIKHOAN_NHANVIEN_MA FOREIGN KEY (NHANVIEN_MA) REFERENCES NHANVIEN (MA)
ALTER TABLE TAIKHOAN ADD CONSTRAINT FK_TAIKHOAN_KHACHHANG_MA FOREIGN KEY (KHACHHANG_MA) REFERENCES KHACHHANG (MA)
ALTER TABLE DONDATPHONG_DONDATPHONGPHONG ADD CONSTRAINT FK_DONDATPHONG_DONDATPHONGPHONG_DonDatPhong_MA FOREIGN KEY (DonDatPhong_MA) REFERENCES DONDATPHONG (MA)
ALTER TABLE DONDATPHONG_DONDATPHONGPHONG ADD CONSTRAINT FK_DONDATPHONG_DONDATPHONGPHONG_DONDATPHONG_MA FOREIGN KEY (DONDATPHONG_MA, PHONG_MA) REFERENCES DONDATPHONGPHONG (DONDATPHONG_MA, PHONG_MA)
ALTER TABLE KHACHHANG_DONDATPHONG ADD CONSTRAINT FK_KHACHHANG_DONDATPHONG_KhachHang_MA FOREIGN KEY (KhachHang_MA) REFERENCES KHACHHANG (MA)
ALTER TABLE KHACHHANG_DONDATPHONG ADD CONSTRAINT FK_KHACHHANG_DONDATPHONG_donDatPhong_MA FOREIGN KEY (donDatPhong_MA) REFERENCES DONDATPHONG (MA)
ALTER TABLE KHACHSAN_NHANVIEN ADD CONSTRAINT FK_KHACHSAN_NHANVIEN_nhanViens_MA FOREIGN KEY (nhanViens_MA) REFERENCES NHANVIEN (MA)
ALTER TABLE KHACHSAN_NHANVIEN ADD CONSTRAINT FK_KHACHSAN_NHANVIEN_KhachSan_MA FOREIGN KEY (KhachSan_MA) REFERENCES KHACHSAN (MA)
ALTER TABLE KHACHSAN_PHONG ADD CONSTRAINT FK_KHACHSAN_PHONG_KhachSan_MA FOREIGN KEY (KhachSan_MA) REFERENCES KHACHSAN (MA)
ALTER TABLE KHACHSAN_PHONG ADD CONSTRAINT FK_KHACHSAN_PHONG_phongs_MA FOREIGN KEY (phongs_MA) REFERENCES PHONG (MA)
ALTER TABLE NHANVIEN_DONDATPHONG ADD CONSTRAINT FK_NHANVIEN_DONDATPHONG_NhanVien_MA FOREIGN KEY (NhanVien_MA) REFERENCES NHANVIEN (MA)
ALTER TABLE NHANVIEN_DONDATPHONG ADD CONSTRAINT FK_NHANVIEN_DONDATPHONG_donDatPhongs_MA FOREIGN KEY (donDatPhongs_MA) REFERENCES DONDATPHONG (MA)
ALTER TABLE PhongDichVu ADD CONSTRAINT FK_PhongDichVu_maPhong FOREIGN KEY (maPhong) REFERENCES PHONG (MA)
ALTER TABLE PhongDichVu ADD CONSTRAINT FK_PhongDichVu_maDichVu FOREIGN KEY (maDichVu) REFERENCES DICHVU (MA)
ALTER TABLE PHONG_DONDATPHONGPHONG ADD CONSTRAINT FK_PHONG_DONDATPHONGPHONG_DONDATPHONG_MA FOREIGN KEY (DONDATPHONG_MA, PHONG_MA) REFERENCES DONDATPHONGPHONG (DONDATPHONG_MA, PHONG_MA)
ALTER TABLE PHONG_DONDATPHONGPHONG ADD CONSTRAINT FK_PHONG_DONDATPHONGPHONG_Phong_MA FOREIGN KEY (Phong_MA) REFERENCES PHONG (MA)
ALTER TABLE TINHTHANH_QUANHUYEN ADD CONSTRAINT FK_TINHTHANH_QUANHUYEN_TinhThanh_MA FOREIGN KEY (TinhThanh_MA) REFERENCES TINHTHANH (MA)
ALTER TABLE TINHTHANH_QUANHUYEN ADD CONSTRAINT FK_TINHTHANH_QUANHUYEN_quanHuyen_MA FOREIGN KEY (quanHuyen_MA) REFERENCES QUANHUYEN (MA)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
