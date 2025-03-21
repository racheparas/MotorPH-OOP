/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.motorph;

/**
 * Main Menu for the MotorPH application.
 * <p>
 * Provides navigation to employee search and leave management.
 *
 * @author Group7
 */
class MotorPHMainMenu extends javax.swing.JFrame {

    // Constants for button coloring changes
    private static final java.awt.Color LIGHT_BLUE = new java.awt.Color(203, 203, 239);
    private static final java.awt.Color WHITE = new java.awt.Color(255, 255, 255);
    private static final java.awt.Color RED = new java.awt.Color(191, 47, 47);

    /**
     * Creates new form MotorPHMainMenu
     */
    public MotorPHMainMenu() {
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

        pnlMain = new javax.swing.JPanel();
        lblMotorPhHeader = new javax.swing.JLabel();
        lblMainMenuHeader = new javax.swing.JLabel();
        btnSearchEmployee = new javax.swing.JButton();
        lblIwantTo = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnManageLeave = new javax.swing.JButton();
        btnGoBackToLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Payroll System Main Menu");
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        lblMotorPhHeader.setBackground(new java.awt.Color(255, 255, 255));
        lblMotorPhHeader.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblMotorPhHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMotorPhHeader.setText("MotorPH Payroll System");
        lblMotorPhHeader.setOpaque(true);

        lblMainMenuHeader.setBackground(new java.awt.Color(223, 54, 54));
        lblMainMenuHeader.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        lblMainMenuHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblMainMenuHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainMenuHeader.setText("Main Menu");
        lblMainMenuHeader.setOpaque(true);

        btnSearchEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnSearchEmployee.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnSearchEmployee.setText("Search an employee");
        btnSearchEmployee.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnSearchEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchEmployee.setFocusable(false);
        btnSearchEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchEmployeeMouseExited(evt);
            }
        });
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        lblIwantTo.setBackground(new java.awt.Color(255, 255, 255));
        lblIwantTo.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblIwantTo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIwantTo.setText("I want to...");
        lblIwantTo.setMaximumSize(new java.awt.Dimension(93, 25));
        lblIwantTo.setMinimumSize(new java.awt.Dimension(93, 25));
        lblIwantTo.setOpaque(true);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusable(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnManageLeave.setBackground(new java.awt.Color(255, 255, 255));
        btnManageLeave.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnManageLeave.setText("Manage leave");
        btnManageLeave.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnManageLeave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageLeave.setFocusable(false);
        btnManageLeave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageLeaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageLeaveMouseExited(evt);
            }
        });
        btnManageLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLeaveActionPerformed(evt);
            }
        });

        btnGoBackToLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnGoBackToLogin.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnGoBackToLogin.setText("Go back to login");
        btnGoBackToLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnGoBackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoBackToLogin.setFocusable(false);
        btnGoBackToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGoBackToLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGoBackToLoginMouseExited(evt);
            }
        });
        btnGoBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackToLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMainMenuHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMotorPhHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIwantTo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(btnManageLeave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(btnGoBackToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMotorPhHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMainMenuHeader)
                .addGap(15, 15, 15)
                .addComponent(lblIwantTo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnManageLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoBackToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action event of the search employee button to open the
     * employee search page.
     */
    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        // Open EmployeeSearchPage
        new EmployeeSearchPage().setVisible(true);
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    /**
     * Handles the action event of the manage leave button to open the manage
     * leave page.
     */
    private void btnManageLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLeaveActionPerformed
        // Open ManageLeaveMenu
        new ManageLeaveMenu().setVisible(true);
    }//GEN-LAST:event_btnManageLeaveActionPerformed

    /**
     * Handles mouse hover event on the search employee button by changing its
     * background color.
     */
    private void btnSearchEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchEmployeeMouseEntered
        btnSearchEmployee.setBackground(LIGHT_BLUE);
    }//GEN-LAST:event_btnSearchEmployeeMouseEntered

    /**
     * Handles mouse exit event on the search employee button by resetting its
     * background color.
     */
    private void btnSearchEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchEmployeeMouseExited
        btnSearchEmployee.setBackground(WHITE);
    }//GEN-LAST:event_btnSearchEmployeeMouseExited

    /**
     * Handles mouse hover event on the manage leave button by changing its
     * background color.
     */
    private void btnManageLeaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageLeaveMouseEntered
        btnManageLeave.setBackground(LIGHT_BLUE);
    }//GEN-LAST:event_btnManageLeaveMouseEntered

    /**
     * Handles mouse exit event on the manage leave button by resetting its
     * background color.
     */
    private void btnManageLeaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageLeaveMouseExited
        btnManageLeave.setBackground(WHITE);
    }//GEN-LAST:event_btnManageLeaveMouseExited

    /**
     * Handles mouse exit event on the exit button by resetting its background
     * color.
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(WHITE);
    }//GEN-LAST:event_btnExitMouseExited

    /**
     * Handles mouse hover event on the exit button by changing its background
     * color.
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(RED);
    }//GEN-LAST:event_btnExitMouseEntered

    /**
     * Handles the action event of the exit button to exit the application.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit the application
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * Handles the action event of the "Go back to login" button. Opens the
     * login page and closes the current main menu.
     */
    private void btnGoBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackToLoginActionPerformed
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackToLoginActionPerformed

    /**
     * Handles mouse hover event on the "Go back to login" button by changing
     * its background color.
     */
    private void btnGoBackToLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoBackToLoginMouseEntered
        btnGoBackToLogin.setBackground(LIGHT_BLUE);
    }//GEN-LAST:event_btnGoBackToLoginMouseEntered

    /**
     * Handles mouse exit event on the "Go back to login" button by resetting
     * its background color.
     */
    private void btnGoBackToLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoBackToLoginMouseExited
        btnGoBackToLogin.setBackground(WHITE);
    }//GEN-LAST:event_btnGoBackToLoginMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGoBackToLogin;
    private javax.swing.JButton btnManageLeave;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JLabel lblIwantTo;
    private javax.swing.JLabel lblMainMenuHeader;
    private javax.swing.JLabel lblMotorPhHeader;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
}
