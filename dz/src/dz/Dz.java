/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы в цельсиях: ");
        double celsius = in.nextDouble();
        double farenheit = (celsius * 9 / 5)  + 32;
        System.out.printf("Градусы в фаренгейтах = " + "%.2f", farenheit);
        
        int x = new Scanner(System.in).nextInt();
        int summ = 0;
        System.out.println("Единиц: " + x % 10);
        System.out.println("Десятков: " + x / 10 % 10);
        System.out.println("Сотен: " + x / 100);
        while (x > 0) {
            summ += x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр: " + summ);
    }
    
}
