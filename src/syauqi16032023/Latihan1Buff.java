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
public class Latihan1Buff {
     public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        
         int number;
         char letter;
         boolean result;
         String str;
         
         //input
    try{
        System.out.print("Masukkan Number = ");
        number = Integer.parseInt(dataIn.readLine());
        
        System.out.print("Masukkan char = ");
        letter = (char) dataIn.read();
        dataIn.readLine(); // jika tipe data char, harus di tambahkan ini agar input selanjutnya bisa di inputkan
        
        System.out.print("Masukkan result(true / false) = ");
        result = Boolean.parseBoolean(dataIn.readLine());
        
        System.out.print("Masukkan String = ");
        str = dataIn.readLine();
        
        //output dari nilai yang diinput
        System.out.println("\nNumber = " + number);
        System.out.println("letter = " + letter);
        System.out.println("Boolean = " + result);
        System.out.println("String = " + str);
    }catch( IOException e ){
       // System.out.println("Error!");
        }
    
    }
}
    
