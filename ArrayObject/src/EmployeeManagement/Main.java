/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formatted fmt = new Formatted();

        int n = fmt.validateInt("Nhập số lượng nhân viên: ", "Lỗi: Vui lòng nhập số lượng nhân viên là một số nguyên dương.");
        NhanVien[] listNV = new NhanVien[n];

        for (int i = 0; i < listNV.length; i++) {
            System.out.println("Nhập nhân viên " + (i + 1) + ":");
            String maNV = fmt.validateString("Mã nhân viên: ", "^SE\\d{3}", "Mã nhân viên sai cú pháp. Nhập lại");
            String tenNV = fmt.validateString("Họ Tên: ", "^[A-Z][a-zA-Z'-]*( [A-Z][a-zA-Z'-]*)*$", "Họ tên sai cú pháp. Nhập lại");
            int age = fmt.validateInt("Tuổi: ", "Tuổi sai cú pháp. Nhập lại");
            String sLuong = fmt.validateString("Lương: ", "^[0-9]+(\\.[0-9]+)?$", "Lương sai cú pháp. Nhập lại");
            double luong = Double.parseDouble(sLuong);
            listNV[i] = new NhanVien(maNV, tenNV, age, luong);
        }

        Arrays.sort(listNV);
        for (NhanVien nv : listNV) {
            System.out.println(nv);
        }
    }
}

/**
 *
 * @author PC
// */
//public class Main {
//
//    public static void main(String[] args) {
//        NhanVien NhanVien = new NhanVien("", "", 0, 0);
//        Scanner sc = new Scanner(System.in);
//        int n = 0;
//        try {
//            System.out.print("Nhập số lượng nhân viên: ");
//            n = Integer.parseInt(sc.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Lỗi: Vui lòng nhập số lượng nhân viên là một số nguyên dương.");
//        }
//        String maNV = "";
//        String tenNV = "";
//        int age = 0;
//        double luong = 0;
//        NhanVien[] listNV = new NhanVien[n];
//
//        Formatted fmt = null;
//
//        for (int i = 0; i < listNV.length; i++) {
//            System.out.println("Nhập nhân viên " + (i + 1) + ":");
//            
//            while (true) {
//                System.out.print("Mã nhân viên: ");
//                maNV = sc.nextLine();
//                fmt = new Formatted(maNV , "^SE\\d{3}");                
//                fmt.checkFormatted("Mã nhân viên");
//                maNV = fmt.getA();
//                break;
//            }
//            
//            while (true) {
//                System.out.print("Họ Tên: ");
//                tenNV = sc.nextLine();
//                fmt = new Formatted(tenNV , "^[A-Z][a-zA-Z'-]*( [A-Z][a-zA-Z'-]*)*$");                
//                fmt.checkFormatted("Họ tên");
//                tenNV = fmt.getA();
//                break;
//            }
//            
//            while (true) {
//                System.out.print("Tuổi: ");
//                age = Integer.parseInt(sc.nextLine());
//                fmt = new Formatted(age);
//                fmt.checkFormatted("Tuổi", 0);
//                age = fmt.getAge();
//                break;
//            }
//            while (true) {
//                System.out.print("Lương: ");
//                luong = Double.parseDouble(sc.nextLine());
//                String sluong = Double.toString(luong);
//                fmt = new Formatted(sluong , "^[0-9]");                
//                fmt.checkFormatted("Lương");
//                tenNV = fmt.getLuong();
//                break;
//            }
// 
//
//            sc.nextLine();
//
//            listNV[i] = new NhanVien(maNV, tenNV, age, luong);
//        }
//
//        Arrays.sort(listNV);
//        NhanVien.toString();
//
//    }
//}
