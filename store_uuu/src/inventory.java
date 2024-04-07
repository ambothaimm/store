
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author admin
 */
public class inventory extends javax.swing.JFrame {
      
 
    public inventory() {
        initComponents();
    }
   
    
    private void Connect (){
   
            

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventory_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type_box = new javax.swing.JComboBox<>();
        Productname_txt = new javax.swing.JTextField();
        date_j = new com.toedter.calendar.JDateChooser();
        price_txt = new javax.swing.JTextField();
        productID_txt = new javax.swing.JTextField();
        stock_txt = new javax.swing.JTextField();
        add_b = new javax.swing.JButton();
        edit_b = new javax.swing.JButton();
        delete_b = new javax.swing.JButton();
        clear_b = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 1000));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setText("Inventory");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(460, 20, 84, 25);

        inventory_table.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        inventory_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Type", "Stock", "Price", "Date"
            }
        ));
        jScrollPane1.setViewportView(inventory_table);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 550, 520);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel3.setText("Date:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(580, 240, 40, 17);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel4.setText("Product ID:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(580, 90, 70, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel5.setText("Product Name:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(580, 120, 90, 20);

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel6.setText("Type:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(580, 150, 40, 20);

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel7.setText("Stock:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(580, 180, 40, 17);

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel8.setText("Price:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(580, 210, 40, 17);

        type_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(type_box);
        type_box.setBounds(630, 150, 90, 22);
        jPanel2.add(Productname_txt);
        Productname_txt.setBounds(680, 120, 240, 22);
        jPanel2.add(date_j);
        date_j.setBounds(630, 240, 290, 22);
        jPanel2.add(price_txt);
        price_txt.setBounds(630, 210, 290, 22);
        jPanel2.add(productID_txt);
        productID_txt.setBounds(660, 90, 260, 22);
        jPanel2.add(stock_txt);
        stock_txt.setBounds(630, 180, 290, 22);

        add_b.setText("Add");
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });
        jPanel2.add(add_b);
        add_b.setBounds(670, 280, 72, 23);

        edit_b.setText("Edit");
        jPanel2.add(edit_b);
        edit_b.setBounds(800, 280, 72, 23);

        delete_b.setText("Delete");
        jPanel2.add(delete_b);
        delete_b.setBounds(670, 320, 72, 23);

        clear_b.setText("Clear");
        jPanel2.add(clear_b);
        clear_b.setBounds(800, 320, 72, 23);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("Welcome!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
      

    }//GEN-LAST:event_add_bActionPerformed

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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inventory().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Productname_txt;
    private javax.swing.JButton add_b;
    private javax.swing.JButton clear_b;
    private com.toedter.calendar.JDateChooser date_j;
    private javax.swing.JButton delete_b;
    private javax.swing.JButton edit_b;
    private javax.swing.JTable inventory_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price_txt;
    private javax.swing.JTextField productID_txt;
    private javax.swing.JTextField stock_txt;
    private javax.swing.JComboBox<String> type_box;
    // End of variables declaration//GEN-END:variables
}
