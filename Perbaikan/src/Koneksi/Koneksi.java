/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

/**
 *
 * @author mario firdaus robby akbar
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
public class Koneksi {
    
   public static Connection bukaCon(){
       try {
           MysqlDataSource kont = new MysqlDataSource();
           kont.setDatabaseName("mahaiswa");
           kont.setUser("root");
           kont.setPassword("");
           kont.setServerName("localhost");
           kont.setPort(8111);
           kont.setServerTimezone("Asia/Jakarta");
           Connection c = kont.getConnection();
           return c;
       } catch (SQLException e) {
       }
       return null;
   }
    
}
