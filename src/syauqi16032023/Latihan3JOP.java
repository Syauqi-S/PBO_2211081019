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
public class Latihan3JOP {
    public static void main(String[] args){
    
        int a, b, c, highest;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Pertama"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Kedua"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Ketiga"));
        
        highest = (a > b)?((a>c)?a:c):((b>c)?b:c); //logika mencari nilai tertinggi
        String nilai1 = "Nilai Pertama = " + a;
        String nilai2 = "Nilai Kedua = " + b;
        String nilai3 = "Nilai Ketiga = " + c;
        
        JOptionPane.showMessageDialog(null, nilai1 + "\n" + nilai2 + "\n" + nilai3 + "\n" + "Highest = " + highest);
    }
}
