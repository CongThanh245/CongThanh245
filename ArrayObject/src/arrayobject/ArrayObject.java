/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobject;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ArrayObject {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien[] listSV= null;
        int n;
        Menu menu = new Menu();
        int choice; 
        int count = 0;
        do {
            choice = menu.showMenu();
            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sinh vien : " );
                    n = sc.nextInt();
                    sc.nextLine();
                    listSV = new SinhVien[n];
                    
                    for(int i = 0 ;  i < listSV.length; i++) {
                        System.out.println("Enter student " + (i + 1) + ":");
                        System.out.print("StudentID: ");
                        String maSV = sc.nextLine();
                        System.out.print("Name: ");
                        String tenSV = sc.nextLine();
                        System.out.print("Average Mark: ");
                        double diemTB = sc.nextDouble();
                        sc.nextLine();
                        listSV[i] = new SinhVien(maSV, tenSV, diemTB);
                    }
                    break;
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("DISPLAY INFO STUDENT");
                    for (SinhVien sv : listSV) {
                        ++count;
                        System.out.println("Sinh vien "+ count + " :");
                        sv.displayInfo();
                    }
                    break;
                case 3:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid options.");
            }
        } while (choice != 3);
    }
        
        
//        for(int i = 0 ;  i < listSV.length; i++) {
//            System.out.println("Enter student " + (i + 1) + ":");
//            System.out.print("StudentID: ");
//            String maSV = sc.nextLine();
//            System.out.print("Name: ");
//            String tenSV = sc.nextLine();
//            System.out.print("Average Mark: ");
//            double diemTB = sc.nextDouble();
//            sc.nextLine(); 
//
//            listSV[i] = new SinhVien(maSV, tenSV, diemTB);
//        }
//        System.out.println("------------------------------");
//        System.out.println("DISPLAY INFO STUDENT");
//        for (SinhVien sv : listSV) {
//            sv.displayInfo();
//        }

        }
        
 
    
