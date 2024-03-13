/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.profiles;

import ucode.CourseCatalog.CourseCatalog;
import ucode.CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import ucode.CourseSchedule.CourseLoad;
import ucode.CourseSchedule.CourseOffer;
import ucode.CourseSchedule.SeatAssignment;

/**
 *
 * @author kal bugrara
 */
public class Transcript {

    StudentProfile student;
    //HashMap<String, CourseLoad> courseloadlist;
    HashMap<CourseOffer, Integer> grades;
    //CourseLoad currentcourseload;

    public Transcript(StudentProfile sp) {
        student = sp;
        grades = new HashMap();
    }

    public Set<CourseOffer> getRegisteredCourses() {
        return grades.keySet();
    }

    public void addCourse(CourseOffer co) {
        grades.put(co, 0);
    }


    public void gradeStudent(CourseOffer co, Integer grade) {
        grades.put(co, grade);
    }

    public float GetCourseStudentScore(CourseOffer co) {
//        int sum = 0;
//        for (CourseOffer co : grades.keySet()) {
//            sum = sum + co.getCreditHours() * grades.get(co);
//        }
        return grades.get(co);
        //return getCreditHours() * grade;
    }

    public float GetTotalStudentScore() {
        int sum = 0;

        int totalCredits = 0;
        for (CourseOffer co : grades.keySet()) {
            sum = sum + co.getCreditHours() * grades.get(co);
            totalCredits = totalCredits + co.getCreditHours();
        }
        return (sum / totalCredits);
        //return getCreditHours() * grade;
    }

    public int getStudentSatisfactionIndex() {
        //for each courseload 
        //get seatassigmnets; 
        //for each seatassignment add 1 if like =true;
        return 0;
    }

    public boolean isEligble() {
        if (grades.size() < 8 || grades.containsValue(0)) {
            return false;
        }

        return true;
    }

//    public CourseLoad newCourseLoad(String sem) {
//
//        currentcourseload = new CourseLoad(sem);
//        courseloadlist.put(sem, currentcourseload);
//        return currentcourseload;
//    }
//    public CourseLoad getCurrentCourseLoad() {
//
//        return currentcourseload;
//
//    }
//    public CourseLoad getCourseLoadBySemester(String semester) {
//
//        return courseloadlist.get(semester);
//
//    }
//
//    public float getStudentTotalScore() {
//
//        float sum = 0;
//
//        for (CourseLoad cl : courseloadlist.values()) {
//            sum = sum + cl.getSemesterScore();
//
//        }
//        return sum;
//    }
    //sat index means student rated their courses with likes;
//    public int getStudentSatifactionIndex() {
//        ArrayList<SeatAssignment> courseregistrations = getCourseList();
//        int sum = 0;
//        for (SeatAssignment sa : courseregistrations) {
//
//            if (sa.getLike()) {
//                sum = sum + 1;
//            }
//        }
//        return sum;
//    }
    //generate a list of all courses taken so far (seetassignments) 
    //from multiple semesters (course loads)
    //from seat assignments we will be able to access the course offers
//    public ArrayList<SeatAssignment> getCourseList() {
//        ArrayList temp2;
//        temp2 = new ArrayList();
//
//        for (CourseLoad cl : courseloadlist.values()) { //extract cl list as objects --ignore label
//            temp2.addAll(cl.getSeatAssignments()); //merge one array list to another
//        }
//
//        return temp2;
//
//    }

}
