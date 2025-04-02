package com.example.tlucontact;

public class DonVi {
    private String ten;
    private String sdt;
    private String dc;
    private int imgDV;
    private String email;
    private String madv;




    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public DonVi(String ten, String sdt, String dc, int imgDV, String email, String madv) {
        this.ten = ten;
        this.sdt = sdt;
        this.dc = dc;
        this.imgDV = imgDV;
        this.email = email;
        this.madv = madv;

    }

    public int getImgDV() {
        return imgDV;
    }

    public void setImgDV(int imgDV) {
        this.imgDV = imgDV;
    }



    public DonVi(String ten, String sdt, String dc, int imgDV) {
        this.ten = ten;
        this.sdt = sdt;
        this.dc = dc;
        this.imgDV = imgDV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getStd() {
        return sdt;
    }

    public void setStd(String std) {
        this.sdt = std;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }



}
