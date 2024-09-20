/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author lala_
 */
public class Balok extends BangunRuang{ // SubClass dari BangunRuang
    private double panjang;
    private double lebar;
    private double tinggi;
    
    // Konstruktor unruk menginisialisasi panjang, lebar, dan tinggi
    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double getpanjang(){
        return panjang;
    }
    
    public double getlebar(){
        return lebar;
    }
    
    public double gettinggi(){
        return tinggi;
    }
    
    // override method untuk menghitung volume balok
    @Override
    public double hitungvolume(){
        return panjang * lebar * tinggi;
    }
     // override method untuk menghitung luas permukaan balok
    @Override
    public double hitungluaspermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
}

