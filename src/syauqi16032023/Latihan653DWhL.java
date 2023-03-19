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
public class Latihan653DWhL {
    public static void main(String[] args){
    
    String nama; //deklarasi nama
    int n = 1; //deklarasi n
    
    //input nama
    nama = JOptionPane.showInputDialog("Masukkan nama anda");
    
    do{
        System.out.println(nama + " ke " + n);
        n++; // menambah nilai n
    }while(n <= 100); //melakukan perulangan sampai n bernilai 100 setelah itu berhenti

    }
}
