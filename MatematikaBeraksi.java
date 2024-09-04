/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas2;

/**
 *
 * @author lala_
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    
    /* Fungsi untuk membuat garis*/
    public static void garis(char karakter, int panjang){
        System.out.print("+"); /* Karakter diawal garis */
        for(int i = 0; i < panjang; i++){
            System.out.print(karakter);
        }
        System.out.println("+"); /* Karakter diakhir garis */
    }
    
    public static void judul(String jdl){  
        System.out.println(jdl);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        
        int hasilPertambahan = mtk.Pertambahan(20, 10);
        int hasilPengurangan = mtk.Pengurangan(10, 5);
        int hasilPerkalian = mtk.Perkalian(10, 3);
        int hasilPembagian = mtk.Pembagian(21, 2);
        
        /* Menampilkan judul */
        judul("\t\t    TABEL OPERASI ARITMATIKA");
        
        /* Menampilkan hasil dari operasi matematika */
        garis('-', 59);
        System.out.println("| Operasi Aritmatika \t| Ekspresi\t\t| Hasil \t|");
        garis('-', 59);
        System.out.println("| Pertambahan \t\t| 20 + 10\t\t| "+hasilPertambahan+" \t\t|");
        System.out.println("| Pengurangan \t\t| 10 - 5\t\t| " +hasilPengurangan+" \t\t|");
        System.out.println("| Perkalian \t\t| 10 * 3\t\t| "+hasilPerkalian+" \t\t|");
        System.out.println("| Pembagian \t\t| 21 / 2\t\t| "+hasilPembagian+" \t\t|");
        garis('-', 59);
    }
    
}
