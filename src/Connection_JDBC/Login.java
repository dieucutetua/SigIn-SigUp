/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection_JDBC;

import static Connection_JDBC.connection.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.NguoiDung;

/**
 *
 * @author DELL
 */
public class Login {
    public List<NguoiDung> getAllUsers() {
        List<NguoiDung> ltl = new ArrayList<NguoiDung>();

        Connection connection = JDBCConnection();
        String sql = "select * from User";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                NguoiDung tl = new NguoiDung();
                tl.setTendangnhap(rs.getString("TenDangNhap"));
                tl.setMatkhau(rs.getString("MatKhau"));
                ltl.add(tl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ltl;
    }
}
