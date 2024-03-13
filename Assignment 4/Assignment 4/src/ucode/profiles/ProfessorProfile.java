/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucode.profiles;

import ucode.Person.Person;

/**
 *
 * @author marri
 */
public class ProfessorProfile extends Profile {

    Person person;
//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public ProfessorProfile(Person p) {
        super(p);
        person = p;

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public boolean isMatch(String id) {
        return person.getId().equals(id);
    }

}
