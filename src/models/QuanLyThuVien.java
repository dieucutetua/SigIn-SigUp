/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DELL
 */
public class QuanLyThuVien {
    private String id;
    private String loaiTL;
    private String tenNXB;
    private int soBanPH;
    private String tenTG;
    private int soTrang;
    private int soPH;
    private int thangPH;
    private int ngayPH;
    
    public QuanLyThuVien() {
        
    }
    public QuanLyThuVien(String id, String loaiTL, String tenNXB, int soBanPH, String tenTG, int soTrang, int soPH, int thangPH, int ngayPH) {
        this.id = id;
        this.loaiTL = loaiTL;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
        this.soPH = soPH;
        this.thangPH = thangPH;
        this.ngayPH = ngayPH;
    }
    public String getId() {
        return id;
    }

    public String getLoaiTL() {
        return loaiTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public String getTenTG() {
        return tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public int getSoPH() {
        return soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public int getNgayPH() {
        return ngayPH;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLoaiTL(String loaiTL) {
        this.loaiTL = loaiTL;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    public void setNgayPH(int ngayPH) {
        this.ngayPH = ngayPH;
    }
}
