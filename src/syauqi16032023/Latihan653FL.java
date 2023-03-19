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
public class Latihan653FL {
    public static void main(String[] args){
    
    String nama; //deklarasi nama
    //input nama
    nama = JOptionPane.showInputDialog(null,"Masukkan nama anda");
    
    for(int n = 1; n <= 100; n++){ //melakukan perulangan sebanyak 100 kali
        System.out.println(nama + " ke " + n); //output nama dan nilai n setiap perulangan
    }
        
    }
}
