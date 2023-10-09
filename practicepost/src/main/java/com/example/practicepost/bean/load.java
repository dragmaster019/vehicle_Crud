package com.example.practicepost.bean;


import org.springframework.stereotype.Component;

@Component

public class load {
    private String loadingpoint;
    private String unloadingpoint;

    public load(int shipperid, String loadingpoint, String unloadingpoint, String producttype, String trucktype, int nooftrucks, int weight, String commnent,Long shipperid, String date) {
        this.loadingpoint = loadingpoint;
        this.unloadingpoint = unloadingpoint;
        this.producttype = producttype;
        this.trucktype = trucktype;
        this.nooftrucks = nooftrucks;
        this.weight = weight;
        this.commnent = commnent;

        this.date = date;
    }

    public String getLoadingpoint() {
        return loadingpoint;
    }

    public void setLoadingpoint(String loadingpoint) {
        this.loadingpoint = loadingpoint;
    }

    public String getUnloadingpoint() {
        return unloadingpoint;
    }

    public void setUnloadingpoint(String unloadingpoint) {
        this.unloadingpoint = unloadingpoint;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getTrucktype() {
        return trucktype;
    }

    public void setTrucktype(String trucktype) {
        this.trucktype = trucktype;
    }

    public int getNooftrucks() {
        return nooftrucks;
    }

    public void setNooftrucks(int nooftrucks) {
        this.nooftrucks = nooftrucks;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCommnent() {
        return commnent;
    }

    public void setCommnent(String commnent) {
        this.commnent = commnent;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String producttype;
    private String trucktype;

    private int nooftrucks;
    private int weight;
    private String commnent;

    public load(Long shipperid) {
        this.shipperid = shipperid;
    }

    public Long getShipperid() {
        return shipperid;
    }

    public void setShipperid(Long shipperid) {
        this.shipperid = shipperid;
    }

    private Long shipperid;

    private String date;
}
