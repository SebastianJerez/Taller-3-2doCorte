/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinema;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author LabSispc18
 */
public class Employee extends Person{
    private String role;
    private double salary;
    private String assignedArea;
    private String entryTime;
    private String departureTime;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getWage() {
        return salary;
    }

    public void setWage(double wage) {
        this.salary = wage;
    }

    public String getDesignedArea() {
        return assignedArea;
    }

    public void setDesignedArea(String designedArea) {
        this.assignedArea = designedArea;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Employee(String role, double salary, String assignedArea, String entryTime, String departureTime, String name, String ID, String birthdate) {
        super(name, ID, birthdate);
        this.role = role;
        this.salary = salary;
        this.assignedArea = assignedArea;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
    }

    public Employee(String role, double salary, String assignedArea, String entryTime, String departureTime) {
        this.role = role;
        this.salary = salary;
        this.assignedArea = assignedArea;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
    }

    public Employee(){
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.role);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.assignedArea);
        hash = 47 * hash + Objects.hashCode(this.entryTime);
        hash = 47 * hash + Objects.hashCode(this.departureTime);
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
        final Employee other = (Employee) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        if (!Objects.equals(this.assignedArea, other.assignedArea)) {
            return false;
        }
        if (!Objects.equals(this.entryTime, other.entryTime)) {
            return false;
        }
        return Objects.equals(this.departureTime, other.departureTime);
    }

    @Override
    public String toString() {
        return "Employee{"+ "name=" + this.getName() + "ID=" + this.getID() + "Birthdate=" + this.getBirthdate() + "role=" + role + ", salary=" + salary + ", assignedArea=" + assignedArea + ", entryTime=" + entryTime + ", departureTime=" + departureTime + '}';
    }
    
    
}
