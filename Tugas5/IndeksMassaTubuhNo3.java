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
public class IndeksMassaTubuhNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat objek scanner untuk menerima input dari pengguna 
        Scanner input = new Scanner(System.in);
       
        System.out.println("+------------------------------------ --+");
        System.out.println("|       Program Perhitungan Indeks      |");
        System.out.println("|            Massa Tubuh (IMT)          |");
        System.out.println("+---------------------------------------+");
        
        // Meminta kepada pengguna untuk menginput berat badan
        System.out.print(" Masukkan Berat Badan Anda (kg)  : ");
        double BB = input.nextDouble();
        
        // Meminta kepada pengguna untuk menginput tinggi badan
        System.out.print(" Masukkan Tinggi Badan Anda (cm) : ");
        double TB = input.nextDouble();
        
        // mengkonversi tinggi badan dari cm ke meter
        double TBmeter = TB / 100;
        
        // Menghitung IMT 
        double IMT = BB / (TBmeter * TBmeter);
        
        // Menentukan kriteria berdasarkan nilai IMT
        String kriteria;
        if (IMT <= 18.4){
            kriteria = "Berat Badan Kurang"; 
        } else if (IMT >= 18.5 && IMT <= 24.9){
            kriteria = "Berat Badan Ideal";
        } else if (IMT >= 25 && IMT <= 29.9){
            kriteria = "Berat Badan Lebih";
        } else if (IMT >= 30 && IMT <= 39.9){
            kriteria = "Gemuk";
        } else{
            kriteria = "Sangat Gemuk";
        }
        
        // Menampilkan Tabel Kriteria IMT 
        System.out.println("\n+---------------------------------------+");
        System.out.println("|           TABEL KRITERIA IMT          |");
        System.out.println("+---------------------------------------+");
        System.out.println("| Nilai IMT        | Kriteria           |");
        System.out.println("|------------------|--------------------|");
        System.out.println("| 18.4 Kebawah     | Berat Badan Kurang |");
        System.out.println("| 18.5 - 24.9      | Berat Badan Ideal  |");
        System.out.println("| 25 - 29.9        | Berat Badan Lebih  |");
        System.out.println("| 30 - 39.9        | Gemuk              |");
        System.out.println("| 40 Keatas        | Sangat Gemuk       |");
        System.out.println("+---------------------------------------+");
        
        // Menampilkan hasil perhitungan IMT dan kriteria
        System.out.println("\n+----------------------------------------------+");
        System.out.println("|           Hasil Perhitungan Indeks           |");
        System.out.println("|               Massa Tubuh (IMT)              |");
        System.out.println("+----------------------------------------------+");
        System.out.printf("\n Indeks Massa Tubuh Anda : %.2f\n",IMT); // Menampilkan nilai IMT dengan 2 angka desimal 
        System.out.println(" Kriteria                : " + kriteria); // menampilkan kriteria berdasarkan imt
        System.out.println("\n+----------------------------------------------+");
        System.out.println("|         Terima Kasih Telah Menggunakan       |");
        System.out.println("|           Program Perhitungan IMT kami!      |");
        System.out.println("+----------------------------------------------+");   
    }
    
}
