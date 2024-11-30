/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manage.bank.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db{
    //HÀ NỘI- MÁY CHỦ
     public  Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://BENFLE\\HCSDLPT:1433;databaseName=QLNHVN;user=sa;password=123;;encrypt=false";
//         đoạn này nên thêm encrypt = false đề phòng sqlserver nó bảo mật 
// servername + portname + dbname + user + pass 
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }   
 
   
//    ĐÀ NẴNG
    public  Connection getConnection1()throws Exception {
        String url = "jdbc:sqlserver://DESKTOP-MEBQUE0\\HCSDLPT:1433;databaseName=QLNHVN;user=sa;password=123;;encrypt=false";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }   
//    CẦN THƠ
    public  Connection getConnection2()throws Exception {
        String url = "jdbc:sqlserver://21AK22-COM\\HCSDLPT:1433;databaseName=QLNHVN;user=sa;password=123;;encrypt=false";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }   
    //HCM
    public  Connection getConnection3()throws Exception {
        String url = "jdbc:sqlserver://ONE\\HCSDLPT:1433;databaseName=QLNHVN;user=sa;password=123;;encrypt=false"; 
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }   
    
     public static void main(String[] args){
//        try{
//            System.out.println(new Db().getConnection1());
//        }catch(Exception e){
//            System.out.println("khong ket noi duoc ");
//    }
//Db db = new Db();
//try {
//            // Test kết nối với máy chủ chính Hà Nội
//            Connection conn1 = db.getConnection();
//            if (conn1 != null) {
//                System.out.println("Kết nối thành công với Hà Nội (máy chủ chính).");
//                conn1.close(); // Đóng kết nối sau khi test xong
//            }
//
//            // Test kết nối với Đà Nẵng
//            Connection conn2 = db.getConnection1();
//            if (conn2 != null) {
//                System.out.println("Kết nối thành công với Đà Nẵng.");
//                conn2.close(); // Đóng kết nối sau khi test xong
//            }
//
//            // Test kết nối với Cần Thơ
//            Connection conn3 = db.getConnection2();
//            if (conn3 != null) {
//                System.out.println("Kết nối thành công với Cần Thơ.");
//                conn3.close(); // Đóng kết nối sau khi test xong
//            }
//
//            // Test kết nối với TP.HCM
//            Connection conn4 = db.getConnection3();
//            if (conn4 != null) {
//                System.out.println("Kết nối thành công với TP.HCM.");
//                conn4.close(); // Đóng kết nối sau khi test xong
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Lỗi SQL: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Lỗi kết nối: " + e.getMessage());
//        }
     }
    
}