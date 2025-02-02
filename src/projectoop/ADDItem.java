/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectoop;

import DbConnection.ConectionDB;
import getterSetter.AddItemsGetSet;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.regex.*;
import javax.swing.*;
import java.util.regex.Pattern;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ksama
 */
public class ADDItem extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form ADDItem
     */
    public ADDItem() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        productIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productNameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        categoryCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        unitpriceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        brandNameTxt = new javax.swing.JTextField();
        saveAddBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel2.setText("Stationary Management System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADD Items");

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product ID");

        productIdTxt.setPreferredSize(new java.awt.Dimension(300, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product Name");

        productNameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        productNameTxt.setPreferredSize(new java.awt.Dimension(300, 35));
        productNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Category");

        categoryCombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book", "Pencil", "Pen", "Water Bottle", "Eraser", "A4", "Glue", "Pencil Box", "Pencil Case" }));
        categoryCombo.setPreferredSize(new java.awt.Dimension(300, 35));
        categoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Unit Price (Rs.)");

        unitpriceTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unitpriceTxt.setPreferredSize(new java.awt.Dimension(300, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Quantity");

        quantityTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quantityTxt.setPreferredSize(new java.awt.Dimension(300, 35));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Brand Name");

        brandNameTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        brandNameTxt.setPreferredSize(new java.awt.Dimension(300, 35));

        saveAddBtn.setBackground(new java.awt.Color(2, 110, 110));
        saveAddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveAddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        saveAddBtn.setText("SAVE");
        saveAddBtn.setPreferredSize(new java.awt.Dimension(130, 35));
        saveAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAddBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(545, 545, 545)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unitpriceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(220, 220, 220))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(598, 598, 598))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(productIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brandNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(unitpriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(saveAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        SellerDashboard sD = new SellerDashboard();
        sD.show();
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void productNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTxtActionPerformed

    private void categoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryComboActionPerformed

    private void saveAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAddBtnActionPerformed
        // TODO add your handling code here:
        
    
        
        //assigning text fields values
        String productId = productIdTxt.getText();
        String productName = productNameTxt.getText();
        String category = (String) categoryCombo.getSelectedItem();
        String quantity = quantityTxt.getText();
        String brandName = brandNameTxt.getText();
        String unitprice = unitpriceTxt.getText();
        
        
        //create insatance in getter setter pkg addItemGetSet class
        
        AddItemsGetSet addItems = new  AddItemsGetSet();
        
        //set the values from userfield to Setter in AddItemsGetSet class
        addItems.setProductId(productId);
        addItems.setProductName(productName);
        addItems.setCategory(category);
        addItems.setQuantity(quantity);
        addItems.setBrandName(brandName);
        addItems.setUnitPrice(unitprice);
        
        
        
        // Hash mapping 
        HashMap <String,AddItemsGetSet> addItemMap = new HashMap<>();
        
        //key for the hashmap value stor
        String addKey = null;
         // Put the item into the HashMap with a key, key is addKey
        addItemMap.put(addKey, addItems);
        
        // Retrieve the item from the HashMap using its key
        AddItemsGetSet retrievedItem = addItemMap.get(addKey);
        
        //Assigning new virable the retrieved Getter values
        String productId2 = retrievedItem.getProductId();
        String productName2 = retrievedItem.getProductName();
        String category2 = retrievedItem.getCategory();
        String quantity2 = retrievedItem.getQuantity();
        String brandName2 = retrievedItem.getBrandName();
        String unitprice2 = retrievedItem.getUnitPrice();
        
        

        
         try{
            
            // Obtain connection from ConectionDB class
            con = ConectionDB.getCon();
            
            // Prepare the SQL statement
            String query = "INSERT INTO `additems`(`productID`, `ProductName`, `Category`, `Quantity`, `brandName`, `unitPrice`) VALUES (?,?,?,?,?,?)";
            pst = con.prepareStatement(query);

            // Create a PreparedStatement
            PreparedStatement pst = con.prepareStatement(query);
            
            // Set values for placeholders
            pst.setString(1, productId2);
            pst.setString(2, productName2);
            pst.setString(3, category2);
            pst.setString(4, quantity2);
            pst.setString(5, brandName2);
            pst.setString(6, unitprice2);

            // Execute the query
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null , "Inserted products items Successfully.!");
             
             setVisible(false);
             new ADDItem().setVisible(true);
             
            // Close the connection and PreparedStatement
            pst.close();
            con.close();
            
         
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null , e);
        }
    
        
        
        
        
    }//GEN-LAST:event_saveAddBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ADDItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField brandNameTxt;
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField productIdTxt;
    private javax.swing.JTextField productNameTxt;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JButton saveAddBtn;
    private javax.swing.JTextField unitpriceTxt;
    // End of variables declaration//GEN-END:variables
}
