package com.triviafinder.Trivia.Finder.models.host;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class HostRankModel {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Integer host;

    @NotNull
    private Integer hostRank;

    @NotNull
    private Integer numOfReviews;

    @NotNull
    public Integer getHostRank() {
        return hostRank;
    }

    public void setHostRank(@NotNull Integer hostRank) {
        this.hostRank = hostRank;
    }

    @NotNull
    public Integer getNumOfReviews() {
        return numOfReviews;
    }

    public void setNumOfReviews(@NotNull Integer numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

/*
    @NotNull
    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(@NotNull Integer hostId) {
        this.hostId = hostId;
    }
*/
}
