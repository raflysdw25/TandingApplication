/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import connection.DatabaseTanding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ramadhina
 */
public class OwnerBeranda extends javax.swing.JFrame {

    /**
     * Creates new form OwnerBeranda
     */
    private String id_owner, fieldName, contact_number, address;
    private String status, id_team, tgl_sewa, waktu;
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public OwnerBeranda() {
        initComponents();
    }
    public OwnerBeranda(String id){
        initComponents();
        conn = DatabaseTanding.getConnection();
        id_owner = id;
        readDataTable();
        btn_updateStatus.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_fieldName = new javax.swing.JLabel();
        label_contactNumber = new javax.swing.JLabel();
        label_Address = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        imagelabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_updateStatus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        btn_logout = new javax.swing.JLabel();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(43, 54, 146));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 2, true));

        jLabel1.setFont(jLabel1.getFont().deriveFont((jLabel1.getFont().getStyle() & ~java.awt.Font.ITALIC) | java.awt.Font.BOLD, jLabel1.getFont().getSize()+7));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/owner logo.png"))); // NOI18N
        jLabel1.setText("PROFIL PEMILIK");

        label_fieldName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_fieldName.setForeground(new java.awt.Color(255, 255, 255));
        label_fieldName.setText("Nama Lapangan");

        label_contactNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_contactNumber.setForeground(new java.awt.Color(255, 255, 255));
        label_contactNumber.setText("Nomor Kontak");

        label_Address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_Address.setForeground(new java.awt.Color(255, 255, 255));
        label_Address.setText("Alamat");

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        imagelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jDesktopPane1.setLayer(imagelabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_contactNumber)
                            .addComponent(label_Address)
                            .addComponent(label_fieldName)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane1)
                .addGap(26, 26, 26)
                .addComponent(label_fieldName)
                .addGap(18, 18, 18)
                .addComponent(label_contactNumber)
                .addGap(18, 18, 18)
                .addComponent(label_Address)
                .addGap(46, 46, 46))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));

        btn_updateStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_updateStatus.setText("UPDATE STATUS PEMBAYARAN");
        btn_updateStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        btn_updateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateStatusActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/battle.jpg"))); // NOI18N

        jLabel5.setFont(jLabel5.getFont().deriveFont((jLabel5.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, 18));
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("RINCIAN PEMESANAN");

        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        order_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(order_table);

        btn_logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_logout.setText("LOG OUT");
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_logout))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(279, 285, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_updateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(btn_logout)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        readDataTable();
        try{
         String sql = "select * from fieldowner where id_field = '"+id_owner+"' ";
         pst = conn.prepareStatement(sql);
         
         rs = pst.executeQuery();
         if(rs.next()){
             fieldName = rs.getString("fieldname");
             contact_number = rs.getString("contact");
             address = rs.getString("address");
             label_fieldName.setText(fieldName);
             label_contactNumber.setText(contact_number);
             label_Address.setText(address);
             
             byte[] imagedata = rs.getBytes("photo");
                if(imagedata == null){
                    imagelabel.setText("Photo Not Available");
                }else{
                    viewimage = new ImageIcon(imagedata);
                    imagelabel.setIcon(viewimage);
                }
         }
         else{
             JOptionPane.showMessageDialog(null, "Field Name didn't show");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error : "+ex.getMessage());
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void order_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_tableMouseClicked
        // TODO add your handling code here:
         int row = order_table.getSelectedRow();
        String idteamClickTable = (order_table.getModel().getValueAt(row,0).toString());
        String jenisLapClickTable = (order_table.getModel().getValueAt(row,2).toString());
        String waktuClickTable = (order_table.getModel().getValueAt(row,3).toString());
        String durasiClickTable = (order_table.getModel().getValueAt(row,4).toString());
        String tanggalClickTable = (order_table.getModel().getValueAt(row,5).toString());
        String statusClickTable = (order_table.getModel().getValueAt(row,6).toString());
        
        try{
            String sql = "select * from transaksi_lapangan where id_team = '"+idteamClickTable+"'"
                    + "AND jenis_lapangan = '"+jenisLapClickTable+"' AND waktu = '"+waktuClickTable+"'"
                    + "AND durasi = '"+durasiClickTable+"' AND tanggal_sewa = '"+tanggalClickTable+"'"
                    + "AND status = '"+statusClickTable+"' ";
            pst = conn.prepareStatement(sql);            
            rs = pst.executeQuery();
                       
            //Set Inputan dengan yang diklik ditable
            if(rs.next()){
                id_team = rs.getString("id_team");
                tgl_sewa = rs.getString("tanggal_sewa");
                waktu = rs.getString("waktu");
                status = rs.getString("status");                
                btn_updateStatus.setVisible(true);
            }
                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_order_tableMouseClicked

    private void btn_updateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateStatusActionPerformed
        // TODO add your handling code here:
        if(status.equals("Lunas")){
            JOptionPane.showMessageDialog(null, "Pembayaran lapangan telah lunas");
        }else{
            try {
                String sql = "UPDATE transaksi_lapangan SET status = ? WHERE id_owner = '"+id_owner+"' "
                        + "AND id_team = '"+id_team+"' AND tanggal_sewa = '"+tgl_sewa+"' AND waktu = '"+waktu+"'";
                pst = conn.prepareStatement(sql);
                pst.setString(1, "Lunas");
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Update Telah Dilakukan");
                readDataTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Button Error : "+e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_updateStatusActionPerformed

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        new BerandaLoginNew().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void readDataTable(){
        String sql = "SELECT tl.id_team as \"ID Team\", t.teamname as \"Nama Team\","
                + "tl.jenis_lapangan as \"Jenis Lapangan\", tl.waktu as \"Waktu\", "
                + "tl.durasi as \"Durasi\", tl.tanggal_sewa as \"Tanggal Sewa\", "
                + "tl.status as \"Status\" "
                + "FROM transaksi_lapangan tl JOIN team t ON (tl.id_team = t.id_team) "
                + "JOIN fieldowner f ON (tl.id_owner = f.id_field) where tl.id_owner ='"+id_owner+"'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            order_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(OwnerBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerBeranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerBeranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_logout;
    private javax.swing.JButton btn_updateStatus;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Address;
    private javax.swing.JLabel label_contactNumber;
    private javax.swing.JLabel label_fieldName;
    private javax.swing.JTable order_table;
    // End of variables declaration//GEN-END:variables
    private ImageIcon viewimage = null;

}   
