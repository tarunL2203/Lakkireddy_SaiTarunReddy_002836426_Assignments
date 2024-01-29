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
public class HomeAddressLog {
   private ArrayList<HomeAddressC> halog;
   public HomeAddressLog() {
       
       this.halog = new ArrayList<HomeAddressC>();
       
   }

    public ArrayList<HomeAddressC> getHalog() {
        return halog;
    }

    public void setHalog(ArrayList<HomeAddressC> halog) {
        this.halog = halog;
    }
   public HomeAddressC addHNewAddress(){
       HomeAddressC newHAddress = new HomeAddressC();
       halog.add(newHAddress); 
       return newHAddress;
       
   }
    public void deleteAddress(HomeAddressC vs) {
        halog.remove(vs);
    }
}
