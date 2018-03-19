package com.company.project.model;

import javax.persistence.*;

public class Favorites {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    private String username;

    @Column(name = "movieId")
    private String movieid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

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