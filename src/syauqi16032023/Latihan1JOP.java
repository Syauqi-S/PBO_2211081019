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
    String karakter; //untuk tipe data char
    boolean result;
    String str;
    
    number = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Number"));
    karakter = JOptionPane.showInputDialog(null,"Masukkan char");
    
    char letter = karakter.charAt(0); //mengkonversi String karakter menjadi tipe data char
    
    result = Boolean.parseBoolean(JOptionPane.showInputDialog("Masukkan Boolean (True/False)"));
    str = JOptionPane.showInputDialog("Masukkan String");
            
    String msg = "Number = " + number;
    String msg3 = "Boolean = " + result;
    String msg2 = "Char = " + letter;
    String msg1 = "String = " + str;
        
    JOptionPane.showMessageDialog(null, msg +"\n"+ msg1 + "\n" + msg2 + "\n" + msg3);
    }
}
