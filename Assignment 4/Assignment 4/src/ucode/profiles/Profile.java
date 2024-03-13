/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucode.profiles;

import ucode.Person.Person;

/**
 *
 * @author kal bugrara
 */
public abstract class Profile {
    Person person;
     public Profile(Person p){
        person = p;
        
    }
    
     public abstract String getRole();
    
    public Person getPerson(){
        return person;
    }
     

        public boolean isMatch(String id) {
        if(person.getId().equals(id)) {
            return true;
        }
        return false;
    }

}
