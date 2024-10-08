/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WorkAreas.FacultyRole;

import UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ucode.Business;
import ucode.UserAccounts.UserAccount;
import ucode.UserAccounts.UserAccountDirectory;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ucode.CourseCatalog.Course;
import ucode.CourseCatalog.CourseCatalog;
import ucode.profiles.FacultyDirectory;
import ucode.profiles.FacultyProfile;

/**
 *
 * @author 
 */
public class ManageCoursesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    Course selectedCourse;
    FacultyProfile fp;

    public ManageCoursesJPanel(Business bz, FacultyProfile facultyProfile, JPanel jp) {
        CardSequencePanel = jp;
        fp = facultyProfile;
        this.business = bz;
        initComponents();
        refreshTable();

    }

    public void refreshTable() {

//clear supplier table
        int rc = UserAccountTable.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) UserAccountTable.getModel()).removeRow(i);
        }

        CourseCatalog cc = business.getCourseCatalog();

        for (Course course : cc.getCourseList()) {  //getUserAccountList()) {
            if (fp.equals(course.getFacultyProfile())) {
                Object[] row = new Object[5];
                row[0] = course;//.getName();
                row[1] = course.getCourseNumber();
                row[2] = course.getCredits();
                row[3] = course.getCoursePrice();
                String[] sems = business.getSems();
                ArrayList<String> al = new ArrayList<String>();
                for (String sem : sems) {
                    if (business.getCourseSchedule(sem).getCourseOfferByNumber(course.getCourseNumber()) != null) {
                        al.add(sem);
                    }
                }
                row[4] = al;
                if (al.isEmpty()) {
                    row[4] = "Not yet offered";
                }
                ((DefaultTableModel) UserAccountTable.getModel()).addRow(row);
            }

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

        Back = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserAccountTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnOffer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dropSem = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(null);

        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back);
        Back.setBounds(30, 300, 80, 23);

        btnUpdate.setText("update course");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(180, 330, 120, 23);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Courses");
        add(jLabel1);
        jLabel1.setBounds(30, 80, 170, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Manage Courses");
        add(jLabel2);
        jLabel2.setBounds(21, 20, 550, 28);

        UserAccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Name", "number", "credits", "pricing", "offered in sems"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        UserAccountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserAccountTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(UserAccountTable);
        if (UserAccountTable.getColumnModel().getColumnCount() > 0) {
            UserAccountTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 730, 130);

        btnAdd.setText("Add Course");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(180, 290, 120, 23);

        btnOffer.setText("offer course");
        btnOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfferActionPerformed(evt);
            }
        });
        add(btnOffer);
        btnOffer.setBounds(640, 290, 100, 23);

        jLabel3.setText("Semester");
        add(jLabel3);
        jLabel3.setBounds(390, 290, 60, 17);

        dropSem.setModel(new javax.swing.DefaultComboBoxModel<>(business.getSems()));
        dropSem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dropSemItemStateChanged(evt);
            }
        });
        add(dropSem);
        dropSem.setBounds(470, 290, 140, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        //       ((java.awt.CardLayout)CardSequencePanel.getLayout()).show(CardSequencePanel, "IdentifyEventTypes");

    }//GEN-LAST:event_BackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (selectedCourse == null) {
            JOptionPane.showMessageDialog(this, "Please select a course to proceed!");
            return;
        }
        //AdminUserAccount mppd = new AdminUserAccount(selectedCourse, CardSequencePanel);
        EditCourseJPanel ecjp = new EditCourseJPanel(business, selectedCourse, CardSequencePanel, this);
        CardSequencePanel.add(ecjp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void UserAccountTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserAccountTableMousePressed
        // Extracts the row (uaser account) in the table that is selected by the user
        int size = UserAccountTable.getRowCount();
        int selectedrow = UserAccountTable.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > size - 1) {
            return;
        }
        selectedCourse = (Course) UserAccountTable.getValueAt(selectedrow, 0);
        if (selectedCourse == null) {
            return;


    }//GEN-LAST:event_UserAccountTableMousePressed
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        //AdminUserAccount mppd = new AdminUserAccount(selectedCourse, CardSequencePanel);
        AddCourseJPanel acjp = new AddCourseJPanel(business, fp, CardSequencePanel, this);
        CardSequencePanel.add(acjp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfferActionPerformed
        // TODO add your handling code here:
        if (selectedCourse == null) {
            JOptionPane.showMessageDialog(this, "Please select a course to proceed!");
            return;
        }
        if (business.getCourseSchedule(dropSem.getSelectedItem().toString()).newCourseOffer(selectedCourse.getCourseNumber()) == null) {
            JOptionPane.showMessageDialog(this, "Course is already offered for this semeser!");
            return;
        }
        refreshTable();
        JOptionPane.showMessageDialog(this, "Course is successfully added to " + dropSem.getSelectedItem().toString());

    }//GEN-LAST:event_btnOfferActionPerformed

    private void dropSemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dropSemItemStateChanged
        // TODO add your handling code here:
        // dropCourseOffer.setModel(new javax.swing.DefaultComboBoxModel<>(business.getCourseSchedule(dropSem.getSelectedItem().toString()).getCoursesListForProf(fp.getPerson().getId())));
    }//GEN-LAST:event_dropSemItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable UserAccountTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOffer;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> dropSem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
