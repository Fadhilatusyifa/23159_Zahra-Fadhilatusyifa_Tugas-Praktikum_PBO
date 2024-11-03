/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas9;
import javax.swing.*;                           
import javax.swing.table.DefaultTableModel;     // mengimpor DefaultTabelModel untuk tabel
import java.util.ArrayList;                     // mengimpor ArrayList untuk menyimpan data mahasiswa

/**
 *
 * @author lala_
 */
public class PenghitungNilaiMhs extends javax.swing.JFrame {
    private DefaultTableModel modelMahasiswa;       // model untuk tabel yang menyimpan data mahasiswa
    private InputNilaiMahasiswa dataMahasiswa;      // objek untuk mengelola data mahasiswa
   
    // konstruktor untuk inisialisasi kelas PenghitungNilaiMhs
    public PenghitungNilaiMhs(){    
        initComponents();     
        dataMahasiswa = new InputNilaiMahasiswa();  // membuat objek InputNilaiMahasiswa untuk mengelola data mahasiswa
        viewDataTabel();    // menampilkan data mahasiswa ke dalam tabel
    }
    
    public final void viewDataTabel(){
        // mendefinisikan nama kolom untuk tabel
        String[] namaKolom = {"NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai AKhir"};
        // membuat array objek untuk menyimpan data mahasiswa, dengan ukuran 100
        Object[][] objekMahasiswa = new Object[dataMahasiswa.getAll().size()][100];
        
        int i = 0;  // inisialisasi indeks untuk pengisian data mahasiswa
        // looping untuk mengisi data mahasiswa dari inputNilaiMahasiswa
        for (Mahasiswa mhs : dataMahasiswa.getAll()){
            // mengambil data dari objek Mahasiswa dan menyimpannya dalam array
            String[] arrayMahasiswa = {
                mhs.getNIM(),
                mhs.getNama(),
                mhs.getAlamat(),
                mhs.getMataKuliah(),
                String.format("%.2f", mhs.getNilaiAKhir())  // mendapatkan nilai Akhir dan format menjadi 2 desimal
            };
            objekMahasiswa[i] = arrayMahasiswa; // menyimpan array mahasiswa ke dalam objekMahasiswa
            i++;    
        }
        
        // membuat model tabel dengan data mahasiswa dan nama kolom
        modelMahasiswa = new DefaultTableModel(objekMahasiswa, namaKolom);
        // mengaktifkan model tabel ke JTable (MahasiswaTB)
        MahasiswaTB.setModel(modelMahasiswa);
        
        // jika ada data mahasiswa, ambil dan tampilkan nilai akhir mahasiswa di dalam nilaiAKhir JTextField
        if (!dataMahasiswa.getAll().isEmpty()){
            Mahasiswa mahasiswa = dataMahasiswa.getAll().get(0);    // mendapatkan mahasiswa
            double nilaiakhirfield = mahasiswa.getNilaiAKhir();     // mendapatkan nilai akhir mahasiswa
            
            // mengatur nilai akhir pada textfield nilaiAkhirTF dengan format 2 desimal
            nilaiAkhirTF.setText(String.format("%.2f", nilaiakhirfield));
        }
    }
    
