/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tugas8;

/**
 *
 * @author lala_
 */
public class Kalkulator extends javax.swing.JFrame {

    String angka;
    double angka1;
    double angka2;
    double total;
    public Kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        tombolkurang = new javax.swing.JButton();
        tombolbagi = new javax.swing.JButton();
        tombolAngka8 = new javax.swing.JButton();
        tombolAngka9 = new javax.swing.JButton();
        tomboltambah = new javax.swing.JButton();
        tombolAngka7 = new javax.swing.JButton();
        tombolpersen = new javax.swing.JButton();
        tombolAngka5 = new javax.swing.JButton();
        tombolAngka6 = new javax.swing.JButton();
        tombolKali = new javax.swing.JButton();
        tombolAngka4 = new javax.swing.JButton();
        tombolBersihkan = new javax.swing.JButton();
        tombolAngka2 = new javax.swing.JButton();
        tombolAngka3 = new javax.swing.JButton();
        tombolkeluar = new javax.swing.JButton();
        tombolAngka1 = new javax.swing.JButton();
        tombolkoma = new javax.swing.JButton();
        tombolAngka0 = new javax.swing.JButton();
        tombolsamadengan = new javax.swing.JButton();
        tombolhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 70));

        tombolkurang.setBackground(new java.awt.Color(204, 153, 0));
        tombolkurang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolkurang.setForeground(new java.awt.Color(153, 51, 0));
        tombolkurang.setText("-");
        tombolkurang.setBorder(null);
        tombolkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkurangActionPerformed(evt);
            }
        });
        jPanel1.add(tombolkurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 60, 40));

        tombolbagi.setBackground(new java.awt.Color(204, 153, 0));
        tombolbagi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolbagi.setForeground(new java.awt.Color(153, 51, 0));
        tombolbagi.setText("/");
        tombolbagi.setBorder(null);
        tombolbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolbagiActionPerformed(evt);
            }
        });
        jPanel1.add(tombolbagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 60, 40));

        tombolAngka8.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka8.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka8.setText("8");
        tombolAngka8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka8ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, 40));

        tombolAngka9.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka9.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka9.setText("9");
        tombolAngka9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka9ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 60, 40));

        tomboltambah.setBackground(new java.awt.Color(204, 153, 0));
        tomboltambah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tomboltambah.setForeground(new java.awt.Color(153, 0, 51));
        tomboltambah.setText("+");
        tomboltambah.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tomboltambah.setBorderPainted(false);
        tomboltambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboltambahActionPerformed(evt);
            }
        });
        jPanel1.add(tomboltambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 60, 40));

        tombolAngka7.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka7.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka7.setText("7");
        tombolAngka7.setToolTipText("");
        tombolAngka7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka7ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 40));

        tombolpersen.setBackground(new java.awt.Color(204, 153, 0));
        tombolpersen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolpersen.setForeground(new java.awt.Color(153, 51, 0));
        tombolpersen.setText("%");
        tombolpersen.setBorder(null);
        tombolpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolpersenActionPerformed(evt);
            }
        });
        jPanel1.add(tombolpersen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 60, 40));

        tombolAngka5.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka5.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka5.setText("5");
        tombolAngka5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka5ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, 40));

        tombolAngka6.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka6.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka6.setText("6");
        tombolAngka6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka6ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 60, 40));

        tombolKali.setBackground(new java.awt.Color(204, 153, 0));
        tombolKali.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolKali.setForeground(new java.awt.Color(153, 51, 0));
        tombolKali.setText("*");
        tombolKali.setBorder(null);
        tombolKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKaliActionPerformed(evt);
            }
        });
        jPanel1.add(tombolKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 60, 40));

        tombolAngka4.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka4.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka4.setText("4");
        tombolAngka4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)));
        tombolAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka4ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 40));

        tombolBersihkan.setBackground(new java.awt.Color(204, 153, 0));
        tombolBersihkan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolBersihkan.setForeground(new java.awt.Color(153, 51, 0));
        tombolBersihkan.setText("C");
        tombolBersihkan.setBorder(null);
        tombolBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBersihkanActionPerformed(evt);
            }
        });
        jPanel1.add(tombolBersihkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, 40));

        tombolAngka2.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka2.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka2.setText("2");
        tombolAngka2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka2ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 60, 40));

        tombolAngka3.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka3.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka3.setText("3");
        tombolAngka3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka3ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, 40));

        tombolkeluar.setBackground(new java.awt.Color(204, 153, 0));
        tombolkeluar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolkeluar.setForeground(new java.awt.Color(153, 51, 0));
        tombolkeluar.setText("E");
        tombolkeluar.setBorder(null);
        tombolkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(tombolkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 40));

        tombolAngka1.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka1.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka1.setText("1");
        tombolAngka1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka1ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 40));

        tombolkoma.setBackground(new java.awt.Color(0, 0, 0));
        tombolkoma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolkoma.setForeground(new java.awt.Color(255, 255, 255));
        tombolkoma.setText(".");
        tombolkoma.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkomaActionPerformed(evt);
            }
        });
        jPanel1.add(tombolkoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, 40));

        tombolAngka0.setBackground(new java.awt.Color(0, 0, 0));
        tombolAngka0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolAngka0.setForeground(new java.awt.Color(255, 255, 255));
        tombolAngka0.setText("0");
        tombolAngka0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));
        tombolAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAngka0ActionPerformed(evt);
            }
        });
        jPanel1.add(tombolAngka0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, 40));

        tombolsamadengan.setBackground(new java.awt.Color(204, 153, 0));
        tombolsamadengan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolsamadengan.setForeground(new java.awt.Color(153, 51, 0));
        tombolsamadengan.setText("=");
        tombolsamadengan.setBorder(null);
        tombolsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolsamadenganActionPerformed(evt);
            }
        });
        jPanel1.add(tombolsamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 60, 40));

        tombolhapus.setBackground(new java.awt.Color(204, 153, 0));
        tombolhapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tombolhapus.setForeground(new java.awt.Color(153, 51, 0));
        tombolhapus.setText("B");
        tombolhapus.setBorder(null);
        tombolhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolhapusActionPerformed(evt);
            }
        });
        jPanel1.add(tombolhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka7ActionPerformed
        angka = display.getText()+7;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka7ActionPerformed

    private void tombolAngka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka0ActionPerformed
        angka = display.getText()+0;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka0ActionPerformed

    private void tombolAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka1ActionPerformed
        angka = display.getText()+1;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka1ActionPerformed

    private void tombolAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka2ActionPerformed
        angka = display.getText()+2;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka2ActionPerformed

    private void tombolAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka3ActionPerformed
        angka = display.getText()+3;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka3ActionPerformed

    private void tombolAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka4ActionPerformed
        angka = display.getText()+4;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka4ActionPerformed

    private void tombolAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka5ActionPerformed
        angka = display.getText()+5;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka5ActionPerformed

    private void tombolAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka6ActionPerformed
        angka = display.getText()+6;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka6ActionPerformed

    private void tombolAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka8ActionPerformed
        angka = display.getText()+8;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka8ActionPerformed

    private void tombolAngka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAngka9ActionPerformed
        angka = display.getText()+9;
        display.setText(angka);
    }//GEN-LAST:event_tombolAngka9ActionPerformed

    private void tombolkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkomaActionPerformed
        angka = display.getText()+".";
        display.setText(angka);
    }//GEN-LAST:event_tombolkomaActionPerformed

    private void tomboltambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboltambahActionPerformed
        angka = display.getText()+ " + ";
        display.setText(angka);
    }//GEN-LAST:event_tomboltambahActionPerformed

    private void tombolkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkurangActionPerformed
        angka = display.getText()+ " - ";
        display.setText(angka);
    }//GEN-LAST:event_tombolkurangActionPerformed

    private void tombolKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKaliActionPerformed
        angka = display.getText()+ " * ";
        display.setText(angka);
    }//GEN-LAST:event_tombolKaliActionPerformed

    private void tombolbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolbagiActionPerformed
        angka = display.getText()+ " / ";
        display.setText(angka);
    }//GEN-LAST:event_tombolbagiActionPerformed

    private void tombolsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolsamadenganActionPerformed
        String inputText = display.getText().trim(); // mengambil dan membersihkan input dari tampilan
        
        // mengecek jika input diakhiri dengan simbol persen
        if (inputText.endsWith("%")){
            double angka = Double.parseDouble(inputText.substring(0, inputText.length() - 1).trim());
            total = angka / 100.0;  // menghitung nilai persentase
        }
        
        // mengecek jika ada spasi, menandakan adanya operasi aritmatika
        else if (inputText.contains(" ")){
            int operatorIndex = inputText.indexOf(" "); // menemukan indeks operator
            String operator = inputText.substring(operatorIndex + 1, operatorIndex + 2);    // mengambil operator
            
            angka1 = Double.parseDouble(inputText.substring(0, operatorIndex).trim());  // mengambil angka pertama
            int angka2start = operatorIndex + 2;    
            String angka2String = inputText.substring(angka2start).trim();  // mengambil angka kedua
            
            // mengecek jika angka kedua diakhiri dengan simbol persen
            if (angka2String.endsWith("%")){
                angka2 = Double.parseDouble(angka2String.substring(0, angka2String.length() - 1).trim()) / 100.0;   // menghitung nilai persentase
            } else {
                angka2 = Double.parseDouble(angka2String);  // mengambil angka kedua
            }
            
            switch (operator) {
                case "+":
                    total = angka1 + angka2;    // operasi penjumlahan
                    break;
                case "-":
                    total = angka1 - angka2;    // operasi pengurangan
                    break;
                case "*":
                    total = angka1 * angka2;    // operasi perkalian
                    break;
                case "/":
                    // mengecek untuk menghindari pembagian dengan nol
                    if (angka2 == 0) {
                    display.setText("Error: Pembagian dengan nol"); 
                    return;
                    }
                    total = angka1 / angka2;    // operasi pembagian
                    break;
                case "%":
                    total = (angka1 * angka2) / 100.0;  // operaasi persentase
                    break;
                default:
                    display.setText("Operator tidak valid");    // menampilkan pesan jika operator tidak valid
                    return;
            }
        } else {
            // jika input hanya berupa angka saja
            total = Double.parseDouble(inputText);
        }
        // menampilkan hasil akhir pada tampilan
        display.setText(String.valueOf(total));
    }//GEN-LAST:event_tombolsamadenganActionPerformed

    private void tombolpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolpersenActionPerformed
        angka = display.getText()+ " % ";
        display.setText(angka);
    }//GEN-LAST:event_tombolpersenActionPerformed

    private void tombolBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBersihkanActionPerformed
        display.setText("");
    }//GEN-LAST:event_tombolBersihkanActionPerformed

    private void tombolhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolhapusActionPerformed
        // Mengambil teks saat ini dari display
        String currentText = display.getText();

        // Jika teks tidak kosong, hapus karakter terakhir
        if (currentText.length() > 0) {
            currentText = currentText.substring(0, currentText.length() - 1);
        }

        // Memperbarui tampilan dengan teks yang telah diperbarui
        display.setText(currentText);
    }//GEN-LAST:event_tombolhapusActionPerformed

    private void tombolkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tombolkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField display;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tombolAngka0;
    private javax.swing.JButton tombolAngka1;
    private javax.swing.JButton tombolAngka2;
    private javax.swing.JButton tombolAngka3;
    private javax.swing.JButton tombolAngka4;
    private javax.swing.JButton tombolAngka5;
    private javax.swing.JButton tombolAngka6;
    private javax.swing.JButton tombolAngka7;
    private javax.swing.JButton tombolAngka8;
    private javax.swing.JButton tombolAngka9;
    private javax.swing.JButton tombolBersihkan;
    private javax.swing.JButton tombolKali;
    private javax.swing.JButton tombolbagi;
    private javax.swing.JButton tombolhapus;
    private javax.swing.JButton tombolkeluar;
    private javax.swing.JButton tombolkoma;
    private javax.swing.JButton tombolkurang;
    private javax.swing.JButton tombolpersen;
    private javax.swing.JButton tombolsamadengan;
    private javax.swing.JButton tomboltambah;
    // End of variables declaration//GEN-END:variables
}
