package com.example.crud2;

public class Kullanici {
    String uid,ad,email;

    public Kullanici() {

    }

    public Kullanici(String uid, String ad, String email) {
        this.uid = uid;  // kullanici primary key olacak
        this.ad = ad;
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
