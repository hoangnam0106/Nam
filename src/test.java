
import java.beans.Transient;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.print.DocFlavor;


public class test {
    public static void Write(ArrayList<Khoa> list, File myFile){
        try {           
            OutputStream fos = new FileOutputStream(myFile);    
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
            fos.close();
        }catch (IOException e) {
        }
    }
    
    public static void Read(ArrayList<Khoa> list, File myFile) throws IOException, ClassNotFoundException{
        try {
            FileInputStream fis = new FileInputStream(myFile);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while(fis.available() > 0){
                ArrayList<Khoa> k = (ArrayList<Khoa>) ois.readObject();
                for(int i = 0; i < k.size(); i++){
                    System.out.print(k.get(i).getMaNV()+ "\t" + k.get(i).getTen()+ "\t" + k.get(i).getMaPB()
                + "\t" + k.get(i).getTenPB()+ "\t" + k.get(i).getMaKhoa()+ "\t" + k.get(i).getTenKhoa() + "\n");
                }
            }
        ois.close();
        fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }

    public static void Delete(ArrayList<Khoa> list, File myFile, String maNV){
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getMaNV().equals(maNV)){
                System.out.println(i);
                System.out.println(list.get(i).getMaNV());
                list.remove(i);
                i--;
            }
        }
        Write(list, myFile);
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        String maNV, tenNV, maPB, tenPB, maKhoa, tenKhoa;
        int tuoi;
        String str = "MaNV\t" + "TenNV\t" + "MaPB\t" + "TenPB\t" + "MaKhoa\t" +"TenKhoa\t\n";
        File myFile = new File("NhanVien.txt");
        ArrayList<Khoa> list = new ArrayList<>();
        FileInputStream fis = new FileInputStream(myFile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while(fis.available() > 0){
            list = (ArrayList<Khoa>) ois.readObject();  
        }  
        int select;
        do{
            System.out.println("1.Them NV.");
            System.out.println("2.Hien Thi Danh Sach NV.");
            System.out.println("3.Xoa NV.");
            select = input.nextInt();
            switch(select){
            case 1:
                System.out.print("Nhập số nhân viên ");
                int n = input.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.println("\nNhập NV " + (i+1));
                    System.out.print("MaNV: ");
                    maNV = input.next();
                    System.out.print("Tên NV: ");
                    tenNV = input.next();
                    System.out.print("MaPB: ");
                    maPB = input.next();
                    System.out.print("Tên PB: ");
                    tenPB = input.next();
                    System.out.print("MaKhoa: ");
                    maKhoa = input.next();
                    System.out.print("Tên Khoa: ");
                    tenKhoa = input.next();
                    Khoa k = new Khoa(maNV, tenNV, maPB, tenPB, maKhoa, tenKhoa);
                    list.add(k);
                }     
                Write(list,myFile);
                System.out.println("\n");
                break;
            case 2:
                System.out.print(str);
                Read(list, myFile);
                System.out.println("\n");
                break;
            case 3:
                System.out.println("Nhap ma NV can xoa:");
                String deleteMaNV = input.next();
                Delete(list, myFile, deleteMaNV);
                System.out.println("Danh Sach Sau Khi Xoa");
                Read(list, myFile);
                System.out.println("\n");
                break;
            }      
        }while(select != 0);
        
        
    }
}
