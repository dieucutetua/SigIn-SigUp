create database Users
go
use Users
go
create table DangNhap
(
	TenDangNhap varchar(20) primary key,
	MatKhau varchar(20),
	)
SELECT *FROM DangNhap
create table NguoiDung
(
	MaSV varchar(15) primary key,
	HoTen nvarchar(50),
	Lop nvarchar(10),
	SDT varchar(15),
	)
