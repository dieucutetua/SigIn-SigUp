create database Books
go
use Books
go
create table ThuVien(
MaTaiLieu varchar(7) PRIMARY KEY,
LoaiTaiLieu nvarchar(30),
TenNXB nvarchar(30),
SoBanPhatHanh int,
TenTacGia nvarchar(45),
SoTrang int,
SoPhatHanh int,
ThangPhatHanh int,
NgayPhatHanh int
)
INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('0001', N'Sách', N'Kim Đồng', 30 , N'ABCD', 100, '1', '2', '13')

INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('0002', N'Sách', N'Kim Đồng', '55', N'Nguyễn Van A', '200', '50', '1', '5')

INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('0003', N'Sách', N'Kim Đồng', '44', N'Le Van B', '444', '50', '1', '5')

INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('0004', N'Sách', N'Kim Đồng', '33', N'Nguyễn Công A ', '333', '50', '3', '3')


INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('0005', N'Sách', N'Kim Đồng', '2', N'Nguyễn Thị C ', '3444', '50', '12', '5')

INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('0006', N'Sách', N'Kim Đồng', '12', N'Trần Văn C', '2000', '50', '10', '5')

INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh)
values ('0007', N'Sách', N'Kim Đồng', '44', N'Lê Bá B', '222', '50', '111', '5')

Select * from ThuVien