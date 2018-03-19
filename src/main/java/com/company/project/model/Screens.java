package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Screens {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;

    @Column(name = "movieId")
    private String movieid;

    private Date time;

    private Float price;

    @Column(name = "ticketNum")
    private Short ticketnum;

    @Column(name = "hallNum")
    private String hallnum;

    @Column(name = "playingType")
    private String playingtype;

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
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return ticketNum
     */
    public Short getTicketnum() {
        return ticketnum;
    }

    /**
     * @param ticketnum
     */
    public void setTicketnum(Short ticketnum) {
        this.ticketnum = ticketnum;
    }

    /**
     * @return hallNum
     */
    public String getHallnum() {
        return hallnum;
    }

    /**
     * @param hallnum
     */
    public void setHallnum(String hallnum) {
        this.hallnum = hallnum;
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
}