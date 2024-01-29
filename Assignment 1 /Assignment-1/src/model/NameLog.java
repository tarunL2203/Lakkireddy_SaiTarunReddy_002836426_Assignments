/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author saitarunreddylakkireddy
 */
public class NameLog {
    
    private ArrayList<PersonC> log;
    public NameLog(){
    this.log = new ArrayList<PersonC>();
    }

    public ArrayList<PersonC> getLog() {
        return log;
    }

    public void setLog(ArrayList<PersonC> log) {
        this.log = log;
    }
    
    public PersonC addNewName(){
        PersonC newName = new PersonC();
        log.add(newName);
        return newName;
        
    }
    
    public void deleteProfile(PersonC vs) {
        log.remove(vs);
    }
}
