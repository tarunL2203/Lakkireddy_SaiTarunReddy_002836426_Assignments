/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ucode.CourseCatalog.Course;
import ucode.CourseCatalog.CourseCatalog;
import ucode.CourseSchedule.CourseOffer;
import ucode.CourseSchedule.CourseSchedule;
import ucode.Person.PersonDirectory;
import ucode.profiles.EmployeeDirectory;

import ucode.UserAccounts.UserAccountDirectory;
import ucode.profiles.FacultyAssignment;
import ucode.profiles.FacultyDirectory;
import ucode.profiles.ProfessorDirectory;
import ucode.profiles.StudentDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    CourseCatalog courseCatalog;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    StudentDirectory studentDirectory;
    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    FacultyDirectory facultyDirectory;
    HashMap<String, CourseSchedule> mastercoursecatalog;

    public Business(String n) {
        mastercoursecatalog = new HashMap<>();
        name = n;
        courseCatalog = new CourseCatalog();
        facultyDirectory = new FacultyDirectory();
        studentDirectory = new StudentDirectory();
        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
//        mastercoursecatalog.put("Spring 2023", new CourseSchedule("Spring 2023", new CourseCatalog()));
//        mastercoursecatalog.put("Summer 2023", new CourseSchedule("Summer 2023", new CourseCatalog()));
//        mastercoursecatalog.put("Fall 2023", new CourseSchedule("Fall 2023", new CourseCatalog()));
//        mastercoursecatalog.put("Spring 2024", new CourseSchedule("Spring 2024", new CourseCatalog()));

    }

    public double getCourseRatings(String id) {
        double sum = 0.0;
        int count = 0;
        for (String sem : getSems()) {

            ArrayList<CourseOffer> coList = getCourseSchedule(sem).getCourseSchedule();
            for (CourseOffer co : coList) {
                if (co.getCourse().getCourseNumber().equals(id)) {
                    sum = sum + co.getRating();
                    count++;
                }
            }
        }

        return sum / count;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, this);// courseCatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public String[] getSems() {
        return mastercoursecatalog.keySet().toArray(new String[0]);
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public String[] getcredType() {
        //Integer[] creds = new Integer[2];
        HashSet<String> hs = new HashSet<String>();
        for (Course c : courseCatalog.getCourseList()) {
            hs.add(String.valueOf(c.getCredits()));
        }
        String[] creds = new String[hs.size()];
        return hs.toArray(creds);
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

}
