/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author lala_
 */

// class Mahasiswa untuk menyimpan data mahasiswa
public class Mahasiswa {
    // atribut untuk menyimpan data mahasiswa
    private String NIM, Nama, Alamat, mataKuliah;
    private double nilai1, nilai2, nilai3, nilai4, nilai5;
    private double nilaiAkhir;
    
    // konstruktor untuk menginisialisasi objek Mahasiswa 
    public Mahasiswa(String NIM, String Nama, String Alamat, String mataKuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.mataKuliah = mataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
        hitungNilaiAkhir(); // memanggil fungsi untuk menghitung nilai akhir
    }
    
    
    // fungsi untuk menghitung nilai akhir
    void hitungNilaiAkhir(){
        this.nilaiAkhir = (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }
    
    // getter untuk mendapatkan NIM
    public String getNIM(){
        return NIM; // mengembalikan NIM
    }
    
    // getter untuk mendapatkan nama
    public String getNama(){
        return Nama; // mengembalikan nama
    }
    
    // getter untuk mendapatkan ALamat
    public String getAlamat(){
        return Alamat; // mengembalikan ALamat
    }
    
    // getter untuk mendapatkan mata kuliah
    public String getMataKuliah(){
        return mataKuliah; // mengembalikan mata kuliah
    }
    
    // getter untuk mendapatkan nilai akhir
    public double getNilaiAKhir(){
        return nilaiAkhir; // mengembalikan nilai akhir
    }
    
}
