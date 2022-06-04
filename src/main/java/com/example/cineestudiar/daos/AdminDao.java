package com.example.cineestudiar.daos;

import java.sql.*;
import java.util.ArrayList;

public class AdminDao {
    public void obtenerSalasYSedes(){
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mysystem4";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "";
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("");
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }







    }
}
