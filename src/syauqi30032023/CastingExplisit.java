/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi30032023;

/**
 *
 * @author LEGION Y540
 */
public class CastingExplisit {
    public static void main(String[] args){
/*    //ASCII A = 65 a = 97
        char valChar = 'A';
        int valInt = valChar;
        System.out.println(valInt); //casting explisit : keluaran 65
*/        
        double valDouble = 10.12;
        int valInt = (int)valDouble;
        
        double x = 10.2;
        int y = 2;
        
        int result = (int)(x/y);
        
        System.out.println("valDouble : " + valDouble);
        System.out.println("valInt(hasil konversi double ke int): " + valInt);
        System.out.println("result (x/y) : " + result);
    }
}
