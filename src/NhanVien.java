/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class NhanVien {
    String ma;
    String ten;
    int tuoi;

    public String getMaNV() {
        return ma;
    }

    public void setMaNV(String maNV) {
        this.ma = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public NhanVien(String ma, String ten, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }
    
    
}
