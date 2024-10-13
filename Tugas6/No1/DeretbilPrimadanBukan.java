/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6.No1;

/**
 *
 * @author lala_
 */

public class DeretbilPrimadanBukan {
    
    // untuk menampilkan deret bilangan prima 
    public void DeretbilPrima(){
        // menampilkan bilangan prima dari 0 - 20
        System.out.print("\nBilangan Prima 0 - 20       : ");
        for (int i = 0; i <= 20; i++){
            // bil prima dimulai dari angka 2
            if (i >= 2){
                boolean prima = true; 
                for (int j = 2; j * j <= i; j++){       // memeriksa apakah bil i adalah bil prima
                    if (i % j == 0){                    // jika i habis dibagi j, maka bukan bil prima
                        prima = false;      // bil tidak prima
                        break;
                    }
                }
                // jika prima, cetak angka nya
                if(prima){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
    
    // untuk menampilkan bilangan bukan prima 
    public void DeretBukanbilPrima(){
        // menampilkan bil yang bukan prima dari 0 - 20
        System.out.print("\nBilangan bukan prima 0 - 20 : ");
        for (int i = 0; i <= 20; i++){
            if(i < 2){                          // bil kurang dari 2 pasti bukan bil prima
                System.out.print(i + " ");      // mencetak bilangan 0 dan 1
            } else {
                boolean prima = true;
                for (int j = 2; j * j <= i; j++){   // memeriksa apakah bil i adalah bil prima
                    if (i % j == 0){                // jika i habis dibagi j, maka bukan bil prima
                        prima = false;      // bil tidak prima
                        break;
                    }
                }
                // jika bil tidak prima, cetak angka nya
                if (!prima){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }  
    
}
