package com.example.tlucontact;

public class CBGV {
    private String ten;
    private String sdt;
    private String dc;
    private String email;
    private String bomon;
    private String khoa;
    private String magv;

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public CBGV(String ten, String sdt, String dc, String email, int imgGV) {
        this.ten = ten;
        this.sdt = sdt;
        this.dc = dc;
        this.email = email;
        this.imgGV = imgGV;
    }

    public CBGV(String ten, String sdt, String dc, String email, String bomon, String khoa, int imgGV, String magv) {
        this.ten = ten;
        this.sdt = sdt;
        this.dc = dc;
        this.email = email;
        this.bomon = bomon;
        this.khoa = khoa;
        this.imgGV = imgGV;
        this.magv = magv;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getBomon() {
        return bomon;
    }

    public void setBomon(String bomon) {
        this.bomon = bomon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImgGV() {
        return imgGV;
    }

    public void setImgGV(int imgGV) {
        this.imgGV = imgGV;
    }

    private int imgGV;
}
