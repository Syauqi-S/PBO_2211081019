/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi16032023;

import javax.swing.JOptionPane; //mengimport class JOptionPane dari package swing
/**
 *
 * @author LEGION Y540
 */
public class Latihan652Sw {
   public static void main(String[] args){
       
    int inu;// deklarasi inu
       
    inu = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai 1-10 "));
    switch(inu){
        case 1:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 5:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 6:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 7:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 8:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 9:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        case 10:
            JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan : " + inu);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Invalid Number!");
       }
   } 
}
