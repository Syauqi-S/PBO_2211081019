/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi16032023;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author LEGION Y540
 */
public class Latihan3Buff {
    public static void main(String[] args){
    
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int a, b, c, highest;
        
        try{ //input nilai
            System.out.print("Masukkan nilai pertama = ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai kedua = ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai ketiga = ");
            c = Integer.parseInt(dataIn.readLine());
            
            //output
            highest = (a > b)?((a>c)?a:c):((b>c)?b:c);
            System.out.println("\nNilai Pertama = " + a);
            System.out.println("Nilai Kedua = " + b);
            System.out.println("Nilai Ketiga = " + c);
            System.out.println("Nilai tertinggi = " + highest);
        }catch( IOException e){
        
        }
    }
}
