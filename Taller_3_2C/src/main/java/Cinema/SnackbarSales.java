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
public class SnackbarSales {
    public SnackbarProduct myProduct;
    public int quantity;
    public double total;
    public Client myClient;
    public String purchaseDate;

    public SnackbarSales(SnackbarProduct myProduct, int quantity, double total, Client myClient, String purchaseDate) {
        this.myProduct = myProduct;
        this.quantity = quantity;
        this.total = total;
        this.myClient = myClient;
        this.purchaseDate = purchaseDate;
    }

    public SnackbarSales(){
        
    }

    public SnackbarProduct getMyProduct() {
        return myProduct;
    }

    public void setMyProduct(SnackbarProduct myProduct) {
        this.myProduct = myProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(Client myClient) {
        this.myClient = myClient;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.myProduct);
        hash = 13 * hash + this.quantity;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.myClient);
        hash = 13 * hash + Objects.hashCode(this.purchaseDate);
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
        final SnackbarSales other = (SnackbarSales) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.myProduct, other.myProduct)) {
            return false;
        }
        if (!Objects.equals(this.myClient, other.myClient)) {
            return false;
        }
        return Objects.equals(this.purchaseDate, other.purchaseDate);
    }

    @Override
    public String toString() {
        return "SnackbarSales{" + "myProduct=" + myProduct.getName() + ", quantity=" + quantity + ", total=" + total + ", myClient=" + myClient.getName() + ", purchaseDate=" + purchaseDate + '}';
    }
    
}
