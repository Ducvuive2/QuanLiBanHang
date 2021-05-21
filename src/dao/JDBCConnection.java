package dao;


import java.sql.*;

public class JDBCConnection{
    public static Connection getJDBConnection(){
//        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//        String username = "QuanLiBanHang";
//        String password = "tiduckute123";
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            try {
                return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","QuanLiBanHang","tiduckute123");
            }catch(SQLException e){
            }
                 
        }catch (ClassNotFoundException e){
           
        }
        return null;
    }
    //Class.forName("oracle.jdbc.OracleDriver");
    //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","QuanLiBanHang","tiduckute123");
}

    