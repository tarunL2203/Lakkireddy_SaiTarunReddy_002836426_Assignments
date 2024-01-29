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
public class BankDLog {
    private ArrayList<BankDC>register ;
    public BankDLog(){
    this.register = new ArrayList<BankDC>();   
}

    public ArrayList<BankDC> getRegister() {
        return register;
    }

    public void setRegister(ArrayList<BankDC> register) {
        this.register = register;
    }
    
    public BankDC addNewAcc(){
        BankDC newAcc = new BankDC();
        register.add(newAcc);
        return newAcc;
        
    }
    public void deleteAccount(BankDC vs) {
         register.remove(vs);
         
                 
    }
}
