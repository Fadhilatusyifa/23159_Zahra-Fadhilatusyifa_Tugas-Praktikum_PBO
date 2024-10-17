/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas7;
import java.util.Scanner;
/**
 *
 * @author lala_
 */
public class TokoSerbaAda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // membuat objek scanner untuk mengambil input dari pengguna
        Toko tokoSerbaAda = new Toko();             // membuat objek toko yang akan digunakan untuk mengelola transaksi 
        
        // memanggil method tampilkanDaftarBarang() untuk menampilkan daftar barang yang tersedia di toko
        tokoSerbaAda.tampilkanDaftarBarang();
        
        // mengambil input jumlah item yang ingin dibeli oleh pengguna
        System.out.print("\nMasukkan jumlah item barang : ");
        int jumlahItem = input.nextInt();
        
        // memanggil method prosesTransaksi() untuk memproses transaksi berrdasarkan jumlah item yang dimasukkan
        tokoSerbaAda.prosesTransaksi(jumlahItem);
        
        // memanggil method tampilkanHasilTransaksi untuk menampilkan hasil dari transaksi yang telah dilakukan
        tokoSerbaAda.tampilkanHasilTransaksi();
    }
    
}