    // membersihkan semua field teks
    public void clearTextField(){
        // mengatur teks pada masing-masing text field menjadi string kosong
        nimTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        mataKuliahTF.setText("");
        nilai1TF.setText("");
        nilai2TF.setText("");
        nilai3TF.setText("");
        nilai4TF.setText("");
        nilai5TF.setText("");
        nilaiAkhirTF.setText("");
        nimTF.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nilaiAkhirTF = new javax.swing.JTextField();
        nimTF = new javax.swing.JTextField();
        namaTF = new javax.swing.JTextField();
        alamatTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mataKuliahTF = new javax.swing.JTextField();
        nilai1TF = new javax.swing.JTextField();
        nilai2TF = new javax.swing.JTextField();
        nilai3TF = new javax.swing.JTextField();
        nilai4TF = new javax.swing.JTextField();
        nilai5TF = new javax.swing.JTextField();
        hapusBT = new javax.swing.JButton();
        SimpanBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MahasiswaTB = new javax.swing.JTable();
        HapusTabelBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NIM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nilai Akhir");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Alamat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        nilaiAkhirTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nilaiAkhirTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiAkhirTFActionPerformed(evt);
            }
        });
        jPanel1.add(nilaiAkhirTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 210, 40));

        nimTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nimTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTFActionPerformed(evt);
            }
        });
        jPanel1.add(nimTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 240, 40));

        namaTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });
        jPanel1.add(namaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 240, 40));

        alamatTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alamatTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTFActionPerformed(evt);
            }
        });
        jPanel1.add(alamatTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 240, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Mata Kuliah");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nilai 1 [10%]");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nilai 2 [15%]");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nilai 3 - UTS [25%]");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nilai 4 [15%]");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Nilai 5 [35%]");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        mataKuliahTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mataKuliahTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mataKuliahTFActionPerformed(evt);
            }
        });
        jPanel1.add(mataKuliahTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 240, 40));

        nilai1TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nilai1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai1TFActionPerformed(evt);
            }
        });
        jPanel1.add(nilai1TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 210, 40));

        nilai2TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nilai2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai2TFActionPerformed(evt);
            }
        });
        jPanel1.add(nilai2TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 210, 40));

        nilai3TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nilai3TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai3TFActionPerformed(evt);
            }
        });
        jPanel1.add(nilai3TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 210, 40));

        nilai4TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nilai4TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai4TFActionPerformed(evt);
            }
        });
        jPanel1.add(nilai4TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 210, 40));

        nilai5TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nilai5TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai5TFActionPerformed(evt);
            }
        });
        jPanel1.add(nilai5TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 210, 40));

        hapusBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hapusBT.setText("Hapus");
        hapusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTActionPerformed(evt);
            }
        });
        jPanel1.add(hapusBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 110, 40));

        SimpanBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SimpanBT.setText("Simpan");
        SimpanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanBTActionPerformed(evt);
            }
        });
        jPanel1.add(SimpanBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 110, 40));

        MahasiswaTB.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        MahasiswaTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"
            }
        ));
        MahasiswaTB.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(MahasiswaTB);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 830, 200));

        HapusTabelBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HapusTabelBT.setText("Hapus Tabel");
        HapusTabelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusTabelBTActionPerformed(evt);
            }
        });
        jPanel1.add(HapusTabelBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nilaiAkhirTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiAkhirTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiAkhirTFActionPerformed

    private void nimTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTFActionPerformed

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void alamatTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTFActionPerformed

    private void mataKuliahTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mataKuliahTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mataKuliahTFActionPerformed

    private void nilai1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai1TFActionPerformed

    private void nilai2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai2TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai2TFActionPerformed

    private void nilai3TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai3TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai3TFActionPerformed

    private void nilai4TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai4TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai4TFActionPerformed

    private void nilai5TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai5TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai5TFActionPerformed

    private void hapusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTActionPerformed
            // memanggil fungsi untuk membersihkan semua field teks
            clearTextField();
    }//GEN-LAST:event_hapusBTActionPerformed

    private void SimpanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanBTActionPerformed
    try {
        // menga,nil nilai dari field teks dan menyimpannya dalam variabel
        String NIM = nimTF.getText();
        String Nama = namaTF.getText();
        String Alamat = alamatTF.getText();
        String mataKuliah = mataKuliahTF.getText();
        
        // mengambil nilai dari field teks dan mengonversinya menjadi tipe double
        double nilai1 = Double.parseDouble(nilai1TF.getText());
        double nilai2 = Double.parseDouble(nilai2TF.getText());
        double nilai3 = Double.parseDouble(nilai3TF.getText());
        double nilai4 = Double.parseDouble(nilai4TF.getText());
        double nilai5 = Double.parseDouble(nilai5TF.getText());
        
        // memasukkan data mahasiswa ke dalam daftar mahasiswa
        dataMahasiswa.insertData(NIM, Nama, Alamat, mataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        
        // memanggil fungsi untuk memperbarui tampilan tabel dan menampilkan data terbaru
        viewDataTabel();
    } catch (NumberFormatException e){
        // menampilkan pesan kesalahan jika nilai tidak dapat dikonversi menjadi angka
        JOptionPane.showMessageDialog(this, "Nilai harus berupa angka.");
    }
    }//GEN-LAST:event_SimpanBTActionPerformed

    private void HapusTabelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusTabelBTActionPerformed
        // mengambil indeks barus yang dipilih dari tabel MahasiswaTB
        int selectedRow = MahasiswaTB.getSelectedRow();
        
        // memeriksa apakah ada baris yang dipilih
        if (selectedRow != -1){
            
            // menghapus data mahasiswa yang terpilih berdasarkan indeks baris
            dataMahasiswa.deleteData(selectedRow);
            
            // memanggil fungsi untuk memperbarui tampilan tabel dan menampilkan data terbaru
            viewDataTabel();
        } else {
            // menampilkan pesan kesalahan jika tidak ada baris yang dipilih
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus.");
        }
    }//GEN-LAST:event_HapusTabelBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenghitungNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungNilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungNilaiMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HapusTabelBT;
    private javax.swing.JTable MahasiswaTB;
    private javax.swing.JButton SimpanBT;
    private javax.swing.JTextField alamatTF;
    private javax.swing.JButton hapusBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mataKuliahTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField nilai1TF;
    private javax.swing.JTextField nilai2TF;
    private javax.swing.JTextField nilai3TF;
    private javax.swing.JTextField nilai4TF;
    private javax.swing.JTextField nilai5TF;
    private javax.swing.JTextField nilaiAkhirTF;
    private javax.swing.JTextField nimTF;
    // End of variables declaration//GEN-END:variables
}
