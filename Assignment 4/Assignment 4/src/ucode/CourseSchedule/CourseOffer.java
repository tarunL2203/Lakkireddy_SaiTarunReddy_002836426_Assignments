/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.CourseSchedule;

import java.lang.reflect.Array;
import ucode.CourseCatalog.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ucode.CourseSchedule.CourseLoad;
import ucode.profiles.FacultyAssignment;
import ucode.profiles.FacultyProfile;
import ucode.profiles.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Double> ratings;
    ArrayList<StudentProfile> studentlist;
//    FacultyAssignment facultyassignment;

    public double getRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        return sum(ratings) / ratings.size();
//return course.getFacultyassignment().getRating();
    }

    public void setRating(double r) {
        ratings.add(r);
        //course.getFacultyassignment().setProfRating(r);
    }

    public CourseOffer(Course c) {
        course = c;
        ratings = new ArrayList<Double>();
        studentlist = new ArrayList();
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList<StudentProfile> getStudents() {
        return studentlist;
    }

    public void registerStudent(StudentProfile sp) {
        sp.getTranscript().addCourse(this);
        studentlist.add(sp);
    }

    public StudentProfile findRegisteredStudent(StudentProfile studentProfile) {
        for (StudentProfile sp : studentlist) {
            System.out.println(sp);
            if (sp.isMatch(studentProfile.getPerson().getId())) {
                return sp;
            }
        }
        return null;
    }

//    public void AssignAsTeacher(FacultyProfile fp) {
//
//        facultyassignment = new FacultyAssignment(fp, this);
//    }
//    public FacultyProfile getFacultyProfile() {
//        return facultyassignment.getFacultyProfile();
//    }
    public String getCourseNumber() {
        return course.getCourseNumber();
    }

//    public void generatSeats(int n) {
//
//        for (int i = 0; i < n; i++) {
//
//            seatlist.add(new Seat(this, i));
//
//        }
//
//    }
//
//    public Seat getEmptySeat() {
//
//        for (Seat s : seatlist) {
//
//            if (!s.isOccupied()) {
//                return s;
//            }
//        }
//        return null;
//    }
//    public SeatAssignment assignEmptySeat(CourseLoad cl) {
//
//        Seat seat = getEmptySeat();
//        if (seat == null) {
//            return null;
//        }
//        SeatAssignment sa = seat.newSeatAssignment(cl); //seat is already linked to course offer
//        cl.registerStudent(sa); //coures offer seat is now linked to student
//        return sa;
//    }
    public int getTotalCourseRevenues() {

        int sum = 0;

        for (StudentProfile s : studentlist) {
            sum = sum + course.getCoursePrice();
        }
        return sum;
    }

    public Course getSubjectCourse() {
        return course;
    }

    public int getCreditHours() {
        return course.getCredits();
    }

    @Override
    public String toString() {

        return getCourse().getName();
    }

    private Double sum(ArrayList<Double> ratings) {
        Double sum = 0.0;
        if (ratings.size() == 0) {
            return 0.0;
        }
        for (Double rating : ratings) {
            sum = sum + rating;
        }
        return sum;
    }
}
