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
public class Latihan1JOP {
    public static void main(String[] args){
    
    int number;
    char letter;
    boolean result;
    String str;
    
    number = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Number"));
    str = JOptionPane.showInputDialog("Masukkan String");
    String msg = "Number = " + number;
    String msg1 = "String = " + str;
        
    JOptionPane.showMessageDialog(null, msg +"\n"+ msg1);
    }
}
