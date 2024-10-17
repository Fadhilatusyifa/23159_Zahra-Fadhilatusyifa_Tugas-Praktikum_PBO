/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author lala_
 */
public class Barang {
    // deklarasi variavel private untuk menyimpan kode barang, nama barang, dan harga barang
    private String kode;        
    private String nama;
    private int harga;
    
    // konstruktor untuk inisialisasi objek barang dengan kode, nama, dan harga
    public Barang(String kode, String nama, int harga){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }
    
    // getter untuk mendapatkan nilai dari variabel kode
    public String getKode(){
        return kode;
    }
    
    // getter untuk mendapatkan nilai dari variabel nama
    public String getNama(){
        return nama;
    }
    
    // getter untuk mendapatkan nilai dari variabel harga
    public int getHarga(){
        return harga;
    }
    
}
