/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author lala_
 */
public class Transaksi {
    // deklarasi varibel private untuk menyimpan informasi transaksi
    private String kodeBarang;  // kode barang yang dibeli
    private int jumlahBeli;     // jumlah barang yang dibeli
    private int jumlahBayar;    // total biaya yang harus dibayar untuk barang yang dibeli
    
    // konstruktor untuk inisialisasi objek transaksi dengan kode barang, jumlah beli, dan jumlah bayar
    public Transaksi(String kodeBarang, int jumlahBeli, int jumlahBayar){
        this.kodeBarang = kodeBarang;       
        this.jumlahBeli = jumlahBeli;
        this.jumlahBayar = jumlahBayar;
    }
    
    // getter untuk mendapatkan nilai dari variabel kodeBarang
    public String getKodeBarang(){
        return kodeBarang;
    }
    
    // getter untuk mendapatkan nilai dari variabel jumlahBeli
    public int getJumlahBeli(){
        return jumlahBeli;
    }
    
    // getter untuk mendapatkan nilai dari variabel jumlahBayar
    public int getJumlahBayar(){
        return jumlahBayar;
    }
}
