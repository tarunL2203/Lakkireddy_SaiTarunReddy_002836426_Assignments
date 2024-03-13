/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.profiles;

import ucode.Person.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {

    ArrayList<StudentProfile> studentlist;

    public StudentDirectory() {

        studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

    public ArrayList<StudentProfile> findStudentAppliedForGraduation() {
        ArrayList<StudentProfile> sps = new ArrayList<>();
        for (StudentProfile sp : studentlist) {

            if (sp.isapplied && sp.Graduated == false) {
                sps.add(sp);
            }
        }
        return sps; //not found after going through the whole list
    }

}
