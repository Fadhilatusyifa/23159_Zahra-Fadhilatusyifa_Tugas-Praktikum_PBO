/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author lala_
 */
public class Matematika implements InterfaceMatematika {
    
    @Override
    public int Pertambahan (int a, int b){
        return a + b;
    } 
    
    @Override 
    public int Pengurangan (int a, int b){
        return a - b;
    }
    
    @Override
    public int Perkalian (int a, int b){
        return a * b;
    }
    
    @Override 
    public int Pembagian (int a, int b){
        if (b != 0){ /*menghindari Pembagian dengan nol*/
            return a / b;
        } else {
            System.out.println("Pembagi tidak boleh nol");
            return 0;
        }
        
    }
    
}
