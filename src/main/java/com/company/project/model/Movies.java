package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Movies {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    private String name;

    @Column(name = "playingTime")
    private Date playingtime;

    private Short duration;

    @Column(name = "movieType")
    private String movietype;

    @Column(name = "playingType")
    private String playingtype;

    private Boolean expired;

    private Float rating;

    @Column(name = "ratingNum")
    private Short ratingnum;

    private String poster;

    private String description;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return playingTime
     */
    public Date getPlayingtime() {
        return playingtime;
    }

    /**
     * @param playingtime
     */
    public void setPlayingtime(Date playingtime) {
        this.playingtime = playingtime;
    }

    /**
     * @return duration
     */
    public Short getDuration() {
        return duration;
    }

    /**
     * @param duration
     */
    public void setDuration(Short duration) {
        this.duration = duration;
    }

    /**
     * @return movieType
     */
    public String getMovietype() {
        return movietype;
    }

    /**
     * @param movietype
     */
    public void setMovietype(String movietype) {
        this.movietype = movietype;
    }

    /**
     * @return playingType
     */
    public String getPlayingtype() {
        return playingtype;
    }

    /**
     * @param playingtype
     */
    public void setPlayingtype(String playingtype) {
        this.playingtype = playingtype;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * @param expired
     */
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    /**
     * @return rating
     */
    public Float getRating() {
        return rating;
    }

    /**
     * @param rating
     */
    public void setRating(Float rating) {
        this.rating = rating;
    }

    /**
     * @return ratingNum
     */
    public Short getRatingnum() {
        return ratingnum;
    }

    /**
     * @param ratingnum
     */
    public void setRatingnum(Short ratingnum) {
        this.ratingnum = ratingnum;
    }

    /**
     * @return poster
     */
    public String getPoster() {
        return poster;
    }

    /**
     * @param poster
     */
    public void setPoster(String poster) {
        this.poster = poster;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}