/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Person;
import Model.personDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saitarunreddylakkireddy
 */
public class SearchJPanel extends javax.swing.JPanel {

    personDirectory log;
    /**
     * Creates new form searchJPanel
     */
    public SearchJPanel(personDirectory log, String Search) {
        initComponents();
        this.log = log;
      
        populateTable(Search);
        
      }
    
     private void populateTable(String Search) {
    
            DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
            
        model.setRowCount(0);
        
        
        for(Person create : log.getLog())
            if(create.getLastName().equals(Search) || create.getFirstName().equals(Search) || create.getHomeAddress().getStreet().equals(Search) || create.getWorkAddress().getStreet().equals(Search))
        {
            
            
            Object[] row = new Object[6];
            row[0] = create;
            row[1] = create.getLastName();
            row[2] = create.getHomeAddress().getCity();
            row[3] = create.getHomeAddress().getZipCode();
            row[4] = create.getWorkAddress().getCity();
            row[5] = create.getWorkAddress().getZipCode();
            
            model.addRow(row);
            
        }
            else{
                System.out.println("No match found");
            }

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        lblLicenseNumber = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtLN = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtWZIP = new javax.swing.JTextField();
        lblWZIP = new javax.swing.JLabel();
        txtWCity = new javax.swing.JTextField();
        lblWStreetAddress = new javax.swing.JLabel();
        lblWUnitNumber = new javax.swing.JLabel();
        lblWCity = new javax.swing.JLabel();
        lblWState = new javax.swing.JLabel();
        txtWStreetAddress = new javax.swing.JTextField();
        txtWUnitNumber = new javax.swing.JTextField();
        txtWState = new javax.swing.JTextField();
        lblWA = new javax.swing.JLabel();
        txtHZIP = new javax.swing.JTextField();
        lblHZIP = new javax.swing.JLabel();
        txtHCity = new javax.swing.JTextField();
        lblHStreetAddress = new javax.swing.JLabel();
        lblHUnitNumber = new javax.swing.JLabel();
        lblHCity = new javax.swing.JLabel();
        lblHState = new javax.swing.JLabel();
        txtHStreetAddress = new javax.swing.JTextField();
        txtHUnitNumber = new javax.swing.JTextField();
        txtHState = new javax.swing.JTextField();
        lblHA = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Home City", "Home ZIP Code", "Work City", "Work ZIP code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersons);

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblSocialSecurityNumber.setText("Social Security Number");

        lblLicenseNumber.setText("LicenseNumber");

        txtFirstName.setEnabled(false);

        txtLastName.setEnabled(false);

        txtLN.setEnabled(false);

        txtSSN.setToolTipText("");
        txtSSN.setEnabled(false);

        txtWZIP.setToolTipText("");
        txtWZIP.setEnabled(false);

        lblWZIP.setText("ZIP");

        txtWCity.setToolTipText("");
        txtWCity.setEnabled(false);

        lblWStreetAddress.setText("Street Address");

        lblWUnitNumber.setText("Unit Number");

        lblWCity.setText("City");

        lblWState.setText("State");

        txtWStreetAddress.setEnabled(false);

        txtWUnitNumber.setEnabled(false);

        txtWState.setEnabled(false);

        lblWA.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblWA.setText("WORK ADDRESS");

        txtHZIP.setToolTipText("");
        txtHZIP.setEnabled(false);

        lblHZIP.setText("ZIP");

        txtHCity.setToolTipText("");
        txtHCity.setEnabled(false);

        lblHStreetAddress.setText("Street Address");

        lblHUnitNumber.setText("Unit Number");

        lblHCity.setText("City");

        lblHState.setText("State");

        txtHStreetAddress.setEnabled(false);

        txtHUnitNumber.setEnabled(false);

