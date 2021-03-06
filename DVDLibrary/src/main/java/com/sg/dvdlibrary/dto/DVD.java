/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dto;

import java.util.Objects;

/**
 *
 * @author mohammedchowdhury
 */
//Title
//Release date
//MPAA rating
//Director's name
//Studio
//User rating or note (allows the user to enter additional information, e.g., "Good family movie")
public class DVD {

    private String title;
    private String releaseDate; // (MM/DD/YYYY)
    private String mpaaRating; //  (G , PG , PG-13 , R , NC-17)
    private String directorName;
    private String studio;
    private String rating;

    public DVD(String title) {
        this.title = title;
    }

    public DVD(String title, String releaseDate, String mpaaRating, String directorName, String studio, String rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.mpaaRating = mpaaRating;
        this.directorName = directorName;
        this.studio = studio;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.releaseDate);
        hash = 67 * hash + Objects.hashCode(this.mpaaRating);
        hash = 67 * hash + Objects.hashCode(this.directorName);
        hash = 67 * hash + Objects.hashCode(this.studio);
        hash = 67 * hash + Objects.hashCode(this.rating);
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
        final DVD other = (DVD) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        if (!Objects.equals(this.mpaaRating, other.mpaaRating)) {
            return false;
        }
        if (!Objects.equals(this.directorName, other.directorName)) {
            return false;
        }
        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        if (!Objects.equals(this.rating, other.rating)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DVD{" + "title=" + title + ", releaseDate=" + releaseDate + ", mpaaRating=" + mpaaRating + ", directorName=" + directorName + ", studio=" + studio + ", rating=" + rating + '}';
    }
}