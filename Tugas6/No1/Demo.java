/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6.No1;
import java.util.Scanner;
/**
 *
 * @author lala_
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        DeretbilPrimadanBukan prima = new DeretbilPrimadanBukan();
        DeretbilGanjildanGenap genapganjil = new DeretbilGanjildanGenap();
        HurufZsampaiA hurufZA = new HurufZsampaiA();
        LaguAnakAyam lagu = new LaguAnakAyam();
        
        int pil;
        
        do {
            System.out.println("\n\n+---------------------------------------------------+");
            System.out.println("|                   TAMPILAN MENU                   |");
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Deret Bilangan Prima dan bukan Prima dari 0 - 20");
            System.out.println("2. Deret Bilangan Ganjil dan Genap dari 0 - 20");
            System.out.println("3. Huruf Z - A ");
            System.out.println("4. Lagu Anak Ayam");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan anda : ");
            pil = input.nextInt();
        
            switch (pil){
                case 1:
                    System.out.println("\n\n+-----------------------------------------------------------------+");
                    System.out.println("|                   BILANGAN PRIMA DAN BUKAN PRIMA                |");
                    System.out.println("+-----------------------------------------------------------------+");
                    prima.DeretbilPrima();
                    prima.DeretBukanbilPrima();
                    break;
                case 2:
                    System.out.println("\n\n+---------------------------------------------------+");
                    System.out.println("|             BILANGAN GANJIL DAN GENAP             |");
                    System.out.println("+---------------------------------------------------+");
                    genapganjil.DeretbilGanjil();
                    genapganjil.DeretbilGenap();
                    break;
                case 3:
                    System.out.println("\n\n+----------------------------------------------------------------+");
                    System.out.println("|                           HURUF Z - A                          |");
                    System.out.println("+----------------------------------------------------------------+");
                    hurufZA.HurufZsampaiA();
                    break;
                case 4:
                    System.out.println("\n\n+---------------------------------------------------+");
                    System.out.println("|               LAGU ANAK AYAM TURUN                |");
                    System.out.println("+---------------------------------------------------+");
                    lagu.LaguAnakAyam();
                    break;
                case 5:
                    System.out.println("\n+---------------------------------------------------+");
                    System.out.println("|         Keluar dari Program. Terima Kasih!        |");
                    System.out.println("+---------------------------------------------------+");
                    break;
                default:
                    System.out.println("\n+---------------------------------------------------+");
                    System.out.println("|            Pilihan Anda tidak valid.              |");
                    System.out.println("+---------------------------------------------------+");
            }
            
        } while (pil != 5);
    }
    
}
