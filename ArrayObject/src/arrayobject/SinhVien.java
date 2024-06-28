/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobject;

/**
 *
 * @author PC
 */
public class SinhVien {
    private String IdNumber;
    private String name;
    private double averageMark;

    public SinhVien(String IdNumber, String name, double averageMark) {
        this.IdNumber = IdNumber;
        this.name = name;
        this.averageMark = averageMark;
    }
    
    public void displayInfo() {
        System.out.println("Mã sinh viên: " + IdNumber);
        System.out.println("Tên: " + name);
        System.out.println("Điểm trung bình: " + averageMark);
        System.out.println();
    }
    
}