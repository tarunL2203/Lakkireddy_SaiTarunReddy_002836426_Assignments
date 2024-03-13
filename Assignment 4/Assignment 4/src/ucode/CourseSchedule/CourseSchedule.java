/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.CourseSchedule;

import ucode.CourseCatalog.Course;
import ucode.CourseCatalog.CourseCatalog;
import java.util.ArrayList;
import ucode.Business;

/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    CourseCatalog coursecatalog;

    ArrayList<CourseOffer> schedule;
    String semester;
    Business bz;

    public CourseSchedule(String s, Business business) {
        semester = s;
        bz = business;
        coursecatalog = new CourseCatalog();
        schedule = new ArrayList();

    }

    public String getSemester() {
        return semester;
    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }

    public String[] getAllCoursesList() {
        ArrayList<String> courses = new ArrayList<String>();

        for (CourseOffer co : schedule) {

        }

        return courses.toArray(new String[courses.size()]);
    }

    public String[] getCoursesListForProf(String id) {
        ArrayList<String> courses = new ArrayList<String>();

        for (CourseOffer co : schedule) {
            if (co.getCourse().getFacultyProfile().isMatch(id)) {
                courses.add(co.getCourse().getCourseNumber());
            }
        }

        return courses.toArray(new String[courses.size()]);
    }

    public ArrayList<CourseOffer> getCourseSchedule() {
        return schedule;
    }

    public CourseOffer newCourseOffer(String n) {

        Course c = bz.getCourseCatalog().getCourseByNumber(n);
        if (c == null) {
            return null;
        }
        if (getCourseOfferByNumber(n) != null){
            return null;
        }
        CourseOffer co;
        co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }

}
