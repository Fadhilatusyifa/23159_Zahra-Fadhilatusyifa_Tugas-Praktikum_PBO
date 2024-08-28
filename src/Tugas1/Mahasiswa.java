/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author lala_
 */
public class Mahasiswa {
    String nama;
    String jurusan;
    int semester;
    
    public Mahasiswa(String nama, String jurusan, int semester){
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
    }
    
    void membaca(){
        System.out.println(nama + " dari jurusan " + jurusan + " sedang membaca buku di perpustakaan.\n");
    }
    
    void nyontek(){
        System.out.println("Mahasiswa bernama " + nama + " dari jurusan " + jurusan + " semester " + semester + " ketahuan mencontek saat ujian mata kuliah PBO.\n");
    }
    
    void modifikasi(){
        System.out.println(nama + " dari jurusan " + jurusan + " semester " + semester + " sedang melakukan modifikasi pada desain website nya agar lebih menarik.\n");
    }
            
    
    
}
