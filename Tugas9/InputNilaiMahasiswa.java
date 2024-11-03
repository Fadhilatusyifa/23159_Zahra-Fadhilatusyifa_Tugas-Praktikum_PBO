/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;
import java.util.ArrayList;
/**
 *
 * @author lala_
 */

// class InputNilaiMahasiswa untuk mengelola data mahasiswa, termasuk memasukkan, menghapus, dan mengambil data mahasiswa.
public class InputNilaiMahasiswa {
    // list untuk menyimpan objek mahasiswa
    private ArrayList<Mahasiswa> listMahasiswa;
    
    // konstruktor untuk menginisialisasi listMahasiswa
    public InputNilaiMahasiswa(){
        listMahasiswa = new ArrayList<>();  // membuat arraylist kosong untuk menyimpan data mahasiswa
    }
    
    // fungsi untuk memasukkan data mahasiswa
    public void insertData(String NIM, String Nama, String Alamat, String mataKuliah,  double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, mataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        // memanggil fungsi hitungNilaiAkhir untuk menghitung nilai akhir
        mhs.hitungNilaiAkhir();
        // menambahkan objek mahasiswa ke dalam list
        listMahasiswa.add(mhs);
    }
    
    // mengambil semua data mahasiswa
    public ArrayList<Mahasiswa> getAll(){
        return listMahasiswa;   // mengembalikan listmahasiswa
    }
    
    // menghapus data mahasiswa berdasarkan indeks
    public void deleteData(int index){
            listMahasiswa.remove(index);    // menghapus mahasiswa dari list berdasarkan indeks yang diberikan pengguna
        }
    }

