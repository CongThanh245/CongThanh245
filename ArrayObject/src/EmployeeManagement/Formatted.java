/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeManagement;

import java.util.Scanner;

class Formatted {
    private Scanner sc = new Scanner(System.in);

    public String validateString(String prompt, String regex, String errorMessage) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = sc.nextLine();
            if (input.matches(regex)) {
                break;
            } else {
                System.out.println(errorMessage);
            }
        }
        return input;
    }

    public int validateInt(String prompt, String errorMessage) {
        int input;
        while (true) {
            try {
                System.out.print(prompt);
                input = Integer.parseInt(sc.nextLine());
                if (input < 0) {
                    throw new Exception("Tuổi phải là số nguyên dương.");
                }
                break;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
        return input;
    }

//    public double validateDouble(String prompt, String errorMessage) {
//        double input;
//        while (true) {
//            try {
//                System.out.print(prompt);
//                input = Double.parseDouble(sc.nextLine());
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println(errorMessage);
//            }
//        }
//        return input;
//    }
}











/**
 *
 * @author PC
// */
//public class Formatted {
//    Scanner sc = new Scanner(System.in);
//    
//    private String a;
//    private String b;
//    private int age;
//    private String luong;
//
//    public Formatted(String a , String b){
//        this.a = a;
//        this.b = b;
//    }
//    
//    public Formatted(int age) {
//        this.age = age;
//    }
//    
//    public Formatted(String luong){
//        this.luong = luong;
//    }
//    
//    public String getA() {
//        return a;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getLuong() {
//        return luong;
//    }
//    
//    
//
//    public void checkFormatted(String item) {
//        
//        while (true){
//            try {
//                if (!a.matches(b)) {
//                    throw new Exception("wrong");
//                }
//                
//                return;
//                
//            } catch (Exception e) {
//                System.out.println(item + " sai cú pháp. Nhập lại");
//                System.out.print(item + " : ");
//                a = sc.nextLine();
//            }
//        }
//    }
//    public void checkFormatted(String item, int c) {
//           while (true){
//            try {
//                if (age < 0 && !isDigit(age)) {
//                    throw new Exception("wrong");
//                }
//                
//                return;
//                
//            } catch (Exception e) {
//                System.out.println(item + " sai cú pháp. Nhập lại");
//                System.out.print(item + " : ");
//                age = sc.nextInt();
//            }
//        }
//    }
//}
