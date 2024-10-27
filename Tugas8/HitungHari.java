/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;
import javax.swing.JOptionPane;     // untuk menampilkan kotak pesan ke pengguna
/**
 *
 * @author lala_
 */
public class HitungHari {
    
    public int hitung(int tahun, String bulan){
        int jmlHari;    // variabel untuk menyimpan jumlah hari
        
        if (bulan.equals("Februari")){
            // jika bulan Februari, cek apakah tahun kabisat
            if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0)) {
                jmlHari = 29;   // tahun kabisat, februari 29 hari
            } else {
                jmlHari = 28;   // bukan tahun kabisat, februari 28 hari
            }
        } else if (bulan.equals("April") || bulan.equals("Juni") || 
                bulan.equals("September") || bulan.equals("November")) {
            // jika bulan April, juni, September, atau november, jumlah harinya adalah 30
            jmlHari = 30;
        } else {
            // untuk bulan lainnya yaitu jumlah harinya adalah 31
            jmlHari = 31;
        }
        
        return jmlHari; // mengembalikan jumlah hari
    }
}
