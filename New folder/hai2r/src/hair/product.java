/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hair;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import static javax.swing.event.TableModelEvent.UPDATE;
import javax.swing.table.DefaultTableModel;


public class product extends javax.swing.JFrame {

//    private String strTypeID;








    public product() {
        initComponents();
//        tb_product.setVisible(true);
//        tb_product = new JTable();
////        scrollPane.setViewportView(tb_product);
//    }

//    private static void PopulateData(){
        DefaultTableModel model = (DefaultTableModel)tb_product.getModel();

        Vector vec = new Vector();
        model.addColumn("TypeID");
        model.addColumn("TypeName");
//        model.addColumn("Color");
        Connection connect =null;
        Statement s =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=RumRuay_Beauty;user=sa;password=19082012");
            s = connect.createStatement();
            String sql ="SELECT * FROM ProductType";
            ResultSet result = s.executeQuery(sql);
            int row=0;
            while((result!=null) && (result.next()))
            {
                model.addRow(new Object[0]);
                model.setValueAt(result.getString("TypeID"), row, 0);
                model.setValueAt(result.getString("TypeName"), row, 1);
//                model.setValueAt(result.getString("Color"), row, 2);
                row++;
            }
            result.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        try{
            if(s != null){
            s.close();
            connect.close();
        }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbadd = new javax.swing.JButton();
        tf_id = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbrset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_product = new javax.swing.JTable();
        tbdel = new javax.swing.JButton();
        tbup = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product");

        tbadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbadd.setText("Add");
        tbadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbaddActionPerformed(evt);
            }
        });

        tf_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_id.setToolTipText("");
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        tf_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name :");

        tbrset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbrset.setText("Clear");
        tbrset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrsetActionPerformed(evt);
            }
        });

        tb_product.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tb_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_product.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tb_productAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tb_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_product);

        tbdel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbdel.setText("Delete");
        tbdel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdelMouseClicked(evt);
            }
        });
        tbdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdelActionPerformed(evt);
            }
        });

        tbup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbup.setText("Update");
        tbup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbupMouseClicked(evt);
            }
        });
        tbup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbupActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("RumRuay Beauty");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem1.setText("Login/Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem2.setText("Customer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem3.setText("Insert Product");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem4.setText("Check Order");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem5.setText("บันทึกการขาย");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tbup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbadd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbdel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbrset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbrset)
                    .addComponent(tbadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbup)
                    .addComponent(tbdel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbaddActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_product.getModel();
        Vector vec = new Vector();
        Connection connect =null;
        Statement s =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=RumRuay_Beauty;user=sa;password=19082012");
            s = connect.createStatement();
            

            String sql = "INSERT INTO ProductType(TypeID,TypeName)"+
                         "VALUES ('"+tf_id.getText().toString()+"','"
                        +tf_name.getText().toString()+"')";
//                         +tf_color.getText()+"')";
//             ResultSet result = s.executeQuery(sql);
//        System.out.print(sql);
        s.execute(sql);

            tf_id.getText();
            tf_name.getText();
//            tf_color.setText("");
                JOptionPane.showMessageDialog(this, "Successfully.");


        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
            try{
                 if(s != null){
                  s.close();
                  connect.close();
            }
            }catch (SQLException e){
                      System.out.println(e.getMessage());
                      e.printStackTrace();;
                      }
            getContentPane().add(tbadd);
        vec.add(tf_id.getText());
        vec.add(tf_name.getText());
//        vec.add(tf_color.getText());
        model.addRow(vec);
            
       
    }//GEN-LAST:event_tbaddActionPerformed

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed

    }//GEN-LAST:event_tf_idActionPerformed

    private void tbrsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrsetActionPerformed
tf_id.setText("");
tf_name.setText("");
//tf_color.setText("");
    }//GEN-LAST:event_tbrsetActionPerformed

    private void tb_productAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tb_productAncestorAdded


    }//GEN-LAST:event_tb_productAncestorAdded

    private void tbdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdelActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_product.getModel();
        int index = tb_product.getSelectedRow();
        String id = tb_product.getValueAt(index, 0).toString();
//        Vector vec = new Vector();
        Connection connect =null;
        Statement s =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=RumRuay_Beauty;user=sa;password=19082012");
            s = connect.createStatement();

            String sql = "DELETE FROM ProductType WHERE TypeID = '"+id+"'";
            s.execute (sql);
        

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
            try{
                 if(s != null){
                  s.close();
                  connect.close();
            }
            }catch (SQLException e){
                      System.out.println(e.getMessage());
                      e.printStackTrace();
                      }
                    if(index < 0){
            JOptionPane.showMessageDialog(null, "Please select record for Delete.");
        }else{           
            Object[] options = {"Yes","No"};
            int n = JOptionPane.showOptionDialog(null, 
                    "Do you want to Delete data?",
                    "Confirm to Delete?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,options,
                    options[1]);

            if(n == 0){
                
                     JOptionPane.showMessageDialog(null, "Delete Data Successfully");
                     model.removeRow(index);
        }
                };
    }//GEN-LAST:event_tbdelActionPerformed

    private void tb_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_productMouseClicked
        DefaultTableModel model = (DefaultTableModel)tb_product.getModel();
        tf_id.setText(model.getValueAt(tb_product.getSelectedRow(),0).toString());
        tf_name.setText(model.getValueAt(tb_product.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tb_productMouseClicked

    private void tbdelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdelMouseClicked

    }//GEN-LAST:event_tbdelMouseClicked

    private void tbupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbupMouseClicked

    private void tbupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbupActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_product.getModel();
//        Vector vec = new Vector();
        int index = tb_product.getSelectedRow();
//        int row=tb_product.getSelectedColumn();
        Connection connect =null;
        Statement s =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=RumRuay_Beauty;user=sa;password=19082012");
            s = connect.createStatement();
            

            String sql = "UPDATE ProductType SET TypeName = '"+tf_name.getText()+
                    "'"+"WHERE TypeID = '"+tf_id.getText()+"'";
            
           s.execute(sql);
                    
           JOptionPane.showMessageDialog(null, "Successfully.");
           model.setValueAt(tf_name.getText(),index , 1);
           model.setValueAt(tf_id.getText(), index, 0);
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
            try{
                 if(s != null){
                  s.close();
                  connect.close();
            }
            }catch (SQLException e){
                      System.out.println(e.getMessage());
                      e.printStackTrace();;
                      }
            getContentPane().add(tbup);

    }//GEN-LAST:event_tbupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Choose form = new Choose();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            Customer form = new Customer();
            form.setVisible(true);
            this.dispose();    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            Login form = new Login();
            form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Product_Pay form = new Product_Pay();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            Orders form = new Orders();
            form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            Report form = new Report();
            form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_product;
    private javax.swing.JButton tbadd;
    private javax.swing.JButton tbdel;
    private javax.swing.JButton tbrset;
    private javax.swing.JButton tbup;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables



}
