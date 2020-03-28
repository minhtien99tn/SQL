package com.example.sql;

public class SinhVienModel {
    int id;
    String hoten, namsinh, lop, sothich;
    int gioitinh;

    public SinhVienModel(int id, String hoten, String namsinh, String lop, String sothich, int gioitinh) {
        this.id = id;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.lop = lop;
        this.sothich = sothich;
        this.gioitinh = gioitinh;
    }
    public SinhVienModel(String hoten, String namsinh, String lop, String sothich, int gioitinh) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.lop = lop;
        this.sothich = sothich;
        this.gioitinh = gioitinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSothich() {
        return sothich;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }
}
