/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author saitarunreddylakkireddy
 */
public class personDirectory {
    public ArrayList<Person> log;
    
    

    public personDirectory() {
       
        this.log = new ArrayList <Person>();
        
    }

    public ArrayList<Person> getLog() {
        return log;
    }
    public void setLog(ArrayList<Person> log) {
        this.log = log;
    }
   
   
   public Person addNewPerson(){
       Person person = new Person();
       log.add(person);
       return person;              
   }
      
   public void deletePerson (Person person) {
       log.remove(person);
       
   }
   
   public Person searchPerson (String search) {
       for(Person person: log) {
            if ((search != null && person.getFirstName().equals(search)) ||
                (search != null && person.getLastName().equals(search)) ||
                (search != null && person.getHomeAddress().getStreet().equals(search)) ||
                (search !=null && person.getWorkAddress().getStreet().equals(search))) {
                
                return person;
           
           }
        }
       return null; 
    }
   
   

}
