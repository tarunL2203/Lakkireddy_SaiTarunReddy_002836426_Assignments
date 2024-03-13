/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraduationAudit;

import ucode.Person.Person;
import ucode.profiles.Profile;

/**
 *
 * @author
 */
public class Evaluator extends Profile {
    
    

    public Evaluator(Person person, Person p) {
        super(p);
        
    }
    
    

    @Override
    public String getRole() {
        return "Evaluator";
    }
    
    
}
