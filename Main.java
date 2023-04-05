package Doan;
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
            System.out.print("Chon chuc nang: ");       
    int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    SachKhoaHoc sachkh = new SachKhoaHoc();
                    sachkh.nhapSach();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                case 4:
                    
                    break;
                case 5:
                   
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
