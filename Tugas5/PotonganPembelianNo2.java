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
public class PotonganPembelianNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat objek scanner untuk menerima input dari pengguna 
        Scanner input = new Scanner(System.in);
       
        System.out.println("+-----------------------------------------------+");
        System.out.println("|               TOTAL PEMBELIAN                 |");
        System.out.println("+-----------------------------------------------+");
        
        // Meminta input total pembelian dari pengguna
        System.out.print(" Masukkan Total Pembelian (Rp) : ");
        double totalpembelian = input.nextDouble();
        System.out.println("+-----------------------------------------------+");
        
        // variabel untuk berapa besar potongan yang didapat 
        double potongan;
        
        // Menentukan potongan berdasarkan total pembelian
        if (totalpembelian < 50000){
            potongan = 0.05 * totalpembelian; // potongan 5% jika pembelian kurang dari 50.000
        } else {
            potongan = 0.2 * totalpembelian; // potongan 20% jika pembelian Rp 50.000 atau lebih dari 50.000
        }
        
        // Menghitung jumlah yang harus dibayar setelah potongan 
        double totalbayar = totalpembelian - potongan;
        
        // Menampilkan rincian pembayaran kepada pengguna
        System.out.println("\n+-----------------------------------------------+");
        System.out.println("|               RINCIAN PEMBAYARAN              |");
        System.out.println("+-----------------------------------------------+");
        System.out.println(" Total Pembelian    : Rp " + totalpembelian);
        System.out.println(" Besarnya Potongan  : Rp " + potongan);
        System.out.println(" jumlah yang harus dibayarkan : Rp " + totalbayar);
        System.out.println("+-----------------------------------------------+");
        System.out.println("|           TERIMA KASIH ATAS PEMBELIAN         |");
        System.out.println("+-----------------------------------------------+\n");
        
    }
    
}
