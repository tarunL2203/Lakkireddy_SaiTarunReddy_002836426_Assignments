/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.profiles;

import java.util.ArrayList;
import ucode.CourseSchedule.CourseLoad;
import ucode.CourseSchedule.SeatAssignment;
import ucode.Person.Person;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    Person person;
    Transcript transcript;
    boolean isapplied;
    boolean Graduated;

    public boolean isApplied() {
        return isapplied;
    }

    public boolean isGraduated() {
        return Graduated;
    }

    public void setGraduated(boolean isGraduated) {
        this.Graduated = isGraduated;
    }

    public StudentProfile(Person p) {

        super(p);
        person = p;
        isapplied = false;
        Graduated = false;
        transcript = new Transcript(this);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return person.getName();
    }

    public boolean isMatch(String id) {
        return person.getId().equals(id);
    }

    public void applyTograduate() {
        isapplied = true;
    }

    public void graduateRequestRejected() {
        isapplied = false;
    }

    public Transcript getTranscript() {
        return transcript;
    }

//    public CourseLoad getCourseLoadBySemester(String semester) {
//
//        return transcript.getCourseLoadBySemester(semester);
//    }
//    public CourseLoad getCurrentCourseLoad() {
//
//        return transcript.getCurrentCourseLoad();
//    }
//    public CourseLoad newCourseLoad(String s) {
//
//        return transcript.newCourseLoad(s);
//    }
//    public ArrayList<SeatAssignment> getCourseList() {
//
//        return transcript.getCourseList();
//
//    }
}
