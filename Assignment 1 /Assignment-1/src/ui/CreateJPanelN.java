/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.NameLog;
import model.PersonC;

/**
 *
 * @author saitarunreddylakkireddy
 */
public class CreateJPanelN extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanelN
     */
    NameLog log;
    
    public CreateJPanelN(NameLog log) {
        initComponents();
        this.log = log;  
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDateofBirth = new javax.swing.JLabel();
        lblEthnicity = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDateofBirth = new javax.swing.JTextField();
        txtEthnicity = new javax.swing.JTextField();
        btnSaveN = new javax.swing.JButton();
        lblCreateProfile = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        lblFirstName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblLastName.setText("Last Name:");

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblGender.setText("Gender:");

        lblDateofBirth.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblDateofBirth.setText("Date of Birth:");

        lblEthnicity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblEthnicity.setText("Ethnicity:");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtDateofBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateofBirthActionPerformed(evt);
            }
        });

        txtEthnicity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEthnicityActionPerformed(evt);
            }
        });

        btnSaveN.setText("SAVE");
        btnSaveN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNActionPerformed(evt);
            }
        });

        lblCreateProfile.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCreateProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateProfile.setText("Create Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEthnicity)
                            .addComponent(lblDateofBirth)
                            .addComponent(lblGender)
                            .addComponent(lblLastName)
                            .addComponent(lblFirstName))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEthnicity, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnSaveN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCreateProfile)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateofBirth)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEthnicity)
                    .addComponent(txtEthnicity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnSaveN)
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtDateofBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateofBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateofBirthActionPerformed

    private void txtEthnicityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEthnicityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEthnicityActionPerformed

    private void btnSaveNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNActionPerformed
        // TODO add your handling code here:
        String firstname = txtFirstName.getText();
        String lastname = txtLastName.getText();
        String gender = txtGender.getText();
        String dob = txtDateofBirth.getText();
        String ethnicity = txtEthnicity.getText();
        
        PersonC vs = log.addNewName();
        vs.setFirstname(firstname);
        vs.setLastname(lastname);
        vs.setGender(gender);
        vs.setDob(dob);
        vs.setEthnicity(ethnicity);
        
        JOptionPane.showMessageDialog(this, "New Profile added.");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtGender.setText("");
        txtDateofBirth.setText("");
        txtEthnicity.setText("");
       
         
        
    }//GEN-LAST:event_btnSaveNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveN;
    private javax.swing.JLabel lblCreateProfile;
    private javax.swing.JLabel lblDateofBirth;
    private javax.swing.JLabel lblEthnicity;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JTextField txtDateofBirth;
    private javax.swing.JTextField txtEthnicity;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
