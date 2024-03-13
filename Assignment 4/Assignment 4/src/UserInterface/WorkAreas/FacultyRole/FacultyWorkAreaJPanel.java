/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.WorkAreas.FacultyRole;

import ucode.Business;
import UserInterface.WorkAreas.AdminRole.ManagePersonnelWorkResp.ManagePersonsJPanel;
import javax.swing.JPanel;
import ucode.profiles.FacultyProfile;

/**
 *
 * @author kal
 */
public class FacultyWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    FacultyProfile facultyProfile;

    /**
     * Creates new form UnitRiskWorkArea
     */
    public FacultyWorkAreaJPanel(Business b, FacultyProfile fp, JPanel clp) {
        facultyProfile = fp;
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

        btnMngCourses = new javax.swing.JButton();
        btnMngStudentProfile = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(51, 51, 51));

        btnMngCourses.setBackground(new java.awt.Color(102, 153, 255));
        btnMngCourses.setFont(getFont());
        btnMngCourses.setForeground(new java.awt.Color(255, 255, 255));
        btnMngCourses.setText(" Manage Courses");
        btnMngCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMngCourses.setMaximumSize(new java.awt.Dimension(200, 40));
        btnMngCourses.setMinimumSize(new java.awt.Dimension(20, 23));
        btnMngCourses.setPreferredSize(new java.awt.Dimension(240, 30));
        btnMngCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngCoursesIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnMngStudentProfile.setBackground(new java.awt.Color(102, 153, 255));
        btnMngStudentProfile.setFont(getFont());
        btnMngStudentProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnMngStudentProfile.setText("Manage Students Profiles");
        btnMngStudentProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMngStudentProfile.setMaximumSize(new java.awt.Dimension(200, 40));
        btnMngStudentProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnMngStudentProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnMngStudentProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngStudentProfileActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(102, 153, 255));
        btnProfile.setFont(getFont());
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("My Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfile.setMaximumSize(new java.awt.Dimension(145, 40));
        btnProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileIdentifyEventsActionPerformed(evt);
            }
        });

        btnReports.setBackground(new java.awt.Color(102, 153, 255));
        btnReports.setFont(getFont());
        btnReports.setForeground(new java.awt.Color(255, 255, 255));
        btnReports.setText("Performance Reports");
        btnReports.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReports.setMaximumSize(new java.awt.Dimension(200, 40));
        btnReports.setMinimumSize(new java.awt.Dimension(20, 20));
        btnReports.setPreferredSize(new java.awt.Dimension(240, 25));
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("My Faculty Profie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMngCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(btnMngStudentProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMngCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMngStudentProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngCoursesIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngCoursesIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        //CardSequencePanel.removeAll();

        ManageCoursesJPanel aos = new ManageCoursesJPanel(business, facultyProfile, CardSequencePanel);

        CardSequencePanel.add("ManageCourses", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnMngCoursesIdentifyResourceAssetsActionPerformed

    private void btnMngStudentProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngStudentProfileActionPerformed
        // TODO add your handling code here:

//        FacultyProfileJPanel fp = new FacultyProfileJPanel(business, facultyProfile, CardSequencePanel);
//        CardSequencePanel.add("profile", fp);
//        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        ViewEnrolledStudentJPanel ves = new ViewEnrolledStudentJPanel(business, facultyProfile, CardSequencePanel);
        CardSequencePanel.add("profile", ves);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnMngStudentProfileActionPerformed

    private void btnProfileIdentifyEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileIdentifyEventsActionPerformed
        // TODO add your handling code here:
        FacultyProfileJPanel fp = new FacultyProfileJPanel(business, facultyProfile, CardSequencePanel);
        CardSequencePanel.add("profile", fp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnProfileIdentifyEventsActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:

        ReportsJPanel rjp = new ReportsJPanel(business, facultyProfile, CardSequencePanel);
        CardSequencePanel.add("report", rjp);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMngCourses;
    private javax.swing.JButton btnMngStudentProfile;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnReports;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
