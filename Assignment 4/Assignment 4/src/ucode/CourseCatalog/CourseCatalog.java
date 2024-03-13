/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.CourseCatalog;

import java.util.ArrayList;
import ucode.profiles.FacultyAssignment;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {

    String lastupdated;
    ArrayList<Course> courselist;

    public CourseCatalog() {
        courselist = new ArrayList();
    }

    public ArrayList<Course> getCourseList() {
        return courselist;
    }

    public Course newCourse(String n, String nm, int cr, FacultyAssignment fa) {
        if(getCourseByNumber(nm)!=null){
            return null;
        }
        Course c = new Course(n, nm, cr, fa);
        courselist.add(c);
        return c;
    }

    public Course getCourseByNumber(String n) {

        for (Course c : courselist) {

            if (c.getCourseNumber().equals(n)) {
                return c;
            }
        }
        return null;
    }

}
