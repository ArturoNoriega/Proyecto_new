package com.example.cineestudiar.daos;

import com.example.cineestudiar.beans.BUser;

import java.sql.*;
import java.util.ArrayList;

public class AdminDao {
    public static ArrayList<BUser> obtenerOperadores(){
        ArrayList<BUser> listaOperadores = new ArrayList<>();
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/mysystem4";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "select codigo_pucp,nombre,apellido,dni from usuarios \n" +
                    "where rol=\"operador\"\n" +
                    "order by codigo_pucp;";
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                BUser op = new BUser();
                op.setCodigoPucp(rs.getString(1));
                op.setCodigoPucp(rs.getString(2));
                op.setCodigoPucp(rs.getString(3));
                op.setCodigoPucp(rs.getString(4));
                op.setCodigoPucp(rs.getString(5));
                op.setCodigoPucp(rs.getString(6));
                op.setCodigoPucp(rs.getString(7));
                op.setCodigoPucp(rs.getString(8));
                op.setCodigoPucp(rs.getString(9));
                op.setCodigoPucp(rs.getString(10));
                op.setCodigoPucp(String.valueOf(rs.getBlob(11)));
                op.setCodigoPucp(rs.getString(12));

                listaOperadores.add(op);
            }

        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

        return listaOperadores;
    }
}
