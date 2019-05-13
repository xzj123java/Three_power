package com.xa.pojo;

public class Vip {
    Integer vid;
    String vname;
    Integer vidcard;
    Integer vphone;
    String vimg;

    public Vip(Integer vid, String vname, Integer vidcard, Integer vphone, String vimg) {
        this.vid = vid;
        this.vname = vname;
        this.vidcard = vidcard;
        this.vphone = vphone;
        this.vimg = vimg;
    }

    public Vip() {
    }

    @Override
    public String toString() {
        return "Vip{" +
                "vid=" + vid +
                ", vname='" + vname + '\'' +
                ", vidcard=" + vidcard +
                ", vphone=" + vphone +
                ", vimg='" + vimg + '\'' +
                '}';
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getVidcard() {
        return vidcard;
    }

    public void setVidcard(Integer vidcard) {
        this.vidcard = vidcard;
    }

    public Integer getVphone() {
        return vphone;
    }

    public void setVphone(Integer vphone) {
        this.vphone = vphone;
    }

    public String getVimg() {
        return vimg;
    }

    public void setVimg(String vimg) {
        this.vimg = vimg;
    }
}
