/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

/**
 *
 * @author lala_
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        // contoh suhu
        double suhucelcius = 25;
        double suhufahrenheit = 77;
        
        // Memanggil method konversi
        double hasilFahrenheit = konversi.celciusTofahrenheit(suhucelcius);
        double hasilreamurdaricelcius = konversi.celsiusToreamur(suhucelcius);
        double hasilreamurdarifahrenheit = konversi.fahrenheitToreamur(suhufahrenheit);
        
        // Menampilkan hasil konversi dengan tabel yang terpisah 
        System.out.println("\nKONVERSI SUHU");
       
        System.out.println("\nKonversi dari Celcius ke Fahrenheit");
        System.out.println("+=============================+");
        System.out.println("| No | Suhu\t| Hasil\t\t|");
        System.out.println("|-----------------------------|");
        System.out.println("| 1  | " + suhucelcius + "\t| " + hasilFahrenheit + " \t\t|" );
        System.out.println("+=============================+");
        
        System.out.println("\nKonversi dari Celcius ke Reamur");
        System.out.println("+=============================+");
        System.out.println("| No | Suhu\t| Hasil\t\t|");
        System.out.println("|-----------------------------|");
        System.out.println("| 1  | " + suhucelcius + "\t| " + hasilreamurdaricelcius + " \t\t|" );
        System.out.println("+=============================+");
       
        System.out.println("\nKonversi dari Fahrenheit ke Reamur");
        System.out.println("+=============================+");
        System.out.println("| No | Suhu\t| Hasil\t\t|");
        System.out.println("|-----------------------------|");
        System.out.println("| 1  | " + suhucelcius + "\t| " + hasilreamurdarifahrenheit + " \t\t|" );
        System.out.println("+=============================+");
    }
    
}
