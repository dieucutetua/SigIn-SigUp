/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Connection_JDBC.QuanLyThuVienDao;
import java.util.List;
import models.QuanLyThuVien;


/**
 *
 * @author DELL
 */
public class qltv_Service {
    private QuanLyThuVienDao qltv;

    public qltv_Service() {
        qltv = new QuanLyThuVienDao();
        
    }
    
    public List<QuanLyThuVien> getAllUsers(){
        return qltv.getAllUsers();
    }
    
    public void add(QuanLyThuVien tl){
        qltv.add(tl);
    }
    
    public void delete(String id){
        qltv.delete(id);
    }
    /*public users getUserByID(int id){
       return userLink.getUserByID(id);
    }*/
}
