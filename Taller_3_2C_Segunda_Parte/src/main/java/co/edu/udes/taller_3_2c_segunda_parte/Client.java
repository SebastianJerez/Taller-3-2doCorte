/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller_3_2c_segunda_parte;

import java.util.Date;

/**
 *
 * @author LabSispc18
 */
public class Client extends Person{
    private boolean affiliate;

    public Client(boolean membership, String name, String ID, String Birthdate) {
        super(name, ID, Birthdate);
        this.affiliate = membership;
    }

    public Client(boolean membership) {
        this.affiliate = membership;
    }
    
    public Client(){
        
    }

    public boolean isMembership() {
        return affiliate;
    }

    public void setMembership(boolean membership) {
        this.affiliate = membership;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (this.affiliate ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        return this.affiliate == other.affiliate;
    }

    @Override
    public String toString() {
        return "Client{" + "membership=" + affiliate + '}';
    }
}
