/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.profiles;

import ucode.CourseSchedule.CourseOffer;
import java.util.ArrayList;
import ucode.Person.Person;

/**
 *
 * @author kal bugrara
 */
public class FacultyProfile extends Profile {

    Person person;
    ArrayList<FacultyAssignment> facultyassignments;

    @Override
    public String getRole() {
        return "Professor";
    }

    public FacultyProfile(Person p) {
        super(p);
        person = p;
        facultyassignments = new ArrayList();
    }

    public double getProfAverageOverallRating() {

        double sum = 0.0;
        //for each facultyassignment extract class rating
        //add them up and divide by the number of teaching assignmnet;
        for (FacultyAssignment fa : facultyassignments) {

            sum = sum + fa.getRating();

        }
        //divide by the total number of faculty assignments

        return sum / (facultyassignments.size() * 1.0); //this ensure we have double/double

    }

    public FacultyAssignment AssignAsTeacher() { //CourseOffer co) {

        FacultyAssignment fa = new FacultyAssignment(this); // ,co);
        //FacultyAssignment fa = new FacultyAssignment(this);
        facultyassignments.add(fa);

        return fa;
    }

    public FacultyProfile getCourse(String courseid) {
//        for(FacultyAssignment fa : facultyassignments){
//            if(fa.getCourse()== courseid){
//        }
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (person.getId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        return person.getName();
    }
}
