/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ski.rental.system;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author chiahxuan
 */
public class pm_product extends javax.swing.JFrame {

    /**
     * Creates new form pm_product
     */
    public pm_product() {
        initComponents();
    }
    
    //change color for buttons on navigation bar
    public void setColor (JPanel panel ){
        panel.setBackground(new Color(3, 78, 109));
  
    }
    
    public void resetColor (JPanel panel ){
        panel.setBackground(new Color(2, 51, 71));
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_catalogue = new javax.swing.JTable();
        NavigationBar = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_manageCatalogue = new javax.swing.JPanel();
        lbl_catalogueIcon = new javax.swing.JLabel();
        lbl_manageCatalogue = new javax.swing.JLabel();
        btn_manageProduct = new javax.swing.JPanel();
        lbl_productIcon = new javax.swing.JLabel();
        lbl_manageProduct = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JPanel();
        lbl_dashboardIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_manageProfile = new javax.swing.JPanel();
        lbl_userIcon = new javax.swing.JLabel();
        lbl_manageProfile = new javax.swing.JLabel();
        TopBar = new javax.swing.JPanel();
        btmLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PM_Dashboard = new javax.swing.JPanel();
        tab_product = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_supplie = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tlb_products = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        tbl_catalogue.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_catalogue);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavigationBar.setBackground(new java.awt.Color(2, 51, 71));
        NavigationBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(2, 51, 71));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Search something here...");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        NavigationBar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/search .png"))); // NOI18N
        NavigationBar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 50));

        btn_manageCatalogue.setBackground(new java.awt.Color(2, 51, 71));
        btn_manageCatalogue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_manageCatalogueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_manageCatalogueMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_manageCatalogueMousePressed(evt);
            }
        });
        btn_manageCatalogue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_catalogueIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_catalogueIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/catalogue.png"))); // NOI18N
        btn_manageCatalogue.add(lbl_catalogueIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 50));

        lbl_manageCatalogue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_manageCatalogue.setForeground(new java.awt.Color(255, 255, 255));
        lbl_manageCatalogue.setText("Manage Catalogue");
        btn_manageCatalogue.add(lbl_manageCatalogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 50));

        NavigationBar.add(btn_manageCatalogue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 50));

        btn_manageProduct.setBackground(new java.awt.Color(234, 63, 63));
        btn_manageProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_manageProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_manageProductMouseExited(evt);
            }
        });
        btn_manageProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_productIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_productIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/product.png"))); // NOI18N
        btn_manageProduct.add(lbl_productIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 50));

        lbl_manageProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_manageProduct.setForeground(new java.awt.Color(255, 255, 255));
        lbl_manageProduct.setText("Manage Product");
        btn_manageProduct.add(lbl_manageProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 50));

        NavigationBar.add(btn_manageProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 50));

        btn_dashboard.setBackground(new java.awt.Color(2, 51, 71));
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dashboardMousePressed(evt);
            }
        });
        btn_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_dashboardIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dashboardIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/statistics_32px.png"))); // NOI18N
        btn_dashboard.add(lbl_dashboardIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");
        btn_dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        NavigationBar.add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 50));

        btn_manageProfile.setBackground(new java.awt.Color(2, 51, 71));
        btn_manageProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_manageProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_manageProfileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_manageProfileMousePressed(evt);
            }
        });
        btn_manageProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_userIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/user32.png"))); // NOI18N
        btn_manageProfile.add(lbl_userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 50));

        lbl_manageProfile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_manageProfile.setForeground(new java.awt.Color(255, 255, 255));
        lbl_manageProfile.setText("Manage Profile");
        btn_manageProfile.add(lbl_manageProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 140, 50));

        NavigationBar.add(btn_manageProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 50));

        getContentPane().add(NavigationBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 510));

        TopBar.setBackground(new java.awt.Color(2, 51, 71));
        TopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btmLogout.setBackground(new java.awt.Color(2, 51, 71));
        btmLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btmLogout.setForeground(new java.awt.Color(255, 255, 255));
        btmLogout.setText("Logout");
        btmLogout.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), null));
        TopBar.add(btmLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 120, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/ski.png"))); // NOI18N
        jLabel6.setText("SkiInv.");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        TopBar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, 90));

        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 90));

        PM_Dashboard.setBackground(new java.awt.Color(230, 234, 237));
        PM_Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab_product.setForeground(new java.awt.Color(2, 51, 71));
        tab_product.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab_product.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        tbl_supplie.setAutoCreateRowSorter(true);
        tbl_supplie.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tbl_supplie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Category ID", "Category Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_supplie.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_supplie.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(tbl_supplie);

        tab_product.addTab("Category", jScrollPane1);

        tlb_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Category ", "Quantity "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tlb_products);

        tab_product.addTab("Product", jScrollPane2);

        PM_Dashboard.add(tab_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 790, 370));

        jLabel3.setBackground(new java.awt.Color(2, 51, 71));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 51, 71));
        jLabel3.setText("Manage Product");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PM_Dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 340, 50));

        btn_delete.setBackground(new java.awt.Color(2, 51, 71));
        btn_delete.setForeground(new java.awt.Color(2, 51, 71));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/trash_26px.png"))); // NOI18N
        PM_Dashboard.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 40, 40));

        btn_add.setBackground(new java.awt.Color(2, 51, 71));
        btn_add.setForeground(new java.awt.Color(2, 51, 71));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/add.png"))); // NOI18N
        PM_Dashboard.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 40, 40));

        btn_edit.setBackground(new java.awt.Color(2, 51, 71));
        btn_edit.setForeground(new java.awt.Color(2, 51, 71));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ski/rental/icons/Selected Images and icons/edit_32px.png"))); // NOI18N
        PM_Dashboard.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 40, 40));

        getContentPane().add(PM_Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 840, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_manageCatalogueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageCatalogueMouseEntered
        // TODO add your handling code here:
        setColor(btn_manageCatalogue);
    }//GEN-LAST:event_btn_manageCatalogueMouseEntered

    private void btn_manageCatalogueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageCatalogueMouseExited
        // TODO add your handling code here:
        resetColor(btn_manageCatalogue);
    }//GEN-LAST:event_btn_manageCatalogueMouseExited

    private void btn_manageProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageProductMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_manageProductMouseEntered

    private void btn_manageProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageProductMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_manageProductMouseExited

    private void btn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseEntered
        // TODO add your handling code here:
        setColor(btn_dashboard);

    }//GEN-LAST:event_btn_dashboardMouseEntered

    private void btn_manageProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageProfileMouseEntered
        //set hover color
        setColor(btn_manageProfile);
    }//GEN-LAST:event_btn_manageProfileMouseEntered

    private void btn_manageProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageProfileMouseExited
        // TODO add your handling code here:
        resetColor(btn_manageProfile);
    }//GEN-LAST:event_btn_manageProfileMouseExited

    private void btn_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseExited
        // TODO add your handling code here:
        resetColor(btn_dashboard);


    }//GEN-LAST:event_btn_dashboardMouseExited

    private void btn_dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMousePressed
        // TODO add your handling code here:
        //***check for role for navigation *****
        //if(role = admin){go admin dashboard}else {go pm dashboard}
        this.setVisible(false);
        new pm_dashboard().setVisible(true);
    }//GEN-LAST:event_btn_dashboardMousePressed

    private void btn_manageProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageProfileMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        new ManageProfile().setVisible(true);
    }//GEN-LAST:event_btn_manageProfileMousePressed

    private void btn_manageCatalogueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_manageCatalogueMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        new pm_catalogue().setVisible(true);
    }//GEN-LAST:event_btn_manageCatalogueMousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        //***check for role for navigation *****
        //if(role = admin){go admin dashboard}else {go pm dashboard}
        this.setVisible(false);
        new pm_dashboard().setVisible(true);
    }//GEN-LAST:event_jLabel6MousePressed

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
            java.util.logging.Logger.getLogger(pm_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pm_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pm_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pm_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pm_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NavigationBar;
    private javax.swing.JPanel PM_Dashboard;
    private javax.swing.JPanel TopBar;
    private javax.swing.JButton btmLogout;
    private javax.swing.JButton btn_add;
    private javax.swing.JPanel btn_dashboard;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JPanel btn_manageCatalogue;
    private javax.swing.JPanel btn_manageProduct;
    private javax.swing.JPanel btn_manageProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_catalogueIcon;
    private javax.swing.JLabel lbl_dashboardIcon;
    private javax.swing.JLabel lbl_manageCatalogue;
    private javax.swing.JLabel lbl_manageProduct;
    private javax.swing.JLabel lbl_manageProfile;
    private javax.swing.JLabel lbl_productIcon;
    private javax.swing.JLabel lbl_userIcon;
    private javax.swing.JTabbedPane tab_product;
    private javax.swing.JTable tbl_catalogue;
    private javax.swing.JTable tbl_supplie;
    private javax.swing.JTable tlb_products;
    // End of variables declaration//GEN-END:variables
}
