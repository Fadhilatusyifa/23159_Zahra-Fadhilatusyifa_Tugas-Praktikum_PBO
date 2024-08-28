/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author lala_
 */
public class MahasiswaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Mahasiswa mhs1 = new Mahasiswa("Siska", "Informatika", 1);
        Mahasiswa mhs2 = new Mahasiswa("Arif", "informatika", 3);
        Mahasiswa mhs3 = new Mahasiswa("Lia", "Informatika", 5);
        
        
        mhs1.membaca();
        mhs2.nyontek();
        mhs3.modifikasi();
    }
    
}