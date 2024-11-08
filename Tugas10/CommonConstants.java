/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;
/**
 *
 * @author lala_
 */
// class yang berisi konstanta yang digunakan untuk koneksi ke database
public class CommonConstants {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";               // nama driver JDBC untuk koneksi ke database MySQL.
    static final String DB_URL = "jdbc:mysql://localhost/LoginKalkulator";      // URL koneksi ke database, termasuk host, port, dan nama database yaitu 'LoginKalkulator'
    static final String DB_USERNAME = "root";                                   // nama pengguna untuk koneksi ke database.
    static final String DB_PASSWORD = "";                                       // kata sandi untuk koneksi ke database 
    static final String DB_USERS_TABLE_NAME = "users";                          // nama tabel dalam database yang digunakan untuk menyimpan data pengguna.
    
}
