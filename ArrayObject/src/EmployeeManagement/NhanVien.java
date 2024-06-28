/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.util.Arrays;
import java.util.Scanner;

class NhanVien implements Comparable<NhanVien> {
    private String maNhanVien;
    private String hoTen;
    private int tuoi;
    private double luong;

    public NhanVien() {}

    public NhanVien(String maNhanVien, String hoTen, int tuoi, double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        System.out.println("____________THÔNG TIN NHÂN VIÊN____________");
        return "Mã số nhân viên: " + maNhanVien + "\nHọ và tên: " + hoTen + "\nTuổi: " + tuoi + "\nLương: " + luong;
    }

    @Override
    public int compareTo(NhanVien t) {
        int luongCompare = Double.compare(this.luong, t.luong);
        if (luongCompare != 0) {
            return luongCompare;
        }
        return t.tuoi - this.tuoi;
    }
}

/**
 *
 * @author PC
 */
//public class NhanVien implements Comparable<NhanVien> {
//    private String maNhanVien;
//    private String hoTen;
//    private int tuoi;
//    private double luong;
//
//    public NhanVien() {
//    }
//
//    public NhanVien(String maNhanVien, String hoTen, int tuoi, double luong) {
//        this.maNhanVien = maNhanVien;
//        this.hoTen = hoTen;
//        this.tuoi = tuoi;
//        this.luong = luong;
//    }
//
//    public String getMaNhanVien() {
//        return maNhanVien;
//    }
//
//    public void setMaNhanVien(String maNhanVien) {
//        this.maNhanVien = maNhanVien;
//    }
//
//    public String getHoTen() {
//        return hoTen;
//    }
//
//    public void setHoTen(String hoTen) {
//        this.hoTen = hoTen;
//    }
//
//    public int getTuoi() {
//        return tuoi;
//    }
//
//    public void setTuoi(int tuoi) {
//        this.tuoi = tuoi;
//    }
//
//    public double getLuong() {
//        return luong;
//    }
//
//    public void setLuong(double luong) {
//        this.luong = luong;
//    }
//
//    @Override
//    public String toString() {
//        return  "Mã số nhân viên = :" + maNhanVien + "\nHọ và tên :" + hoTen + "\nTuoi: " + tuoi + "\nLương: " + luong;
//    }
//    
//
//    @Override
//    public int compareTo(NhanVien t) {
//        int luongCompare = Double.compare(this.luong, t.luong);
//        if(luongCompare != 0 ) {
//            return luongCompare;
//        }
//        return t.tuoi - this.tuoi;
//    }
//    
//}
