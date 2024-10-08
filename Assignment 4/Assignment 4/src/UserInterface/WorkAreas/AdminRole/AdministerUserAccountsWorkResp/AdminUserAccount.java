/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp;

import javax.swing.JOptionPane;
import ucode.UserAccounts.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author kal bugrara
 */
public class AdminUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;

    UserAccount selecteduseraccount;

    public AdminUserAccount(UserAccount sua, JPanel jp) {

        CardSequencePanel = jp;
        selecteduseraccount = sua;

        initComponents();
        prefill();
        //display user details here

    }

    public void prefill() {
        txtName.setText(selecteduseraccount.getAssociatedPersonProfile().getPerson().getName());
        txtRole.setText(selecteduseraccount.getRole());
        dropEnabled.setSelectedIndex(selecteduseraccount.getIsEnabled() == true ? 0 : 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblEnable = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        dropEnabled = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(null);

        btnUpdate.setText("Update>>");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(480, 290, 100, 23);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Administer User Account");
        add(jLabel2);
        jLabel2.setBounds(21, 20, 550, 28);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 290, 100, 23);

        lblEnable.setText("Enabled");
        add(lblEnable);
        lblEnable.setBounds(180, 160, 70, 20);

        lblRole.setText("Role");
        add(lblRole);
        lblRole.setBounds(180, 130, 37, 16);

        lblName.setText("Name");
        add(lblName);
        lblName.setBounds(180, 100, 32, 16);

        txtRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoleActionPerformed(evt);
            }
        });
        add(txtRole);
        txtRole.setBounds(280, 130, 64, 22);
        add(txtName);
        txtName.setBounds(280, 90, 64, 22);

        dropEnabled.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));
        add(dropEnabled);
        dropEnabled.setBounds(280, 170, 72, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        boolean isEnable = dropEnabled.getSelectedItem().toString().equalsIgnoreCase("true") ? true : false;
        selecteduseraccount.setIsEnabled(isEnable);
        JOptionPane.showMessageDialog(this, "User account is" + (isEnable ? " Enabled" : " Disabled"));


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);


    }//GEN-LAST:event_btnBackActionPerformed

    private void txtRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> dropEnabled;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEnable;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables

}
