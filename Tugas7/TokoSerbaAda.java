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
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // deklarasi data barang : kode, nama, dan harga
        String[] kodeBarang = {"a001", "a002", "a003"};         // kode barang
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};     // nama barang
        int[] hargaBarang = {3000, 4000, 5000};                 // harga barang
        
        // menampilkan header dan daftar barang yang tersedia
        System.out.println("+===========================================================================+");
        System.out.println("|                     SELAMAT DATANG DI TOKO SERBA ADA                      |");
        System.out.println("+===========================================================================+");
        System.out.println("DAFTAR BARANG");
        System.out.println("+---------------------------------------------+");
        System.out.println("|  Kode Barang  |   Nama Barang   |   Harga   |");
        System.out.println("+---------------|-----------------|-----------|");
        System.out.println("| a001          | Buku            | 3000      |");
        System.out.println("| a002          | Pensil          | 4000      |");
        System.out.println("| a003          | Pulpen          | 5000      |");
        System.out.println("+---------------------------------------------+");
        
        // meminta pengguna untuk memasukkan jumlah item yang akan dibeli
        System.out.print("\nMasukkan jumlah item Barang : ");
        int jumlahItem = input.nextInt();       // menyimpan jumlah item
        
        
        // deklarasi array untuk menyimpan data transaksi pengguna
        String[] Kode = new String[jumlahItem];     // menyimpan kode barang yang dipilih
        int[] jumlahBeli = new int[jumlahItem];     // menyimpan jumlah barang yang dibeli
        int[] jumlahBayar = new int[jumlahItem];    // menyimpan total bayar untuk setiap barang
        int totalBayar = 0;     // menyimpan total keseluruhan pembayaran
        
        
        // loop untuk setiap item yang akan dibeli
        for (int i = 0; i < jumlahItem; i++){
            System.out.println("\nData ke-" + (i + 1));     // menunjukkan item keberapa
            System.out.print("Masukkan Kode Barang : ");
            Kode[i] = input.next();     // memasukkan kode barang
            System.out.print("Masukkan Jumlah Beli : ");
            jumlahBeli[i] = input.nextInt();    // memasukkan jumlah beli
            
            // loop untuk mencetak kode barang dan menghitung total bayar
            for (int j = 0; j < kodeBarang.length; j++){
                if (Kode[i].equals(kodeBarang[j])){     // jika barang cocok
                    jumlahBayar[i] = jumlahBeli[i] * hargaBarang[j];        // menghitung total bayar untuk barang tersebut
                    totalBayar += jumlahBayar[i];       // menambah total bayar keseluruhan
                    break;   
                }
            }
        }
        
        // menampilkan hasil transaksi 
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*****************************************************************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("=============================================================================");
        
        // loop untuk menampilkan setiap barang yang dibeli
        for (int i = 0; i < jumlahItem; i++){
            for (int j = 0; j < kodeBarang.length; j++){
                if (Kode[i].equals(kodeBarang[j])){     // mencocokkan kode barang untuk menampilkan detailnya
                    // menyusun informasi barang yang dibeli
                    String no = (i + 1)+ "";
                    String kode = Kode[i];
                    String nama = namaBarang[j];
                    String harga = hargaBarang[j] + "";
                    String jumlah = jumlahBeli[i] + "";
                    String total = jumlahBayar[i] + "";
                    
                    // menampilkan informasi barang
                    System.out.println(no + "\t" + kode + "\t\t" + nama + "\t\t" + harga + "\t" + jumlah + "\t\t" + total);
                    
                }
            }
        }
        
        // menampilkan total bayar untuk barang yang telah dibeli
        System.out.println("=============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("=============================================================================\n\n");
       
    }
    
}
