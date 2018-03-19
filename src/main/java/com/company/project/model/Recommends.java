package com.company.project.model;

import javax.persistence.*;

public class Recommends {
    @Id
    @Column(name = "movieId")
    private String movieid;

    /**
     * @return movieId
     */
    public String getMovieid() {
        return movieid;
    }

    /**
     * @param movieid
     */
    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }
}