/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

/**
 *
 * @author lala_
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void garis(char karakter, int panjang){
        System.out.print("+"); // karakter di awal garis
        for(int i = 0; i < panjang; i++){
            System.out.print(karakter); // menggunakan print unruk mencetak tanpa pindah baris
        }
        System.out.println("+"); //karakter di akhir garis
    }
    
    public static void judul(String jdl){
        System.out.println(jdl);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika2 m2 = new Matematika2();
        
        // menampilkan judul
        judul("\t\t   TABEL OPERASI ARITMATIKA");
        
        // menampilkan hasil dari operasi aritmatika
        garis('-', 59);
        System.out.println("| Operasi Aritmatika \t| Ekspresi\t\t| Hasil \t|");
        garis('-', 59);
        System.out.println("| Pertambahan \t\t| 20 + 10\t\t| " + m2.tambah(10, 20) + " \t\t|");
        System.out.println("| Pengurangan \t\t| 10 - 5\t\t| " + m2.kurang(10, 5) + " \t\t|");
        System.out.println("| Perkalian \t\t| 10 * 3\t\t| " + m2.Kali(10, 3) + " \t\t|");
        System.out.println("| Pembagian \t\t| 21 / 2\t\t| " + m2.Bagi(21, 2) + " \t\t|");
        System.out.println("| Modulus   \t\t| 10 % 5\t\t| " + m2.modulus(10, 5) + " \t\t|");
        garis('-', 59);
    }
    
}
