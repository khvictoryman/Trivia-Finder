package com.triviafinder.Trivia.Finder.models.host;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class HostReviewsModel {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "hostId")
    private Integer host;

    @NotNull
    private Integer userId;

    @NotNull
    private Integer userGivenRank;

    @NotNull
    @NotEmpty
    private String review;


    @NotNull
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(@NotNull Integer userId) {
        this.userId = userId;
    }

    @NotNull
    public Integer getUserGivenRank() {
        return userGivenRank;
    }

    public void setUserGivenRank(@NotNull Integer userGivenRank) {
        this.userGivenRank = userGivenRank;
    }

    @NotNull
    public String getReview() {
        return review;
    }

    public void setReview(@NotNull String review) {
        this.review = review;
    }

/*
    @NotNull
    public Integer getHostId() {
        return hostReviewId;
    }

    public void setHostId(@NotNull Integer hostId) {
        this.hostReviewId = hostId;
    }
*/
}
