/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6.No2;
import java.util.Scanner;
/**
 *
 * @author lala_
 */
public class TabelPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n; 
        
        // perulangan do-while untuk meminta input yang valid (antara 1 - 10)
        do {
            System.out.println("+=====================================+");
            System.out.println("|           TABEL PERKALIAN           |");
            System.out.println("+=====================================+");
            System.out.print("Masukkan nilai antara 1 sampai 10 : ");
            n = input.nextInt();
        
            // memeriksa apakah nilai n berada di luar rentang 1 sampai 10
            if (n < 1 || n > 10){
                // jika nilai tidak valid, menampilkan pesan kesalahan
                System.out.println("\nNilai harus diantara 1 sampai 10.\n");
            } 
        } while (n < 1 || n > 10 );     // mengulang jika nilai n tidak valid
        
            // menampilkan deret angka sebagai header tabel
            System.out.print("\n\t");
            for (int j = 1; j <= n; j++){
                System.out.print(j + "\t");     // menampilkan angka dari 1 sampai n secara horizontal
            }
            System.out.println();
            
            // loop untuk menampilkan tabel perkalian 
            for (int i = 1; i <= n; i++){
                System.out.print(i + "\t");     // menampilkan angka pertama dari setiap baris (sebagai pembuka baris)
                for (int j = 1; j <= n; j++){
                    int hasil = i * j;                  // menghitung hasil perkalian anatar i dan j
                    System.out.print(hasil + "\t");     // menampilkan hasil perkalian
                }
                System.out.println();       // pindah ke baris berikutnya setelah selesai satu baris
            }
        // menutup objek scanner setelah selesai digunakan
        input.close(); 
    }
    
}
