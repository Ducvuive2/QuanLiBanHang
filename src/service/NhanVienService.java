/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.NhanVienDao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.NhanVien;
import java.sql.*;

/**
 *
 * @author PC
 */
public class NhanVienService {
    private NhanVienDao nhanVienDao;
     public NhanVienService(){
         nhanVienDao = new NhanVienDao();
     }
     public ArrayList<NhanVien>getAllEmp() {
        return nhanVienDao.getAllEmp();//lay du lieu trong ham NhanVien
     }
     public void ThemNhanVien(NhanVien nhanvien){
         nhanVienDao.addNhanVien(nhanvien);
     }
     public void XoaNhanVien(String manhanvien){
         nhanVienDao.XoaNhanVien(manhanvien);
     }
     public ArrayList<NhanVien>TimNhanVien(String tennhanvien){
        return nhanVienDao.findFullName(tennhanvien);        
     }
}
