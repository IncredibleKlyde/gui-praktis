package myapp;


import internalpage.dashboardPage;
import internalpage.settingsPage;
import internalpage.userPage;
import java.awt.Color;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
/**
 *
 * @author Administrator
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        
        dashboardPage dbp = new dashboardPage();
        maindesktop.add(dbp).setVisible(true);
    }
    
    Color navcolor = new Color (187,187,187); 
    Color headcolor = new Color (255,255,255);
    Color bodycolor = new Color (251,251,251);
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        account = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashpane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        report = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userpane1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setLayout(null);

        navbar.setBackground(new java.awt.Color(102, 102, 0));
        navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navbarMouseEntered(evt);
            }
        });
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        account.setBackground(new java.awt.Color(204, 204, 0));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ACCOUNT");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        account.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, -1, 28));

        navbar.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, 40));

        dashpane.setBackground(new java.awt.Color(204, 204, 0));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DASHBOARD");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        dashpane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, -1, 28));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, 40));

        report.setBackground(new java.awt.Color(204, 204, 0));
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
        });
        report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("USER PAGE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        report.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 80, 28));

        navbar.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, 40));

        userpane1.setBackground(new java.awt.Color(204, 204, 0));
        userpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpane1MouseExited(evt);
            }
        });
        userpane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("REPORT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        userpane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, -1, 28));

        navbar.add(userpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, 40));

        jPanel2.add(navbar);
        navbar.setBounds(0, 0, 120, 430);

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setForeground(new java.awt.Color(0, 0, 0));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 40, -1));

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(0, 0, 0));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, -1));

        jPanel2.add(header);
        header.setBounds(120, 0, 730, 30);

        maindesktop.setBackground(new java.awt.Color(255, 255, 102));
        maindesktop.setPreferredSize(new java.awt.Dimension(780, 400));
        maindesktop.setLayout(new java.awt.BorderLayout());
        jPanel2.add(maindesktop);
        maindesktop.setBounds(120, 30, 730, 390);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarMouseEntered
        // TODO add your handlg code here:
    }//GEN-LAST:event_navbarMouseEntered

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(bodycolor);
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        account.setBackground(navcolor);
    }//GEN-LAST:event_accountMouseExited

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
        dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
        dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setBackground(bodycolor);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBackground(navcolor);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setBackground(bodycolor);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setBackground(navcolor);
    }//GEN-LAST:event_jLabel2MouseExited

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        report.setBackground(bodycolor);
    }//GEN-LAST:event_reportMouseEntered

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setBackground(navcolor);
    }//GEN-LAST:event_reportMouseExited

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reportMouseClicked

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        settingsPage set = new settingsPage();
        maindesktop.add(set).setVisible(true);
    }//GEN-LAST:event_accountMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        userPage up = new userPage();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dashboardPage db = new dashboardPage();
        maindesktop.add(db);

        db.setVisible(true);
        db.setSize(maindesktop.getSize());
        db.setLocation(0, 0);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
        dashboardPage db = new dashboardPage();
        maindesktop.add(db);

        db.setVisible(true);
        db.setSize(maindesktop.getSize());
        db.setLocation(0, 0);

    }//GEN-LAST:event_dashpaneMouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void userpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userpane1MouseClicked

    private void userpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_userpane1MouseEntered

    private void userpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_userpane1MouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

   
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashpane;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel report;
    private javax.swing.JPanel userpane1;
    // End of variables declaration//GEN-END:variables
}
