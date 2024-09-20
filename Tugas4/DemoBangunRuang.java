/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas4;

/**
 *
 * @author lala_
 */
public class DemoBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok balok = new Balok(2, 4, 5);
        Kubus kubus = new Kubus(2);
        
        // Menghitung dan menampilkan hasil volume dan luas permukaan balok
        System.out.println("==== Hasil Perhitungan Bangun Ruang ==== ");
        
        System.out.println("\nBalok");
        System.out.println("-----------------------------------------");
        System.out.println("Panjang         : " + balok.getpanjang());
        System.out.println("Lebar           : " + balok.getlebar());
        System.out.println("Tinggi          : " + balok.gettinggi());
        System.out.println("Volume          : " + balok.hitungvolume());
        System.out.println("Luas Permukaan  : " + balok.hitungluaspermukaan());
        
        // Menghitung dan menampilkan hasil volume dan luas permukaan kubus
        System.out.println("\nKubus");
        System.out.println("-----------------------------------------");
        System.out.println("Sisi            : " + kubus.getsisi());
        System.out.println("Volume          : " + kubus.hitungvolume());
        System.out.println("Luas Permukaan  : " + kubus.hitungluaspermukaan());
        System.out.println("\n=========================================");
}
}
