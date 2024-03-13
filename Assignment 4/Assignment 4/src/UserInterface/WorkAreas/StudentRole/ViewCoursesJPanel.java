/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;

import UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp.AdminUserAccount;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ucode.Business;
import ucode.CourseSchedule.CourseOffer;
import ucode.UserAccounts.UserAccount;
import ucode.UserAccounts.UserAccountDirectory;
import ucode.profiles.FacultyProfile;
import ucode.profiles.StudentProfile;

/**
 *
 * @author marri
 */
public class ViewCoursesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCoursesJPanel
     */
    JPanel CardSequencePanel;
    Business business;
    CourseOffer selectedCourseOffer;
    StudentProfile sp;

    public ViewCoursesJPanel(Business bz, StudentProfile student, JPanel jp) {
        business = bz;
        CardSequencePanel = jp;
        sp = student;
        initComponents();
        refreshTable();
    }

    void refreshTable() {
//clear supplier table
        int rc = tbCourses.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tbCourses.getModel()).removeRow(i);
        }

        ArrayList<CourseOffer> coList = business.getCourseSchedule(dropSem.getSelectedItem().toString()).getCourseSchedule();

        for (CourseOffer co : coList) {

            Object[] row = new Object[5];
            row[0] = co; //.getAssociatedPersonProfile().getPerson().getName();
            row[1] = co.getCourseNumber();
            row[2] = co.getCourse().getFacultyProfile(); //ua.getAssociatedPersonProfile().getPerson().getName();
            row[3] = co.getCreditHours(); //ua.getRole();
            row[4] = business.getCourseRatings(co.getCourseNumber());
            ((DefaultTableModel) tbCourses.getModel()).addRow(row);
        }
        selectedCourseOffer = null;
    }

    void refreshTable(String prof) {
//clear supplier table
        int rc = tbCourses.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tbCourses.getModel()).removeRow(i);
        }

        ArrayList<CourseOffer> coList = business.getCourseSchedule(dropSem.getSelectedItem().toString()).getCourseSchedule();

        for (CourseOffer co : coList) {
            if (prof.equals(co.getCourse().getFacultyProfile().getPerson().getName())) {
                Object[] row = new Object[5];
                row[0] = co; //.getAssociatedPersonProfile().getPerson().getName();
                row[1] = co.getCourseNumber();
                row[2] = co.getCourse().getFacultyProfile(); //ua.getAssociatedPersonProfile().getPerson().getName();
                row[3] = co.getCreditHours(); //ua.getRole();
                row[4] = business.getCourseRatings(co.getCourseNumber());
                ((DefaultTableModel) tbCourses.getModel()).addRow(row);
            }

        }
        selectedCourseOffer = null;
    }

    void refreshTable(int credit) {
//clear supplier table
        int rc = tbCourses.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tbCourses.getModel()).removeRow(i);
        }

        ArrayList<CourseOffer> coList = business.getCourseSchedule(dropSem.getSelectedItem().toString()).getCourseSchedule();

        for (CourseOffer co : coList) {
            if (credit == co.getCourse().getCredits()) {
                Object[] row = new Object[5];
                row[0] = co; //.getAssociatedPersonProfile().getPerson().getName();
                row[1] = co.getCourseNumber();
                row[2] = co.getCourse().getFacultyProfile(); //ua.getAssociatedPersonProfile().getPerson().getName();
                row[3] = co.getCreditHours(); //ua.getRole();
                row[4] = business.getCourseRatings(co.getCourseNumber());
                ((DefaultTableModel) tbCourses.getModel()).addRow(row);
            }

        }
        selectedCourseOffer = null;
    }

    void refreshTable(String prof, int credit) {
//clear supplier table
        int rc = tbCourses.getRowCount();
        int i;
        for (i = rc - 1; i >= 0; i--) {
            ((DefaultTableModel) tbCourses.getModel()).removeRow(i);
        }

        ArrayList<CourseOffer> coList = business.getCourseSchedule(dropSem.getSelectedItem().toString()).getCourseSchedule();

        for (CourseOffer co : coList) {
            if ((prof.equals(co.getCourse().getFacultyProfile().getPerson().getName())) && (credit == co.getCourse().getCredits())) {
                Object[] row = new Object[5];
                row[0] = co; //.getAssociatedPersonProfile().getPerson().getName();
                row[1] = co.getCourseNumber();
                row[2] = co.getCourse().getFacultyProfile(); //ua.getAssociatedPersonProfile().getPerson().getName();
                row[3] = co.getCreditHours(); //ua.getRole();
                row[4] = business.getCourseRatings(co.getCourseNumber());
                ((DefaultTableModel) tbCourses.getModel()).addRow(row);
            }
        }
        selectedCourseOffer = null;
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
        tbCourses = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dropSem = new javax.swing.JComboBox<>();
        lblSem = new javax.swing.JLabel();
        dropCredit = new javax.swing.JComboBox<>();
        dropProf = new javax.swing.JComboBox<>();
        lblCredits = new javax.swing.JLabel();
        lblProf = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(null);

        tbCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Number", "professor", "credits", "ratings"
            }
        ));
        tbCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbCoursesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbCourses);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 790, 190);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Courses");
        add(jLabel1);
        jLabel1.setBounds(110, 10, 420, 40);

        dropSem.setModel(new javax.swing.DefaultComboBoxModel<>(business.getSems()));
        dropSem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropSemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dropSemMousePressed(evt);
            }
        });
        add(dropSem);
        dropSem.setBounds(630, 30, 150, 22);

        lblSem.setText("Choose Semester");
        add(lblSem);
        lblSem.setBounds(510, 30, 100, 20);

        dropCredit.setModel(new javax.swing.DefaultComboBoxModel<>(business.getcredType()));
        add(dropCredit);
        dropCredit.setBounds(260, 280, 110, 22);

        dropProf.setModel(new javax.swing.DefaultComboBoxModel<>(business.getFacultyDirectory().getFaculty()));
        add(dropProf);
        dropProf.setBounds(92, 280, 100, 22);

        lblCredits.setText("Credits");
        add(lblCredits);
        lblCredits.setBounds(210, 280, 50, 20);

        lblProf.setText("professor");
        add(lblProf);
        lblProf.setBounds(17, 280, 60, 20);

        btnReset.setText("reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset);
        btnReset.setBounds(500, 280, 75, 23);

        btnRegister.setText("register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister);
        btnRegister.setBounds(680, 280, 75, 23);

        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(400, 280, 75, 23);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 380, 72, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tbCoursesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCoursesMousePressed
        // TODO add your handling code here:
        // Extracts the row (uaser account) in the table that is selected by the user
        int size = tbCourses.getRowCount();
        int selectedrow = tbCourses.getSelectionModel().getLeadSelectionIndex();

        if (selectedrow < 0 || selectedrow > size - 1) {
            return;
        }
        selectedCourseOffer = (CourseOffer) tbCourses.getValueAt(selectedrow, 0);
        if (selectedCourseOffer == null) {
            return;

        }
    }//GEN-LAST:event_tbCoursesMousePressed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if (selectedCourseOffer == null) {
            JOptionPane.showMessageDialog(this, "Select a course to register!");
            return;
        }
        if (selectedCourseOffer.findRegisteredStudent(sp) != null) {
            JOptionPane.showMessageDialog(this, "Already registered for the course!");
            return;
        }
        selectedCourseOffer.registerStudent(sp);
        JOptionPane.showMessageDialog(this, "Successfully registered " + selectedCourseOffer.getCourse().getName() + " for " + dropSem.getSelectedItem().toString() + " sem");
        // to be continued
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void dropSemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropSemMousePressed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_dropSemMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (dropCredit.getSelectedItem() == null || dropProf.getSelectedItem() == null) {
            refreshTable();
            return;
        }
        if (dropCredit.getSelectedItem() != null && dropProf.getSelectedItem() == null) {
            refreshTable(Integer.parseInt(dropCredit.getSelectedItem().toString()));
            return;
        }
        if (dropCredit.getSelectedItem() == null && dropProf.getSelectedItem() != null) {
            refreshTable(dropProf.getSelectedItem().toString());
            return;
        }
        refreshTable(dropProf.getSelectedItem().toString(), Integer.parseInt(dropCredit.getSelectedItem().toString()));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void dropSemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropSemMouseClicked
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_dropSemMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> dropCredit;
    private javax.swing.JComboBox<String> dropProf;
    private javax.swing.JComboBox<String> dropSem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblProf;
    private javax.swing.JLabel lblSem;
    private javax.swing.JTable tbCourses;
    // End of variables declaration//GEN-END:variables
}
