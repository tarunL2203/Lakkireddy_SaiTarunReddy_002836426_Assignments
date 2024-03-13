/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucode.profiles;

import java.util.ArrayList;
import ucode.Business;
import ucode.Person.Person;

/**
 *
 * @author kal bugrara
 */
public class ProfessorDirectory {

//    Business business;
    ArrayList<ProfessorProfile> professorList;

    public ProfessorDirectory() {

//        business = d;
        professorList = new ArrayList();

    }

    public ProfessorProfile newProfessorProfile(Person p) {

        ProfessorProfile sp = new ProfessorProfile(p);
        professorList.add(sp);
        return sp;
    }

    public ProfessorProfile findProfessor(String id) {

        for (ProfessorProfile sp : professorList) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

}
