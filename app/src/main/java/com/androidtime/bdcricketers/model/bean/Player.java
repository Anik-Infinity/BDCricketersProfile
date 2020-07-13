package com.androidtime.bdcricketers.model.bean;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("player_image")
    @Expose
    private String playerImage;
    @SerializedName("current_team")
    @Expose
    private String currentTeam;
    @SerializedName("english")
    @Expose
    private English english;
    @SerializedName("bangla")
    @Expose
    private Bangla bangla;
    @SerializedName("gallery")
    @Expose
    private List<Object> gallery = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(String playerImage) {
        this.playerImage = playerImage;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public English getEnglish() {
        return english;
    }

    public void setEnglish(English english) {
        this.english = english;
    }

    public Bangla getBangla() {
        return bangla;
    }

    public void setBangla(Bangla bangla) {
        this.bangla = bangla;
    }

    public List<Object> getGallery() {
        return gallery;
    }

    public void setGallery(List<Object> gallery) {
        this.gallery = gallery;
    }

}