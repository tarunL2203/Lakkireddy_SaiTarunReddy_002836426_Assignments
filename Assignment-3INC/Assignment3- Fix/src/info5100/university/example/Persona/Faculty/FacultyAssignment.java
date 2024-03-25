/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.CourseSchedule.CourseOffer;

/**
 *
 * @author kal bugrara
 */

public class FacultyAssignment {
    private double tracerating;
    private CourseOffer courseoffer;
    private FacultyProfile facultyprofile;
    
    public FacultyAssignment(FacultyProfile facultyProfile, CourseOffer courseOffer) {
        this.facultyprofile = facultyProfile;
        this.courseoffer = courseOffer;
    }

    public double getRating() {
        return tracerating;
    }

    public void setRating(double rating) {
        this.tracerating = rating;
    }

//    public FacultyProfile getFacultyProfile() {
//        return facultyprofile;
//    }

   public FacultyProfile getFacultyProfile() {
        return facultyprofile;
    }
    public void setFacultyProfile(FacultyProfile facultyProfile) {
        this.facultyprofile = facultyProfile;
    }

    public void setInstructor(String teacherId) {
        facultyprofile.setId(teacherId);
    }
}
