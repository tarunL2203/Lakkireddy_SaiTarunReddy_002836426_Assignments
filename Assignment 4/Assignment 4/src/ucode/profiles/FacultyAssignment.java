/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.profiles;

import ucode.CourseSchedule.CourseOffer;

/**
 *
 * @author kal bugrara
 */
public class FacultyAssignment {

    double tracerating;
    //CourseOffer courseoffer;
    FacultyProfile facultyprofile;

    public FacultyAssignment(FacultyProfile fp){ //, CourseOffer co){
       //courseoffer = co;
        facultyprofile = fp;
    }

    public double getRating() {

        return tracerating;
    }

    public void setProfRating(double r) {

        tracerating = r;
    }

    public FacultyProfile getFacultyProfile() {
        return facultyprofile;
    }

}
