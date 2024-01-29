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
public class LocalAddressLog {
    
    private ArrayList<LocalAddressC> lalog;
   public LocalAddressLog() {
       
       this.lalog = new ArrayList<LocalAddressC>();
    }

    public ArrayList<LocalAddressC> getLalog() {
        return lalog;
    }

    public void setLalog(ArrayList<LocalAddressC> lalog) {
        this.lalog = lalog;
    }
   public LocalAddressC addLNewAddress(){
    LocalAddressC newLAddress = new LocalAddressC();
       lalog.add(newLAddress); 
       return newLAddress;
    
}
   public void deleteAddress(LocalAddressC vs) {
        lalog.remove(vs);
   
}
   
}
