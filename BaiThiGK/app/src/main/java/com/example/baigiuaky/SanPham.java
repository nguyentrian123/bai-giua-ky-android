package com.example.baigiuaky;

import java.io.Serializable;

public class SanPham implements Serializable {
    String tenSP;
    double giaSP;

    public SanPham(String tenSP,double giaSP)
    {
        this.tenSP = tenSP ;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
}
