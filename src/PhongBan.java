/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class PhongBan extends NhanVien{
    private String maPB;
    private String tenPB;
    public PhongBan(String ma, String ten, int tuoi, String maPB, String tenPB) {
        super(ma, ten, tuoi);
        this.maPB = maPB;
        this.tenPB = tenPB;
    }

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

}
