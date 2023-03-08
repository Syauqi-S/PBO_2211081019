/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syauqi07032023;

/**
 *
 * @author LABSIKOMP03
 */
public class Latihan3 {
    public static void main(String[] args){
    
        int a = 10;
        int b = 23;
        int c = 5;
        int highest;
       
        highest = (a > b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Nilai "+a+b+c);
        System.out.println("Nilai tertinggi = " + highest);
    }
}
