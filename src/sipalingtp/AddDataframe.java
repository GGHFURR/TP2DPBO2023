/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sipalingtp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author fadhl
 */
public class AddDataframe extends javax.swing.JFrame {

    /**
     * Creates new form AddDataframe
     */
    private dbconnection db;
    private boolean isupdate;
    private int idganti = 0;
    private framehome frameasoy;
    private String img;
    
    

    sipalingtp.ImageSet imgHandler = new ImageSet();
    
    public AddDataframe() {
    initComponents();
    db = new dbconnection();
    warningupdate.setVisible(false);
    }

    public AddDataframe(int id, framehome frame) {
    initComponents();
    db = new dbconnection();
    ResultSet res = db.selectQuery("SELECT * FROM barang where id = '"+id+"' ");
    idganti = id;
    frameasoy = frame;
    warningupdate.setVisible(true);
    
    try {
        if (res.next()) {
            isupdate = true;
            namabarangtextfield.setText(res.getString("nama_barang"));
            hargatextfield.setText(res.getString("Harga_Barang"));
            spinnerjumlah.setValue(res.getInt("Jumlah_Barang"));
            buttonadd.setText("Update");
        } else {
            // jika tidak ada data dengan id yang diberikan, tampilkan pesan error
            JOptionPane.showMessageDialog(this, "Data not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        // jika terjadi kesalahan saat mengambil data dari database, tampilkan pesan error
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void uploadImg(String img){
        try {
            Path copy = Paths.get("src/image/"+img);
            Path originalPath = Paths.get(imgHandler.getFile().getAbsolutePath());
            Files.copy(originalPath, copy, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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
        namabarangtextfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buttonadd = new javax.swing.JButton();
        spinnerjumlah = new javax.swing.JSpinner();
        hargatextfield = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        warningupdate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        namabarangtextfield.setFont(new java.awt.Font("Circular Std Bold", 2, 12)); // NOI18N
        namabarangtextfield.setForeground(new java.awt.Color(204, 204, 204));
        namabarangtextfield.setText("Nama Barang");
        namabarangtextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        namabarangtextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namabarangtextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namabarangtextfieldFocusLost(evt);
            }
        });
        namabarangtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namabarangtextfieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Circular Std Bold", 0, 14)); // NOI18N
        jLabel2.setText("Nama Barang");

        buttonadd.setBackground(new java.awt.Color(255, 102, 51));
        buttonadd.setFont(new java.awt.Font("Circular Std Bold", 0, 24)); // NOI18N
        buttonadd.setForeground(new java.awt.Color(255, 255, 255));
        buttonadd.setText("Add Data");
        buttonadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonaddActionPerformed(evt);
            }
        });

        spinnerjumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        hargatextfield.setFont(new java.awt.Font("Circular Std Bold", 2, 12)); // NOI18N
        hargatextfield.setForeground(new java.awt.Color(204, 204, 204));
        hargatextfield.setText("Harga Barang");
        hargatextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        hargatextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hargatextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hargatextfieldFocusLost(evt);
            }
        });
        hargatextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargatextfieldActionPerformed(evt);
            }
        });

        btnUpload.setFont(new java.awt.Font("Circular Std Bold", 2, 12)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(204, 204, 204));
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Circular Std Bold", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah Barang");

        jLabel6.setFont(new java.awt.Font("Circular Std Bold", 0, 14)); // NOI18N
        jLabel6.setText("Harga Barang");

        jLabel7.setFont(new java.awt.Font("Circular Std Bold", 0, 14)); // NOI18N
        jLabel7.setText("Foto Barang");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Provicali", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(83, 184, 211));
        jLabel3.setText("TOKO BANGUNAN");

        jLabel4.setFont(new java.awt.Font("Provicali", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BANTENG MERAH");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login ikon compress.jpg"))); // NOI18N

        warningupdate.setFont(new java.awt.Font("Circular Std Bold", 2, 12)); // NOI18N
        warningupdate.setForeground(new java.awt.Color(255, 102, 0));
        warningupdate.setText("* Anda Harus Upload Ulang file fotonya disini");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpload)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hargatextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(spinnerjumlah, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namabarangtextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(warningupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(namabarangtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinnerjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargatextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(warningupdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(buttonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        imgHandler.cari();
        btnUpload.setText(imgHandler.getPath());
    }//GEN-LAST:event_btnUploadActionPerformed

    private void buttonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonaddActionPerformed
        // TODO add your handling code here:

        String namabarang = namabarangtextfield.getText();
        int jumlahbarang = (int)spinnerjumlah.getValue();
        String hargabarang = hargatextfield.getText();
        this.img = imgHandler.getFile().getName();

        if(namabarang.isEmpty() || jumlahbarang==0 || hargabarang.isEmpty() || imgHandler.getFile() == null)
        {
            JOptionPane.showMessageDialog(null, "Ada Data Yang Kosong");
        }else
        {
            if(isupdate == true)
            {
               if(imgHandler.getFile() == null) {
                    JOptionPane.showMessageDialog(null, "Photo belum terisi");
                   
                }
               else{
                uploadImg(this.img);
                String sql = "UPDATE barang SET nama_barang='" +namabarang+ "', Jumlah_Barang='" +jumlahbarang+ "', Harga_Barang='"+hargabarang+ "', image = '"+img+"' WHERE id='"+idganti+"'";
                db.UpdateQuery(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
                frameasoy.setPanel();

               }
                
            }
            else{
                
                uploadImg(this.img);
                String sql = "INSERT INTO barang(id,nama_barang,Jumlah_Barang,Harga_Barang,image) VALUES (null, '"+namabarang+"','"+jumlahbarang+"','"+hargabarang+"','"+img+"')";
                db.UpdateQuery(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
                new framehome().setVisible(true);
            }

            dispose();

        }
    }//GEN-LAST:event_buttonaddActionPerformed

    private void hargatextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargatextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargatextfieldActionPerformed

    private void namabarangtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namabarangtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namabarangtextfieldActionPerformed

    private void namabarangtextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namabarangtextfieldFocusGained
        // TODO add your handling code here:
        String Check = namabarangtextfield.getText();
            if(Check.equals("Nama Barang"))
            {
                namabarangtextfield.setText("");
            }
    }//GEN-LAST:event_namabarangtextfieldFocusGained

    private void namabarangtextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namabarangtextfieldFocusLost
        // TODO add your handling code here:
        String Check = namabarangtextfield.getText();
            if(Check.equals("Nama Barang")|| Check.equals(""))
            {
                namabarangtextfield.setText("Nama Barang");
            }
    }//GEN-LAST:event_namabarangtextfieldFocusLost

    private void hargatextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hargatextfieldFocusGained
        // TODO add your handling code here:
        String Check = hargatextfield.getText();
            if(Check.equals("Harga Barang"))
            {
                hargatextfield.setText("");
            }
    }//GEN-LAST:event_hargatextfieldFocusGained

    private void hargatextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hargatextfieldFocusLost
        // TODO add your handling code here:
        String Check = hargatextfield.getText();
            if(Check.equals("Harga Barang")|| Check.equals(""))
            {
                hargatextfield.setText("Harga Barang");
            }
    }//GEN-LAST:event_hargatextfieldFocusLost

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
            java.util.logging.Logger.getLogger(AddDataframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDataframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDataframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDataframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDataframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton buttonadd;
    private javax.swing.JTextField hargatextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namabarangtextfield;
    private javax.swing.JSpinner spinnerjumlah;
    private javax.swing.JLabel warningupdate;
    // End of variables declaration//GEN-END:variables
}
