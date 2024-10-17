/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;
import java.util.Scanner;
/**
 *
 * @author lala_
 */
public class Toko {
    // deklarasi array untuk menyimpan daftar barang dan transaksi
    private Barang[] daftarBarang;  // menyimpan daftar barang yang tersedia di toko
    private Transaksi[] transaksi;  // menyimpan daftar transaksi yang dilakukan
    private int totalBayar;         // menyimpan total pembayaran dari semua transaksi 
    
    // konstruktor untuk inisialisasi objek toko dengan daftar barang 
    public Toko(){
        daftarBarang = new Barang[]{
            new Barang("a001", "Buku", 3000),       // menambahkan barang buku
            new Barang("a002", "Pensil", 4000),     // menambahkan barang pensil
            new Barang("a003", "Pulpen", 5000)      // menambahkan barang pulpen
        };
        totalBayar = 0; // inisialisasi totalBayar menjadi 0
    }
    
    // method untuk menampilkan daftar barang
    public void tampilkanDaftarBarang(){
        System.out.println("+===========================================================================+");
        System.out.println("|                     SELAMAT DATANG DI TOKO SERBA ADA                      |");
        System.out.println("+===========================================================================+");
        System.out.println("DAFTAR BARANG");
        System.out.println("+------------------------------------------+");
        System.out.printf("| %-12s | %-14s | %-8s |\n", "Kode Barang", "Nama Barang", "Harga");
        System.out.println("+--------------|----------------|----------|");
        
        // loop untuk menampilkan setiap barang dalam daftarBarang
        for (Barang barang : daftarBarang){
            System.out.printf("| %-12s | %-14s | %-8d |\n", barang.getKode(), barang.getNama(), barang.getHarga());
        }
        System.out.println("+--------------|----------------|----------+");
    }
    
    // method untuk memproses transaksi berdasarkan jumlah item yang dibeli
    public void prosesTransaksi(int jumlahItem){
        Scanner input = new Scanner(System.in); // scanner untuk input pengguna
        transaksi = new Transaksi[jumlahItem];  // menginisialisasi array transaksi
        
        // loop untuk setiap item barang yang akan dibeli
        for (int i = 0; i < jumlahItem; i++){
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Masukkan kode barang : ");
            String kode = input.next();
            System.out.print("Masukkan Jumlah Beli : ");
            int jumlah = input.nextInt();
            
            // loop untuk mencari barang berdasarkan kode yang telah dimasukkan oleh pengguna
            for (Barang barang : daftarBarang){
            if (barang.getKode().equals(kode)){
                // menghitung total bayar untuk barang yang telah dibeli
                int jumlahBayar = jumlah * barang.getHarga();             
                transaksi[i] = new Transaksi(kode, jumlah, jumlahBayar);    // menyimpan transaksi
                totalBayar += jumlahBayar;  // menambahkan jumlahBayar ke totalBayar
                break;                      // keluar dari loop setelah barang ditemukan
            }
        }
    }
      
}
    // method untuk menampilkan hasil transaksi setelah pembelian
    public void tampilkanHasilTransaksi(){
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*****************************************************************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("===============================================================================");
        
        // loop untuk menampilkan setiap transaksi
        for (int i = 0; i < transaksi.length; i++){
            Transaksi t = transaksi[i];     // mengambil transaksi ke -i
            // mencari barang berdasarkan kode barang dari transaksi
            for (Barang barang : daftarBarang){
                if(barang.getKode().equals(t.getKodeBarang())) {
                    // menampilkan informasi transaksi dan barang
                    System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\t\t%d\n", (i + 1), t.getKodeBarang(), barang.getNama(), barang.getHarga(), t.getJumlahBeli(), t.getJumlahBayar());
                }
            }
        }
        
        // menampilkan total bayar
        System.out.println("===============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("===============================================================================\n\n");
    }
}
