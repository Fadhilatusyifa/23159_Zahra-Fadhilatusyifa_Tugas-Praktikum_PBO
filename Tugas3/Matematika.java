/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author lala_
 */
public class Matematika {
    public int tambah(int a, int b){
        return a + b;
    } 
    
    public int kurang(int a, int b){
        return a - b;
    }
    
    public int Kali(int a, int b){
        return a * b;
    }
    
    public int Bagi(int a, int b){
        if (b != 0){ /*menghindari Pembagian dengan nol*/
            return a / b;
        } else {
            System.out.println("Pembagi tidak boleh nol");
            return 0;
        }
        
    }
}
