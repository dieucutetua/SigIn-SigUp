/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection_JDBC;
import static Connection_JDBC.connection.JDBCConnection;
import models.NguoiDung;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.NguoiDung;

/**
 *
 * @author DELL
 */
public class SigUp {
    public void add(NguoiDung tl){
     Connection connection = JDBCConnection();          
            String sql = "INSERT INTO Users (TenDangNhap, MatKhau, Confirm) "
                    + "values (?,?,?) ";            
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, tl.getTendangnhap());
                preparedStatement.setString(2, tl.getMatkhau());
                
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
                preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
