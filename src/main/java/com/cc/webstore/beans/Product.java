package com.cc.webstore.beans;

import java.io.Serializable;

/**
 * Created by chenc on 2017/5/3.
 */
public class Product implements Serializable{

    private String imageUrl;
    private String productName;
    private float originPrice;
    private float curPrice;
    private int account;
    private String intro;
    private String country;
    private String type;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public float getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(float originPrice) {
        this.originPrice = originPrice;
    }

    public float getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(float curPrice) {
        this.curPrice = curPrice;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
