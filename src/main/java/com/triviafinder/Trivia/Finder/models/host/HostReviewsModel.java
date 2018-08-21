package com.triviafinder.Trivia.Finder.models.host;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class HostReviewsModel {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer hostId;

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

    @NotNull
    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(@NotNull Integer hostId) {
        this.hostId = hostId;
    }
}
