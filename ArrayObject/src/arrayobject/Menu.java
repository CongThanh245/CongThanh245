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


import java.util.Scanner;
    class Menu {
        private Scanner sc = new Scanner(System.in);
        public int showMenu() {
            System.out.println("Menu Action:");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            return sc.nextInt();
        }
                
    }
