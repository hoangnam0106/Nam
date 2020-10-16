
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nhân viên ");
        int n = input.nextInt();
        String maNV, tenNV, maPB, tenPB, maKhoa, tenKhoa;
        int tuoi;
        String str = "MaNV\t" + "TenNV\t" +"Tuoi\t" + "MaPB\t" + "TenPB\t" + "MaKhoa\t" +"TenKhoa\t\n";
        try {
            File myFile = new File("NhanVien.txt");
            FileOutputStream fos = new FileOutputStream(myFile);        
            fos.write(str.getBytes());
            fos.flush();
            for (int i = 0; i < n; i++) {
                System.out.println("\nNhập NV " + (i+1));
                System.out.print("MaNV: ");
                maNV = input.next();
                System.out.print("Tên NV: ");
                tenNV = input.next();
                System.out.print("Tuổi: ");
                tuoi = input.nextInt();
                System.out.print("MaPB: ");
                maPB = input.next();
                System.out.print("Tên PB: ");
                tenPB = input.next();
                System.out.print("MaKhoa: ");
                maKhoa = input.next();
                System.out.print("Tên Khoa: ");
                tenKhoa = input.next();
                Khoa k = new Khoa(maNV, tenNV, tuoi, maPB, tenPB, maKhoa, tenKhoa);
                fos.write((k.getMaNV()+"\t").getBytes());
                fos.write((k.getTen()+"\t").getBytes());
                fos.write((k.getTuoi()+"\t").getBytes());
                fos.write((k.getMaPB()+"\t").getBytes());
                fos.write((k.getTenPB()+"\t").getBytes());
                fos.write((k.getMaKhoa()+"\t").getBytes());
                fos.write((k.getTenKhoa()+"\t\n").getBytes());
                fos.flush();        
            }
            
        } catch (Exception e) {
        }
        
        
    }

}
