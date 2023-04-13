/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller_3_2c_segunda_parte;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author LabSispc18
 */
public class Person {
    private String name;
    private String ID;
    private String Birthdate;

    public Person(String name, String ID, String Birthdate) {
        this.name = name;
        this.ID = ID;
        this.Birthdate = Birthdate;
    }
    
    public Person(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.ID);
        hash = 97 * hash + Objects.hashCode(this.Birthdate);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return Objects.equals(this.Birthdate, other.Birthdate);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", ID=" + ID + ", Birthdate=" + Birthdate + '}';
    }
}
