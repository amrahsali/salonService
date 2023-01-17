package com.example.salonservice;

public class barberModel {

    private String shopname;
    private String View;

    public barberModel(String shopname, String view) {
        this.shopname = shopname;
        this.View = view;
    }
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getView() {
        return View;
    }

    public void setView(String view) {
        View = view;
    }
}
