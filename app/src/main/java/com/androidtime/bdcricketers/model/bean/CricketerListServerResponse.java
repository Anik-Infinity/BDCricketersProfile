package com.androidtime.bdcricketers.model.bean;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CricketerListServerResponse {

    @SerializedName("players")
    @Expose
    private List<Player> players = null;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

}