        txtHState.setEnabled(false);
        txtHState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHStateActionPerformed(evt);
            }
        });

        lblHA.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblHA.setText("HOME ADDRESS");

        btnView.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWA)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
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
                                .addComponent(lblHA))
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
                                    .addComponent(lblWState, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(btnView))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblLicenseNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18)
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
                    .addComponent(txtHState, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHZIP)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHStateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblPersons.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);
        
        txtFirstName.setText(String.valueOf(person.getFirstName()));
        txtLastName.setText(String.valueOf(person.getLastName()));
        txtSSN.setText(String.valueOf(person.getSocialSecurityNumber()));
        txtLN.setText(String.valueOf(person.getLicenseNumber()));
        
        txtHStreetAddress.setText(String.valueOf(person.getHomeAddress().getStreet()));
        txtHUnitNumber.setText(String.valueOf(person.getHomeAddress().getUnitNumber()));
        txtHCity.setText(String.valueOf(person.getHomeAddress().getCity()));
        txtHState.setText(String.valueOf(person.getHomeAddress().getState()));
        txtHZIP.setText(String.valueOf(person.getHomeAddress().getZipCode()));
        
        txtWStreetAddress.setText(String.valueOf(person.getWorkAddress().getStreet()));
        txtWUnitNumber.setText(String.valueOf(person.getWorkAddress().getUnitNumber()));
        txtWCity.setText(String.valueOf(person.getWorkAddress().getCity()));
        txtWState.setText(String.valueOf(person.getWorkAddress().getState()));
        txtWZIP.setText(String.valueOf(person.getWorkAddress().getZipCode()));
        
        
        
        
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
         
  
        int selectedRowIndex = tblPersons.getSelectedRow();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);
        
       /*
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }
        */
       
        person.setFirstName(txtFirstName.getText());
        person.setLastName(txtLastName.getText());
        person.setSocialSecurityNumber(txtSSN.getText());
        person.setLicenseNumber(txtLN.getText());

        person.getWorkAddress().setStreet(txtWStreetAddress.getText());
        person.getWorkAddress().setUnitNumber(txtWUnitNumber.getText());
        person.getWorkAddress().setCity(txtWCity.getText());
        person.getWorkAddress().setState(txtWState.getText());
        person.getWorkAddress().setZipCode(txtWZIP.getText());
        
        person.getHomeAddress().setStreet(txtHStreetAddress.getText());
        person.getHomeAddress().setUnitNumber(txtHUnitNumber.getText());
        person.getHomeAddress().setCity(txtHCity.getText());
        person.getHomeAddress().setState(txtHState.getText());
        person.getHomeAddress().setZipCode(txtHZIP.getText());
        
       btnSave.setEnabled(false);
       btnUpdate.setEnabled(true);
       
       JOptionPane.showMessageDialog(this,"Changes Saved.");
       
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
        
        
       
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtSSN.setEnabled(true);
        txtLN.setEnabled(true);
        
        txtHStreetAddress.setEnabled(true);
        txtHUnitNumber.setEnabled(true);
        txtHCity.setEnabled(true);
        txtHState.setEnabled(true);
        txtHZIP.setEnabled(true);
        
        txtWStreetAddress.setEnabled(true);
        txtWUnitNumber.setEnabled(true);
        txtWCity.setEnabled(true);
        txtWState.setEnabled(true);
        txtWZIP.setEnabled(true);
          
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHA;
    private javax.swing.JLabel lblHCity;
    private javax.swing.JLabel lblHState;
    private javax.swing.JLabel lblHStreetAddress;
    private javax.swing.JLabel lblHUnitNumber;
    private javax.swing.JLabel lblHZIP;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JLabel lblWA;
    private javax.swing.JLabel lblWCity;
    private javax.swing.JLabel lblWState;
    private javax.swing.JLabel lblWStreetAddress;
    private javax.swing.JLabel lblWUnitNumber;
    private javax.swing.JLabel lblWZIP;
    private javax.swing.JTable tblPersons;
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
