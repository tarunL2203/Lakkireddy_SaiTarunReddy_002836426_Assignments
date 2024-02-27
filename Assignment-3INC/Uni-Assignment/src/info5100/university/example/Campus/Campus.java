/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Campus {
    
    Address address;
    ArrayList<Building> buildings;

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }
    
    public Campus(Address a){
    
        address = a;
        buildings = new ArrayList();
        
    }
    
        public Boolean isCampusSafe(){
        
        //Building is safe if all Building are safe
        for(Building building : buildings){
            if(!building.isBuildingSafe())
                return false;
        }
        return true; //to be completed
    }
    
}
