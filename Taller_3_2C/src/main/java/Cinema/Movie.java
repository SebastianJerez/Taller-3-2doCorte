/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinema;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author sebas
 */
public class Movie {
    
    private String name;
    private String releaseDate;
    private int duration;
    private String gender;
    private String audience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    @Override
    public String toString() {
        return "Movie{" + "name=" + name + ", releaseDate=" + releaseDate + ", duration=" + duration + ", gender=" + gender + ", audience=" + audience + '}';
    }

    public Movie(String name, String releaseDate, int duration, String gender, String audience) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.gender = gender;
        this.audience = audience;
    }
    
    public Movie(){
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.releaseDate);
        hash = 23 * hash + Objects.hashCode(this.duration);
        hash = 23 * hash + Objects.hashCode(this.gender);
        hash = 23 * hash + Objects.hashCode(this.audience);
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
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.audience, other.audience)) {
            return false;
        }
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        return Objects.equals(this.duration, other.duration);
    }
    
}
