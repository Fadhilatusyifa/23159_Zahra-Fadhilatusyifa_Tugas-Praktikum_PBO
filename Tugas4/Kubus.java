/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author lala_
 */
public class Kubus extends BangunRuang{ //SubClass dari BangunRuang
    private double sisi;
    
    // Konstruktor untuk menginisialisasi sisi kubus
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    
    public double getsisi(){
        return sisi;
    }
    // override method unruk menghitung volume kubus
    @Override
    public double hitungvolume(){
        return sisi * sisi * sisi;
    }
    
    // override method untuk menghitung luas bpermukaan kubus
    @Override
    public double hitungluaspermukaan(){
        return 6 * sisi * sisi;
    }
    
}
