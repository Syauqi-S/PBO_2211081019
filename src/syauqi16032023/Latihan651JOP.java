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
public class Latihan651JOP {
    public static void main(String[] args){
    
        int tgs1, tgs2, tgs3, avg; //deklarasi nilai tugas dan rata-rata
        
        //input nilai tugas
        tgs1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai 1 : "));
        tgs2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai 2 : "));
        tgs3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Nilai 3 : "));
        
        avg = (tgs1 + tgs2 + tgs3) / 3; //proses mencari rata-rata
            
        if(avg >= 60 && avg <= 100){ //range nilai diatas rata-rata (60-100)
            JOptionPane.showMessageDialog(null, "rata-rata nilai = " + avg + "\nSelamat nilai anda diatas rata-rata :)");
        }
        else if( avg < 0 || avg > 100){ // kondisi ketika user memasukkan angka diluar dari range (0-100)
            JOptionPane.showMessageDialog(null, "Tolong Masukkan nilai dari 0 - 100 saja >:(");
        }
        else{ //range nilai dibawah rata-rata (0-59)
            JOptionPane.showMessageDialog(null, "rata-rata nilai = " + avg + "\nNilai anda dibawah rata-rata :(");
        }
    }
}
