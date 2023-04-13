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
public class Manager extends Person{
    private String role;
    private double salary;
    private String area;

    public Manager(String role, double salary, String area, String name, String ID, String Birthdate) {
        super(name, ID, Birthdate);
        this.role = role;
        this.salary = salary;
        this.area = area;
    }

    public Manager(String role, double salary, String area) {
        this.role = role;
        this.salary = salary;
        this.area = area;
    }
    
    public Manager(){
        
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.role);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.area);
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
        final Manager other = (Manager) obj;
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return Objects.equals(this.area, other.area);
    }

    @Override
    public String toString() {
        return "Manager{" + "role=" + role + ", salary=" + salary + ", area=" + area + '}';
    }
}
