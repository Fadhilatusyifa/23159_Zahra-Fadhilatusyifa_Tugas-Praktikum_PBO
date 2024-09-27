/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;
/**
 *
 * @author lala_
 */
import java.util.Scanner; // mengimpor kelas scanner untuk menerima input dari pengguna
public class DataNilaiMahasiswaNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat objek scanner untuk menerima input dari pengguna 
        Scanner input = new Scanner(System.in);
        
        System.out.println("+---------------------------------------------+");
        System.out.println("|       Masukkan Data Nilai Mahasiswa         |");
        System.out.println("+---------------------------------------------+");
        // Input data mahasiswa 
        System.out.print(" NPM Mahasiswa   : ");
        String npm = input.nextLine();
        
        System.out.print(" Nama Mahasiswa  : ");
        String nama = input.nextLine();
        
        System.out.print(" Nilai Kehadiran : ");
        double nilaikehadiran = input.nextDouble();
        
        System.out.print(" Nilai Tugas     : ");
        double nilaitugas = input.nextDouble();
        
        System.out.print(" Nilai UTS       : ");
        double nilaiUTS = input.nextDouble();
      
        System.out.print(" Nilai UAS       : ");
        double nilaiUAS = input.nextDouble();
        
        // Menghitung nilai akhir berdasarkan bobot penilaian
        double nilaiAkhir = (0.1 * nilaikehadiran) + (0.2 * nilaitugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        String grade;
        String ket;
        
        // Menentukan grade dan keterangannya berdasarkan nilai akhir / rata-rata
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100){
            grade = "A";
            ket = "ISTIMEWA"; // jika nilai antara 76 - 100, grade A dengan keterangan "ISTIMEWA"
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75){
            grade = "B";
            ket = "BAIK"; // jika nilai antara 66-75, grade B dengan keterangan "BAIK"
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65){
            grade = "C";
            ket = "CUKUP"; // jika nilai antara 56-65, grade C dengan keterangan "CUKUP"
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55){
            grade = "D";
            ket = "KURANG"; // jika nilai antara 46-55, grade D dengan keterangan "KURANG"
        } else {
            grade = "E";
            ket = "KURANG SEKALI"; // jika nilai kurang dari 46, grade E dengan keterangan "KURANG SEKALI"
        }
        
        // Menampilkan hasil nilai mahasiswa 
        System.out.println("\n+---------------------------------------------------+");
        System.out.println("|               Data Nilai Mahasiswa                |");
        System.out.println("+---------------------------------------------------+");
        System.out.println(" NPM Mahasiswa      : " + npm);
        System.out.println(" Nama Mahasiswa     : " + nama);
        System.out.println(" Nilai Rata-Rata    : " + nilaiAkhir); 
        System.out.println(" Grade              : " + grade);
        System.out.println(" Keterangan         : " + ket);
        System.out.println("+---------------------------------------------------+\n");
    }  
    
}
