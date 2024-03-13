/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ucode.Business;
import ucode.Person.Person;
import ucode.UserAccounts.UserAccount;
import ucode.UserAccounts.UserAccountDirectory;
import ucode.profiles.Profile;

/**
 *
 * @author 
 */
public class SignupJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    Person person;

    /**
     * Creates new form SignupJPanel
     */
    public SignupJPanel(Business b, JPanel clp) {
        business = b;
        this.CardSequencePanel = clp;
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

        lblHeading = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        dropUserType = new javax.swing.JComboBox<>();
        lblUserType = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);

        lblHeading.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("User Registrtion");
        add(lblHeading);
        lblHeading.setBounds(0, 18, 501, 29);

        lblName.setText("Name");
        add(lblName);
        lblName.setBounds(90, 80, 52, 17);

        lblAge.setText("Age");
        add(lblAge);
        lblAge.setBounds(90, 120, 52, 17);

        lblEmail.setText("Email");
        add(lblEmail);
        lblEmail.setBounds(90, 160, 53, 17);

        lblUserName.setText("Username");
        add(lblUserName);
        lblUserName.setBounds(85, 197, 59, 17);

        lblPassword.setText("Password");
        add(lblPassword);
        lblPassword.setBounds(85, 225, 70, 17);
        add(txtName);
        txtName.setBounds(190, 80, 100, 23);
        add(txtAge);
        txtAge.setBounds(190, 110, 100, 23);
        add(txtEmail);
        txtEmail.setBounds(190, 150, 100, 23);
        add(txtUsername);
        txtUsername.setBounds(190, 190, 100, 23);
        add(txtPassword);
        txtPassword.setBounds(190, 220, 100, 23);

        btnSignup.setText("Sign up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        add(btnSignup);
        btnSignup.setBounds(146, 316, 74, 23);

        dropUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Professor"}));
        dropUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropUserTypeActionPerformed(evt);
            }
        });
        add(dropUserType);
        dropUserType.setBounds(192, 260, 100, 23);

        lblUserType.setText("User Type");
        add(lblUserType);
        lblUserType.setBounds(90, 260, 80, 17);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        //person = new Person(txt, TOOL_TIP_TEXT_KEY, ABORT, TOOL_TIP_TEXT_KEY)
        if (txtAge.getText().isBlank() || txtEmail.getText().isBlank() || txtName.getText().isBlank() || txtPassword.getText().isBlank() || txtUsername.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter all details");

            return;
        }
        if (!patternMatches(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email id");
            return;
        }
        UserAccountDirectory uad = business.getUserAccountDirectory();
        if (uad.isUserNameAvailable(txtUsername.getText())) {
            Profile profile;
            person = business.getPersonDirectory().newPerson(txtName.getText(), Integer.parseInt(txtAge.getText()), txtEmail.getText());
            if ("Student".equals((dropUserType.getSelectedItem()).toString())) {
                profile = business.getStudentDirectory().newStudentProfile(person);
            } else {
                profile = business.getFacultyDirectory().newFacultyProfile(person);
            }

            uad.newUserAccount(profile, txtUsername.getText(), txtPassword.getText());
            JOptionPane.showMessageDialog(this, "user created");
        } else {
            JOptionPane.showMessageDialog(this, "Username is not available");
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    public static boolean patternMatches(String emailAddress) {
        return Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
                .matcher(emailAddress)
                .matches();
    }

    private void dropUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropUserTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> dropUserType;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
