package Doan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("===== Quan ly sach =====");
            System.out.println("1. Sach giao khoa");
            System.out.println("2. Sach khoa hoc");
            System.out.println("3. Sach lich su");
            System.out.println("4. Sach tam ly");
            System.out.println("5. Truyen tranh");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon loai sach: ");       
    int choice = sc.nextInt();
    Scanner scanner = new Scanner(System.in);
            switch (choice) {
                case 1:
                ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
                int soSachGiaoKhoa;
                double tongTienSachGiaoKhoa = 0,tongDonGiaSachGiaoKhoa = 0, trungBinhCongDonGiaSachGK = 0;
               
              
                 
                System.out.print("Nhap so sach  giao khoa: ");
                soSachGiaoKhoa = scanner.nextInt();
                
               
               
       
                System.out.println("Nhap thong tin sach giao khoa:");
                for (int i = 0; i < soSachGiaoKhoa; i++) {
                    System.out.println("Nhap thong tin quyen sach thu  " + (i + 1) + ":");
                    SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
                    sachGiaoKhoa.nhapSach();
                    arrSachGiaoKhoa.add(sachGiaoKhoa);
                }
              
                
                 
       
                for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
                    if (arrSachGiaoKhoa.get(i).getNumber() == 0) {
                        tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                            arrSachGiaoKhoa.get(i).getDonGia() * 50 / 100;
                    } else if (arrSachGiaoKhoa.get(i).getNumber() == 1) {
                        tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                            arrSachGiaoKhoa.get(i).getDonGia();
                    }
                }
                System.out.println("Tong tien sach giao khoa = " + tongTienSachGiaoKhoa);  
                
                System.out.println("-----Thong tin sach giao khoa-----");
                for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
                    System.out.println(arrSachGiaoKhoa.get(i).toString());
                }
                
                
                System.out.println("---Trung binh cong đon gia cac sach giao khoa---");
                for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
                    tongDonGiaSachGiaoKhoa += arrSachGiaoKhoa.get(i).getDonGia();
                    trungBinhCongDonGiaSachGK = tongDonGiaSachGiaoKhoa / arrSachGiaoKhoa.size();
                }
                System.out.println("Trung binh cong don gia cac sach giao khoa = " + trungBinhCongDonGiaSachGK);
                
        // --------------------0-----------------Thong itn nha xuat ban cua cac loai sach
                //--1
                System.out.println("---Cac sach giao khoa cua nha xuat ban X---");
                for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
                    if (arrSachGiaoKhoa.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                        System.out.println(arrSachGiaoKhoa.get(i).toString());
                    }
                }
                break;



                case 2:
                int soSachKhoaHoc;
                double tongTienSachKhoaHoc = 0, tongDonGiaSachKhoaHoc = 0,trungBinhCongDonGiaSachKH = 0;
                ArrayList<SachKhoaHoc> arrSachKhoaHoc = new ArrayList<>();
                System.out.print("Nhap so sach khoa hoc: ");
                soSachKhoaHoc = scanner.nextInt();
                System.out.println("Nhap thong tin sach khoa hoc:");
                for (int i = 0; i < soSachKhoaHoc; i++) {
                    System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
                    SachKhoaHoc sachKH = new SachKhoaHoc();
                    sachKH.nhapSach();
                    arrSachKhoaHoc.add(sachKH);
                }
                for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
                    tongTienSachKhoaHoc += arrSachKhoaHoc.get(i).getSoLuong() * 
                        arrSachKhoaHoc.get(i).getDonGia() + arrSachKhoaHoc.get(i).getThueSachKh();
                }
                System.out.println("Tong tien sach khoa hoc = " + tongTienSachKhoaHoc); 
                System.out.println("-----Thong tin sach khoa hoc-----");
                for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
                    System.out.println(arrSachKhoaHoc.get(i).toString());
                }
                System.out.println("---Trung binh cong đon gia cac sach khoa hoc---");
                for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
                    tongDonGiaSachKhoaHoc += arrSachKhoaHoc.get(i).getDonGia();
                    trungBinhCongDonGiaSachKH = tongDonGiaSachKhoaHoc / arrSachKhoaHoc.size();
                }
                System.out.println("Trung binh cong don gia cac sach khoa hoc = " + trungBinhCongDonGiaSachKH);  

                System.out.println("---Cac sach khoa hoc cua nha xuat ban X---");
                for (int i = 0; i < arrSachKhoaHoc.size(); i++) {
                    if (arrSachKhoaHoc.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                        System.out.println(arrSachKhoaHoc.get(i).toString());
                    }
                }
                    break;
                case 3:

                double tongTienSachLichSu = 0,tongDonGiaSachLichSu = 0,trungBinhCongDonGiaSachLS = 0;
                int soSachLichSu;
                ArrayList<SachLichSu> arrSachLichSu = new ArrayList<>();
                System.out.print("Nhap so sach lich su: ");
                soSachLichSu = scanner.nextInt();
                System.out.println("Nhap thong tin sach lich su:");
                for (int i = 0; i < soSachLichSu; i++) {
                    System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
                    SachLichSu sachLS = new SachLichSu();
                    sachLS.nhapSach();
                    arrSachLichSu.add(sachLS);
                }
                for (int i = 0; i < arrSachLichSu.size(); i++) {
                    tongTienSachLichSu += arrSachLichSu.get(i).getSoLuong() * 
                        arrSachLichSu.get(i).getDonGia() + arrSachLichSu.get(i).getThueSachLs();
                }
                System.out.println("Tong tien sach lich su = " + tongTienSachLichSu);
                System.out.println("-----Thong tin sach lich su-----");
                for (int i = 0; i < arrSachLichSu.size(); i++) {
                    System.out.println(arrSachLichSu.get(i).toString());
                }
                System.out.println("---Trung binh cong đon gia cac sach lich su---");
                for (int i = 0; i < arrSachLichSu.size(); i++) {
                    tongDonGiaSachLichSu += arrSachLichSu.get(i).getDonGia();
                    trungBinhCongDonGiaSachLS = tongDonGiaSachLichSu / arrSachLichSu.size();
                }
                System.out.println("Trung binh cong don gia cac sach lich su = " + trungBinhCongDonGiaSachLS);
                System.out.println("---Cac sach lich su cua nha xuat ban X---");
                for (int i = 0; i < arrSachLichSu.size(); i++) {
                    if (arrSachLichSu.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                        System.out.println(arrSachLichSu.get(i).toString());
                    }
                }
                    break;




                case 4:
                double tongTienSachTamLy = 0,tongDonGiaSachTamLy = 0,trungBinhCongDonGiaSachTL = 0;
                int soSachTamLy;
                ArrayList<SachTamLy> arrSachTamLy = new ArrayList<>();
                System.out.print("Nhap so sach tam ly: ");
                soSachTamLy = scanner.nextInt();
                
                System.out.println("Nhap thong tin sach tam ly:");
                for (int i = 0; i < soSachTamLy; i++) {
                    System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
                    SachTamLy sachTL = new SachTamLy();
                    sachTL.nhapSach();
                    arrSachTamLy.add(sachTL);
                }
                for (int i = 0; i < arrSachTamLy.size(); i++) {
                    tongTienSachTamLy += arrSachTamLy.get(i).getSoLuong() * 
                        arrSachTamLy.get(i).getDonGia() + arrSachTamLy.get(i).getThuesachtl();
                }
                System.out.println("Tong tien sach tam ly = " + tongTienSachTamLy);
                System.out.println("-----Thong tin sach tam ly-----");
                for (int i = 0; i < arrSachTamLy.size(); i++) {
                    System.out.println(arrSachTamLy.get(i).toString());
                }
                System.out.println("---Trung binh cong đon gia cac sach tam ly---");
                for (int i = 0; i < arrSachTamLy.size(); i++) {
                    tongDonGiaSachTamLy += arrSachTamLy.get(i).getDonGia();
                    trungBinhCongDonGiaSachTL = tongDonGiaSachTamLy / arrSachTamLy.size();
                }
                System.out.println("Trung binh cong don gia cac sach tam ly= " + trungBinhCongDonGiaSachTL);
                System.out.println("---Cac sach tam ly cua nha xuat ban X---");
                for (int i = 0; i < arrSachTamLy.size(); i++) {
                    if (arrSachTamLy.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                        System.out.println(arrSachTamLy.get(i).toString());
                    }
                }
                    break;




                case 5:
                double tongTienTruyenTranh = 0, tongDonGiaTruyenTranh = 0,trungBinhCongDonGiaTT = 0;
                int  soTruyenTranh;
                ArrayList<TruyenTranh> arrTruyenTranh = new ArrayList<>();
                System.out.println("Nhap so truyen tranh: ");
                soTruyenTranh = scanner.nextInt();
        
                System.out.println("Nhap thong tin truyen tranh:");
                for (int i = 0; i < soTruyenTranh; i++) {
                    System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
                    TruyenTranh truyentranh = new TruyenTranh();
                    truyentranh.nhapSach();
                    arrTruyenTranh.add(truyentranh);
                }
                for (int i = 0; i < arrTruyenTranh.size(); i++) {
                    tongTienTruyenTranh += arrTruyenTranh.get(i).getSoLuong() * 
                        arrTruyenTranh.get(i).getDonGia() + arrTruyenTranh.get(i).getThuetruyentranh();
                }
                System.out.println("Tong tien truyen tranh = " + tongTienTruyenTranh);
        
                System.out.println("-----Thong tin truyen tranh-----");
                for (int i = 0; i < arrTruyenTranh.size(); i++) {
                    System.out.println(arrTruyenTranh.get(i).toString());
                }
                System.out.println("---Trung binh cong đon gia cac truyen tranh---");
                for (int i = 0; i < arrTruyenTranh.size(); i++) {
                    tongDonGiaTruyenTranh += arrTruyenTranh.get(i).getDonGia();
                    trungBinhCongDonGiaTT = tongDonGiaTruyenTranh / arrTruyenTranh.size();
                }
                System.out.println("Trung binh cong don gia cac truyen tranh= " + trungBinhCongDonGiaTT);
                System.out.println("---Cac truyen tranh cua nha xuat ban X---");
                for (int i = 0; i < arrTruyenTranh.size(); i++) {
                    if (arrTruyenTranh.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
                        System.out.println(arrTruyenTranh.get(i).toString());
                    }
                }
                     break;
                
                case 0:
                    System.out.println("Chuong trinh ket thuc.");
                    System.exit(0);
                    break; 
                default:
                    System.out.println("Chuc nang khong hop le. Vui long chon lai.");
                    break;
            }            
              
        }
        

    }

