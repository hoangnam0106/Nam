
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Khoa extends PhongBan implements Serializable {
    private String maKhoa;
    private String tenKhoa;

    public Khoa(String ma, String ten, String maPB, String tenPB, String maKhoa, String tenKhoa) {
        super(ma, ten, maPB, tenPB);
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }
    
    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    
}
