/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6.No1;

/**
 *
 * @author lala_
 */
public class DeretbilGanjildanGenap {
    // menampilkan deret bil genap dari 0 - 20
    public void DeretbilGenap(){
        System.out.print("\nBilangan genap 0 - 20  : ");
        int i = 0;
        
        // loop untuk mencetak bil genap
        while (i <= 20){
            if(i % 2 == 0){                 // memeriksa apakah bil genap atau bukan 
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
    
    // menampilkan deret bil ganjil dari 0 - 20
    public void DeretbilGanjil(){
        System.out.print("\nBilangan ganjil 0 - 20 : ");
        int i = 1;
        
        // loop untuk mencetak bil ganjil
        while (i <= 20){
            if(i % 2 != 0){                 // memeriksa apakah bil ganjil atau bukan
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
    
    
}
