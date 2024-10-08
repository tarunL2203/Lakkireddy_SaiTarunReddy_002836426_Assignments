/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Person;
import Model.personDirectory;
import javax.swing.JOptionPane;


/**
 *
 * @author saitarunreddylakkireddy
 */
public class PersonJPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form PersonJPanel
     */
    
    personDirectory log;
    
    public PersonJPanel( personDirectory log) {
        initComponents();
        this.log=log;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWState = new javax.swing.JLabel();
        txtWStreetAddress = new javax.swing.JTextField();
        txtWUnitNumber = new javax.swing.JTextField();
        txtWState = new javax.swing.JTextField();
        lblWA = new javax.swing.JLabel();
        lblHA = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        lblLicenseNumber = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtLN = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtWCity = new javax.swing.JTextField();
        lblWStreetAddress = new javax.swing.JLabel();
        lblWUnitNumber = new javax.swing.JLabel();
        lblWCity = new javax.swing.JLabel();
        txtHCity = new javax.swing.JTextField();
        lblHStreetAddress = new javax.swing.JLabel();
        lblHUnitNumber = new javax.swing.JLabel();
        lblHCity = new javax.swing.JLabel();
        lblHState = new javax.swing.JLabel();
        txtHStreetAddress = new javax.swing.JTextField();
        txtHUnitNumber = new javax.swing.JTextField();
        txtHState = new javax.swing.JTextField();
        btnCreateProfile = new javax.swing.JButton();
        txtWZIP = new javax.swing.JTextField();
        lblWZIP = new javax.swing.JLabel();
        txtHZIP = new javax.swing.JTextField();
        lblHZIP = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));

        lblWState.setText("State");

        lblWA.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblWA.setText("WORK ADDRESS");

        lblHA.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblHA.setText("HOME ADDRESS");

        lblHeading.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Create Profile");

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblSocialSecurityNumber.setText("Social Security Number");

        lblLicenseNumber.setText("LicenseNumber");

        txtSSN.setToolTipText("");

        txtWCity.setToolTipText("");

        lblWStreetAddress.setText("Street Address");

        lblWUnitNumber.setText("Unit Number");

        lblWCity.setText("City");

        txtHCity.setToolTipText("");

        lblHStreetAddress.setText("Street Address");

        lblHUnitNumber.setText("Unit Number");

        lblHCity.setText("City");

        lblHState.setText("State");

        txtHState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHStateActionPerformed(evt);
            }
        });

        btnCreateProfile.setText("CREATE PROFILE");
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });

        txtWZIP.setToolTipText("");

        lblWZIP.setText("ZIP");

        txtHZIP.setToolTipText("");

        lblHZIP.setText("ZIP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHState, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtHStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHCity, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHStreetAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblHZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHState, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHCity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btnCreateProfile))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWCity, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWCity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWState, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWState, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblWA)
                            .addComponent(lblHA))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblSocialSecurityNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblLicenseNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(lblWA)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWStreetAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblWCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWUnitNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblWState)
                        .addGap(8, 8, 8)
                        .addComponent(txtWState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWZIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblHA)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHUnitNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHStreetAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHCity)
                    .addComponent(lblHState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHState, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHZIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCreateProfile)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHStateActionPerformed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        // TODO add your handling code here:
   String firstName = txtFirstName.getText();
   String lastName = txtLastName.getText();
   String socialSecurityNumber = txtSSN.getText();
   String licenseNumber = txtLN.getText();
   
   String wStreetAddress = txtWStreetAddress.getText();
   String wUnitNumber = txtWUnitNumber.getText();
   String wCity = txtWCity.getText();
   String wState = txtWState.getText();
   String wZIP = txtWZIP.getText();
   
   String hStreetAddress = txtHStreetAddress.getText();
   String hUnitNumber = txtHUnitNumber.getText();
   String hCity = txtHCity.getText();
   String hState = txtHState.getText();
   String hZIP = txtHZIP.getText();
   
   Person create  = log.addNewPerson();
   
   create.setFirstName(firstName);
   create.setLastName(lastName);
   create.setSocialSecurityNumber(socialSecurityNumber);
   create.setLicenseNumber(licenseNumber);
   
    create.getWorkAddress().setStreet(wStreetAddress);
   create.getWorkAddress().setUnitNumber(wUnitNumber);
   create.getWorkAddress().setCity(wCity);
   create.getWorkAddress().setState(wState);
   create.getWorkAddress().setZipCode(wZIP);
   
   create.getHomeAddress().setStreet(hStreetAddress);
   create.getHomeAddress().setUnitNumber(hUnitNumber);
   create.getHomeAddress().setCity(hCity);
   create.getHomeAddress().setState(hState);
   create.getHomeAddress().setZipCode(hZIP);
   
   JOptionPane.showMessageDialog(this, "A new profile has been created successfully.");
   
   txtFirstName.setText("");
   txtLastName.setText("");
   txtSSN.setText("");
   txtLN.setText("");
   txtHStreetAddress.setText("");
   txtHUnitNumber.setText("");
   txtHCity.setText("");
   txtHState.setText("");
   txtHZIP.setText("");
   txtWStreetAddress.setText("");
   txtWUnitNumber.setText("");
   txtWCity.setText("");
   txtWState.setText("");
   txtWZIP.setText("");
   
        
        
    }//GEN-LAST:event_btnCreateProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHA;
    private javax.swing.JLabel lblHCity;
    private javax.swing.JLabel lblHState;
    private javax.swing.JLabel lblHStreetAddress;
    private javax.swing.JLabel lblHUnitNumber;
    private javax.swing.JLabel lblHZIP;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JLabel lblWA;
    private javax.swing.JLabel lblWCity;
    private javax.swing.JLabel lblWState;
    private javax.swing.JLabel lblWStreetAddress;
    private javax.swing.JLabel lblWUnitNumber;
    private javax.swing.JLabel lblWZIP;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHCity;
    private javax.swing.JTextField txtHState;
    private javax.swing.JTextField txtHStreetAddress;
    private javax.swing.JTextField txtHUnitNumber;
    private javax.swing.JTextField txtHZIP;
    private javax.swing.JTextField txtLN;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWCity;
    private javax.swing.JTextField txtWState;
    private javax.swing.JTextField txtWStreetAddress;
    private javax.swing.JTextField txtWUnitNumber;
    private javax.swing.JTextField txtWZIP;
    // End of variables declaration//GEN-END:variables
}
