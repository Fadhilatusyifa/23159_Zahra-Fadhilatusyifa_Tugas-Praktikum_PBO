/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author lala_
 */
public class Matematika2 extends Matematika {
    public int modulus(int a, int b){
        if (b != 0){
            return a % b;
        } else {
            System.out.println("Modulus dengan 0 tidak diperbolehkan.");
            return 0;
        }
    }
    
    
}
