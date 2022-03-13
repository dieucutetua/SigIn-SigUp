/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection_JDBC;
import static Connection_JDBC.connection.JDBCConnection;
import models.QuanLyThuVien;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class QuanLyThuVienDao {
    public List<QuanLyThuVien> getAllUsers() {
        List<QuanLyThuVien> ltl = new ArrayList<QuanLyThuVien>();

        Connection connection = JDBCConnection();
        String sql = "select * from ThuVien";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                QuanLyThuVien tl = new QuanLyThuVien();
                tl.setId(rs.getString("MaTaiLieu"));
                tl.setLoaiTL(rs.getString("LoaiTaiLieu"));
                tl.setTenNXB(rs.getString("TenNXB"));
                tl.setSoBanPH(rs.getInt("SoBanPhatHanh"));
                tl.setTenTG(rs.getString("TenTacGia"));
                tl.setSoTrang(rs.getInt("SoTrang"));
                tl.setSoPH(rs.getInt("SoPhatHanh"));
                tl.setThangPH(rs.getInt("ThangPhatHanh"));
                tl.setNgayPH(rs.getInt("NgayPhatHanh"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
    public void add(QuanLyThuVien tl){
     Connection connection = JDBCConnection();          
            String sql = "INSERT INTO ThuVien (MaTaiLieu, LoaiTaiLieu, TenNXB, SoBanPhatHanh, TenTacGia, SoTrang, SoPhatHanh, ThangPhatHanh, NgayPhatHanh) "
                    + "values (?,?,?,?,?,?,?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getId());
                preparedStatement.setString(2, tl.getLoaiTL());
                preparedStatement.setString(3, tl.getTenNXB());
                preparedStatement.setInt(4, tl.getSoBanPH());
                preparedStatement.setString(5, tl.getTenTG());
                preparedStatement.setInt(6, tl.getSoTrang());
                preparedStatement.setInt(7, tl.getSoPH());
                preparedStatement.setInt(8, tl.getThangPH());
                preparedStatement.setInt(9, tl.getNgayPH());
                
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*public int updateUser(LoaiTaiLieu tl){
        Connection connection = JDBCConnection.JDBCConnection();
        String sql = "Update LoaiTaiLieu set LoaiTaiLieu = ? , TenTaiLieu = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tl.getId());
            preparedStatement.setString(2, tl.getName());
            if(preparedStatement.executeUpdate()>0){
                System.out.println("Update thành công!");
                return 1;
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }*/
    public void delete(String id){
       Connection connection = JDBCConnection();
        String sql = "delete from ThuVien where MaTaiLieu = ?";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            
            int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<QuanLyThuVien> findTaiLieu(String ID){
        ArrayList<QuanLyThuVien> ql = new ArrayList<QuanLyThuVien>();
        Connection connection = JDBCConnection();
        String sql = "select * from ThuVien where MaTaiLieu like ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"%"+ID+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                QuanLyThuVien tl = new QuanLyThuVien();
                tl.setId(rs.getString("MaTaiLieu"));
                tl.setLoaiTL(rs.getString("LoaiTaiLieu"));
                tl.setTenNXB(rs.getString("TenNXB"));
                tl.setSoBanPH(rs.getInt("SoBanPhatHanh"));
                tl.setTenTG(rs.getString("TenTacGia"));
                tl.setSoTrang(rs.getInt("SoTrang"));
                tl.setSoPH(rs.getInt("SoPhatHanh"));
                tl.setThangPH(rs.getInt("ThangPhatHanh"));
                tl.setNgayPH(rs.getInt("NgayPhatHanh"));
                ql.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ql;
    }
}
