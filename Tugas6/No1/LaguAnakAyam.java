/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6.No1;
import java.util.Scanner;
/**
 *
 * @author lala_
 */
public class LaguAnakAyam {
    public void LaguAnakAyam(){
        Scanner input = new Scanner(System.in);
        
        // meminta input jumlah anak ayam dari pengguna
        System.out.print("Masukkan jumlah anak ayam : ");
        int n = input.nextInt();
        
        // mengecek apakah jumlah anak ayam valid (harus lebih dari 0)
        if(n < 1){
            System.out.println("\nJumlah anak ayam harus lebih dari 0");        // jika tidak valid, menampilkan pesan kesalahan
        } else {
            // jika valid, menampilkan lirik lagu
            LirikSatu();
            
            // loop untuk mencetak jumlah anak ayam dari likit
            for (int i = n; i > 0; i--){
                System.out.println("Anak ayam turunlah " + i);
                
                // jika tinggal satu anak ayam, akan menampilkan lirik tersebut
                if (i == 1){
                    System.out.println("Pergi satu, tinggal induknya");
                } else {
                    System.out.println("Pergi satu, tinggallah " + (i - 1));
                }
                
                // menampilkan lirikDua setelah setiap 2 kali iterasi 
                if (i > 1 && (n - i + 1) % 2 == 0){
                    LirikSatu();
                    }
                }
            }
            LirikDua();
        }
    
    
    // untuk menampilkan lirik pertama
    public static void LirikSatu(){
        System.out.println();
        for (int i = 0; i < 2; i++){
            System.out.println("Tek-kotek-kotek-kotek");
            System.out.println("Anak ayam turun berkotek");
        }
        System.out.println();
    }
    
    // untuk menampilkan lirik kedua
    public static void LirikDua(){
        System.out.println("\nTek-kotek-kotek-kotek");
        System.out.println("induk ayam cari anaknya");
        System.out.println("Tek-kotek-kotek-kotek");
        System.out.println("Akhirnya ketemu semua\n");
    }
    
}
