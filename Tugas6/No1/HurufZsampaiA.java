/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6.No1;

/**
 *
 * @author lala_
 */
public class HurufZsampaiA {
    // menampilkan huruf dari z hingga A
    public void HurufZsampaiA(){
        System.out.print("\nHuruf Z - A : ");
        char huruf = 'Z';                       // inisialisasi huruf mulai dari z
        
        // loop do-while untuk mencetak huruf dari z ke A
        do {    
            System.out.print(huruf + " ");
            huruf--;                        // mengurangi nilai huruf ke huruf sebelumnya
        } while (huruf >= 'A');             // berhenti jika telah mencapai huruf A
        System.out.println();
    }
    
}
