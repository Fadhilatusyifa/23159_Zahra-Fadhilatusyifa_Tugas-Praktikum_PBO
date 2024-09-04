/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author lala_
 */
public class Bingo {
    private String[] huruf = {"B", "I", "N", "G", "O"};
    
    public Bingo(){ 
        System.out.println("Bingo | @CoComelon Nursery Rhymes & Kids Songs");
        System.out.println("Sing and play along with Bingo the dog in classic nursery rhyme!");
        System.out.println("\nLyrics:\n");
        
    }
    
    public void cetakLagu(){
        /* Mencetak lirik awal tanpa clap terlebih dahulu */
        cetakVerse(0);
        
        /* Loop untuk mengganti satu huruf dengan (clap) per iterasi */
        for(int clap = 1; clap <= huruf.length; clap++){
            cetakVerse(clap);
        }
    }
    
    private void cetakVerse(int clap){
        /* Menampilkan lirik awal */
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        
        
        /* Mencetak baris dengan pola clap */
        for (int i = 0; i < 3; i++){
            cetakBaris(clap);
        }
        
        /* Menampilkan lirik akhir */
        System.out.println("And Bingo was his name-o.");
        System.out.println();
    }
    
    private void cetakBaris(int clap){
        for(int i = 0; i < huruf.length; i++){
            if (i < clap){
                System.out.print("(clap)");
            } else{
                System.out.print(huruf[i]);
            }
            
            if(i < huruf.length - 1){
                System.out.print("-");
            }
        }
        System.out.println();
    }   
}
