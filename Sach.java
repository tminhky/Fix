package Doan;
import java.util.Scanner;
 
public class Sach {
    private String maSach, nhaXuatBan;
    private double donGia;
    private int soLuong;
    Scanner scanner = new Scanner(System.in);
    
     
    public Sach() {
        super();
    }
 
    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super();
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
 
    public String getMaSach() {
        return maSach;
    }
 
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
 
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
 
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
 
    public double getDonGia() {
        return donGia;
    }
 
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
 
    public int getSoLuong() {
        return soLuong;
    }
 
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
 
    public void nhapSach() {
        System.out.print("Nhap ma sach: ");
        maSach = scanner.next();
        System.out.print("Nhap ten nha xuat ban: ");
        nhaXuatBan = scanner.next();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten NXB =  " + nhaXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So Luong: " + soLuong);
            
            }
    
     
    @Override
    public String toString() {
        return "Ma sach: " + this.maSach + ", ten nha xuat ban: " + this.nhaXuatBan + ", don gia: " + 
                this.donGia + ", so luong: " + this.soLuong;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
