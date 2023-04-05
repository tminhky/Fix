package Doan;

import java.util.ArrayList;

public class SachKhoaHoc extends Sach {
    private double thueSachKh, thanhTien;
    int soSachKhoaHoc;
 
    public SachKhoaHoc() {
        super();
    }
 
    public SachKhoaHoc(double thueSachKh) {
        super();
        this.thueSachKh = thueSachKh;
    }
 
    public double getThueSachKh() {
        return thueSachKh;
    }
 
    public void setThueSachKh(double thueSachKh) {
        this.thueSachKh = thueSachKh;
    }

    public double getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public void nhapSach() {
        ArrayList<SachKhoaHoc> arrSachKhoaHoc = new ArrayList<>();
        System.out.println("Nhap thong tin sach khoa hoc:");
        System.out.print("Nhap so sach khoa hoc: ");
        int soSachKhoaHoc = scanner.nextInt();
        for (int i = 0; i < soSachKhoaHoc; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            super.nhapSach();

        }
        System.out.print("Nhap thue sach khoa hoc: ");
        double thueSachKh = scanner.nextDouble();
        double tongTienSachKhoaHoc = 0;
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            tongTienSachKhoaHoc = arrSachKhoaHoc.get(i).getSoLuong() * arrSachKhoaHoc.get(i).getDonGia() + thueSachKh;
        }        System.out.println("Tong tien sach khoa hoc = " + tongTienSachKhoaHoc);
        
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            System.out.println(arrSachKhoaHoc.get(i).toString());
        }
        System.out.println("---Trung binh cong don gia cac sach khoa hoc---");
        double trungBinhCongDonGiaSachKH = 0;
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            double tongDonGiaSachKhoaHoc = arrSachKhoaHoc.get(i).getDonGia();
            trungBinhCongDonGiaSachKH = tongDonGiaSachKhoaHoc;
        }
        trungBinhCongDonGiaSachKH /= arrSachKhoaHoc.size(); // Tính trung bình cộng đơn giá
        System.out.println("Trung binh cong don gia cac sach khoa hoc = " + trungBinhCongDonGiaSachKH);
        System.out.println("---Cac sach khoa hoc cua nha xuat ban X---");
        System.out.println("-----Thong tin sach khoa hoc-----");
        for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
            if (arrSachKhoaHoc.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                System.out.println(super.toString());
            }
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", thueSachKh: " + this.thueSachKh;
    }
}
