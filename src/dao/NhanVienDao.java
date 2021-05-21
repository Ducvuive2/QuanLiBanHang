/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author PC
 */
public class NhanVienDao {
    public ArrayList<NhanVien> getAllEmp(){
        
        ArrayList<NhanVien> nhanviens = new ArrayList<NhanVien>();    
        Connection connection =JDBCConnection.getJDBConnection();
        String sql = "SELECT * from NhanVien";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                NhanVien nhanvien = new NhanVien();
                nhanvien.setMaNhanVien(rs.getString("MaNhanVien"));
                nhanvien.setTenNhanVien(rs.getString("TenNhanVien"));
                nhanvien.setNgaySinh(rs.getString("NgaySinh"));
                nhanvien.setGioiTinh(rs.getString("GioiTinh"));
                nhanvien.setCMND(rs.getString("CMND"));
                nhanvien.setDiaChi(rs.getString("DiaChi"));
                nhanvien.setSoDT(rs.getString("SoDT"));
                nhanvien.setPassword(rs.getString("Password"));
                
                nhanviens.add(nhanvien);
            }
        }catch(SQLException e){
            e.printStackTrace();
                    }    
        return nhanviens;
    }
    public void addNhanVien(NhanVien nhanvien){
        Connection connection = JDBCConnection.getJDBConnection();
        String sql = "Insert into NhanVien (MaNhanVien,TenNhanVien,NgaySinh,GioiTinh,CMND,DiaChi,SoDT,Password) Values(?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanvien.getMaNhanVien());
            preparedStatement.setString(2, nhanvien.getTenNhanVien());
            preparedStatement.setString(3, nhanvien.getNgaySinh());
            preparedStatement.setString(4, nhanvien.getGioiTinh());
            preparedStatement.setString(5, nhanvien.getCMND());
            preparedStatement.setString(6, nhanvien.getDiaChi());
            preparedStatement.setString(7, nhanvien.getSoDT());
            preparedStatement.setString(8, nhanvien.getPassword());
            
            int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void XoaNhanVien(String manv){
        Connection connection = JDBCConnection.getJDBConnection();
        String sql = "delete from NhanVien where MaNhanVien=?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,manv);
            int rs= preparedStatement.executeUpdate();
            System.out.println(rs);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public ArrayList<NhanVien> findFullName(String tennv){
        
        ArrayList<NhanVien> nhanviens = new ArrayList<NhanVien>();    
        Connection connection =JDBCConnection.getJDBConnection();
        String sql = "SELECT * from NhanVien where TenNhanVien like ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,tennv);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                NhanVien nhanvien = new NhanVien();
                nhanvien.setMaNhanVien(rs.getString("MaNhanVien"));
                nhanvien.setTenNhanVien(rs.getString("TenNhanVien"));
                nhanvien.setNgaySinh(rs.getString("NgaySinh"));
                nhanvien.setGioiTinh(rs.getString("GioiTinh"));
                nhanvien.setCMND(rs.getString("CMND"));
                nhanvien.setDiaChi(rs.getString("DiaChi"));
                nhanvien.setSoDT(rs.getString("SoDT"));
                nhanvien.setPassword(rs.getString("Password"));
                
                nhanviens.add(nhanvien);
            }
        }catch(SQLException e){
            e.printStackTrace();
                    }    
        return nhanviens;
    }
}
