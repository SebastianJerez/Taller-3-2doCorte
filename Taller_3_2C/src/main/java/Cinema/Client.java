/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinema;

import java.util.Date;

/**
 *
 * @author LabSispc18
 */
public class Client extends Person{
    private boolean memberShip;

    public boolean isIsMember() {
        return memberShip;
    }

    public void setIsMember(boolean isMember) {
        this.memberShip = isMember;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.memberShip ? 1 : 0);
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
        return this.memberShip == other.memberShip;
    }

    public Client(boolean memberShip, String name, String ID, String birthdate) {
        super(name, ID, birthdate);
        this.memberShip = memberShip;
    }

    public Client(boolean isMember) {
        this.memberShip = isMember;
    }
    
    public Client(){
        
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + this.getName() + "ID=" + this.getID() + "Birthdate=" + this.getBirthdate() + "isMember=" + memberShip + '}';
    }
}
