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
public class Function {
    private Movie myMovie;
    private int roomNumber;
    private int hourBegin;
    private int minuteBegin;
    private double ticketPrice;

    public Function(Movie myMovie, int roomNumber, int hourBegin, int minuteBegin, double ticketPrice) {
        this.myMovie = myMovie;
        this.roomNumber = roomNumber;
        this.hourBegin = hourBegin;
        this.minuteBegin = minuteBegin;
        this.ticketPrice = ticketPrice;
    }

    public Movie getMyMovie() {
        return myMovie;
    }

    public void setMyMovie(Movie myMovie) {
        this.myMovie = myMovie;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getHourBegin() {
        return hourBegin;
    }

    public void setHourBegin(int hourBegin) {
        this.hourBegin = hourBegin;
    }

    public int getMinuteBegin() {
        return minuteBegin;
    }

    public void setMinuteBegin(int minuteBegin) {
        this.minuteBegin = minuteBegin;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.myMovie);
        hash = 97 * hash + this.roomNumber;
        hash = 97 * hash + this.hourBegin;
        hash = 97 * hash + this.minuteBegin;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.ticketPrice) ^ (Double.doubleToLongBits(this.ticketPrice) >>> 32));
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
        final Function other = (Function) obj;
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        if (this.hourBegin != other.hourBegin) {
            return false;
        }
        if (this.minuteBegin != other.minuteBegin) {
            return false;
        }
        if (Double.doubleToLongBits(this.ticketPrice) != Double.doubleToLongBits(other.ticketPrice)) {
            return false;
        }
        return Objects.equals(this.myMovie, other.myMovie);
    }

    @Override
    public String toString() {
        return "Function{" + "myMovie=" + myMovie.getName() + ", roomNumber=" + roomNumber + ", Schedule=" + hourBegin + ":" + minuteBegin + ", Duration=" + myMovie.getDuration() + " minutes, ticketPrice=" + ticketPrice + '}';
    }

           
}
