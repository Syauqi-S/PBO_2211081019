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
public class Latihan2Buff {
    public static void main(String[] args){
    
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int a, b, c, avg;
        
        try{
            System.out.print("Masukkan number 1 = ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan number 2 = ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan number 3 = ");
            c = Integer.parseInt(dataIn.readLine());
            
            avg = (a + b + c) / 3;
            System.out.println("number 1 = " + a);
            System.out.println("number 2 = " + b);
            System.out.println("number 3 = " + c);
            System.out.println("average = " + avg);
        }catch( IOException e ){
            
        }
        
    }
}
