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
public class Sales {
    private Client myClient;
    private Product myProduct;
    private double totalSale;
    private String purchaseDate;

    public Sales(Client myClient, Product myProduct, double totalSale, String purchaseDate) {
        this.myClient = myClient;
        this.myProduct = myProduct;
        this.totalSale = totalSale;
        this.purchaseDate = purchaseDate;
    }

    public Client getMyClient() {
        return myClient;
    }

    public void setMyClient(Client myClient) {
        this.myClient = myClient;
    }

    public Product getMyProduct() {
        return myProduct;
    }

    public void setMyProduct(Product myProduct) {
        this.myProduct = myProduct;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
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
        hash = 97 * hash + Objects.hashCode(this.myClient);
        hash = 97 * hash + Objects.hashCode(this.myProduct);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.totalSale) ^ (Double.doubleToLongBits(this.totalSale) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.purchaseDate);
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
        if (Double.doubleToLongBits(this.totalSale) != Double.doubleToLongBits(other.totalSale)) {
            return false;
        }
        if (!Objects.equals(this.myClient, other.myClient)) {
            return false;
        }
        if (!Objects.equals(this.myProduct, other.myProduct)) {
            return false;
        }
        return Objects.equals(this.purchaseDate, other.purchaseDate);
    }

    @Override
    public String toString() {
        return "Sales{" + "myClient=" + myClient.getName() + ", myProduct=" + myProduct.getName() + ", totalSale=" + totalSale + ", purchaseDate=" + purchaseDate + '}';
    }
}
