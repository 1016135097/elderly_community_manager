package com.company.project.model;

import javax.persistence.*;

public class Comments {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    private String username;

    @Column(name = "movieId")
    private String movieid;

    private Short rating;

    private String content;

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

    /**
     * @return rating
     */
    public Short getRating() {
        return rating;
    }

    /**
     * @param rating
     */
    public void setRating(Short rating) {
        this.rating = rating;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}