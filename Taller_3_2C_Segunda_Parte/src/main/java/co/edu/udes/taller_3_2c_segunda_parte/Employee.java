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
public class Employee extends Person{
    private String role;
    private double salary;

    public Employee(String role, double salary, String name, String ID, String Birthdate) {
        super(name, ID, Birthdate);
        this.role = role;
        this.salary = salary;
    }

    public Employee(String role, double salary) {
        this.role = role;
        this.salary = salary;
    }
    
    public Employee(){
        
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.role);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
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
        return Objects.equals(this.role, other.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "role=" + role + ", salary=" + salary + '}';
    }    
}
