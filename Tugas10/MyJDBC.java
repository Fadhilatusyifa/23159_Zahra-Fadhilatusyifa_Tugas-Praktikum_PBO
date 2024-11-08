/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;
import Tugas10.CommonConstants;     // mengimpor kelas CommonConstants dari package Tugas 10 untuk mengakses koneksi database.
import java.sql.*;                  // mengimpor package java.sql untuk menggunakan kelas dan interface JDBC
/**
 *
 * @author lala_
 */

// kelas untuk mengatur koneksi ke database dan melakukan operasi terkait pendaftaran pengguna, pemeriksaan keadaan pengguna, dan validasi login. 
public class MyJDBC {
    
    // untuk mendaftarkan pengguna baru ke dalam database 
    public static boolean register(String username, String password){
        try {
            // memeriksa apakah pengguna sudah ada di database dengan memanggil 'checkUser'.
            if (!checkUser(username)){
                // membuat koneksi ke database
                Connection konek = DriverManager.getConnection(CommonConstants.DB_URL, CommonConstants.DB_USERNAME, CommonConstants.DB_PASSWORD);
            
            // menyiapkan statement SQL untuk memasukkan data pengguna ke dalam tabel
            PreparedStatement insertUser = konek.prepareStatement(
                    "INSERT INTO " + CommonConstants.DB_USERS_TABLE_NAME + "(username, password)" + "VALUES(?, ?)");
            
            // mengatur parameter pada statement
            insertUser.setString(1, username);
            insertUser.setString(2, password);
            
            // mengeksekusi pernyataan untuk menambahkan data ke database
            insertUser.executeUpdate();
            return true;    // mengembalikan true jika pendaftaran berhasil
            }
        }catch(SQLException e){
            e.printStackTrace();        // mencetak stack trace jika terjadi kesalahan SQL
        }
        return false;       // mengembalikan false jika pendaftaran gagal
    }
    
    // untuk memeriksa apakah pengguna (useername)  sudah terdaftar di database 
    public static boolean checkUser(String username){
        try{
           // membuat koneksi ke database
           Connection konek = DriverManager.getConnection(CommonConstants.DB_URL, CommonConstants.DB_USERNAME, CommonConstants.DB_PASSWORD);
           
           // menyiapkan statement SQL untuk memeriksa keberadaan pengguna
           PreparedStatement checkUserExists = konek.prepareStatement(
                    "SELECT * FROM " + CommonConstants.DB_USERS_TABLE_NAME + " WHERE USERNAME = ?");
           
           // mengatur parameter pada statement
           checkUserExists.setString(1, username);
           
           // menjalankan query dan menyimpan hasilnya
           ResultSet  resultSet = checkUserExists.executeQuery();
           
           // memeriksa apakah resulSet memiliki data pengguna / kosong
           if(!resultSet.isBeforeFirst()){
               return false;    // mengembalikan false jika pengguna belum terdaftar
           }
        }catch(SQLException e){ 
            e.printStackTrace();    // mencetak stack trace jika terjadi kesalahan SQL    
        }
        
        return true;    // mengembalikan true jika pengguna sudah terdaftar
    }
    
    // untuk memvalidasi login pengguna dengan mencocokkan username dan password
    public static boolean validasiLogin(String username, String password){
        try{
            // membuat koneksi ke database
            Connection konek = DriverManager.getConnection(CommonConstants.DB_URL, CommonConstants.DB_USERNAME, CommonConstants.DB_PASSWORD);
            
            // menyiapkan statement SQL untuk memvalidasi Login pengguna.
            PreparedStatement validasiUser = konek.prepareStatement(
                    "SELECT * FROM " + CommonConstants.DB_USERS_TABLE_NAME + " WHERE USERNAME = ? AND PASSWORD = ?");
            
            // mengatur parameter pada statment
            validasiUser.setString(1, username);
            validasiUser.setString(2, password);
            
            // menjalankan query dan menyimpan hasilnya
            ResultSet resultSet = validasiUser.executeQuery();
            
            // memriksa apakah resultSet memeiliki data pengguna yang valid
            if(!resultSet.isBeforeFirst()){
                return false;   // mengembalikan false jika login tidak valid
            }
        }catch(SQLException e){
            e.printStackTrace();    // mencetak stack trace jika terjadi kesalahan SQL
        }
        
        return true;    // mengembalikan true jika login valid
    }
}
