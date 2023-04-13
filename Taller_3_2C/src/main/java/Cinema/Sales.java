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
public class Sales {
    private Client myClient;
    private Function myFunction;
    private int numberOfTickets;
    private double total;
    private String purchaseDate;

    public Sales(Client myClient, Function myFunction, int numberOfTickets, double total, String purchaseDate) {
        this.myClient = myClient;
        this.myFunction = myFunction;
        this.numberOfTickets = numberOfTickets;
        this.total = total;
        this.purchaseDate = purchaseDate;
    }
    
    public Sales(){
        
    }

    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(Client myClient) {
        this.myClient = myClient;
    }

    public Function getMyFunction() {
        return myFunction;
    }

    public void setMyFunction(Function myFunction) {
        this.myFunction = myFunction;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.myClient);
        hash = 23 * hash + Objects.hashCode(this.myFunction);
        hash = 23 * hash + this.numberOfTickets;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.purchaseDate);
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
        final Sales other = (Sales) obj;
        if (this.numberOfTickets != other.numberOfTickets) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.myClient, other.myClient)) {
            return false;
        }
        if (!Objects.equals(this.myFunction, other.myFunction)) {
            return false;
        }
        return Objects.equals(this.purchaseDate, other.purchaseDate);
    }

    @Override
    public String toString() {
        return "Sales{" + "Client=" + myClient.getName() + ", Function=" + myFunction.getMyMovie().getName() + ", numberOfTickets=" + numberOfTickets + ", total=" + total + ", purchaseDate=" + purchaseDate + '}';
    }
    
    
}
