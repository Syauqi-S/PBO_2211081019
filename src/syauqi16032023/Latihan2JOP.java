/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi16032023;

import javax.swing.JOptionPane;
/**
 *
 * @author LEGION Y540
 */
public class Latihan2JOP {
    public static void main(String[] args){
    
        int a, b, c, avg;
        
        a = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Number 1"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Number 2"));
        c = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Number 3"));
        
        avg = (a + b + c) / 3;
        String number1 = "Number 1 = " + a;
        String number2 = "Number 2 = " + b;
        String number3 = "Number 3 = " + c;
        
        JOptionPane.showMessageDialog(null, number1 + "\n" + number2 + "\n" + number3 + "\naverage = " + avg);
    }
}
