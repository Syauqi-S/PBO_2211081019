/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi30032023;

/**
 *
 * @author LEGION Y540
 */
public class EqualsTest {
    public static void main(String[] args){
    
        String str1, str2; //String = class, str1,str2 = object(karena depannya kelas, jika tipe data maka variable)
        str1 = "Free the bound periodicals.";
        str2 = str1;
        
        System.out.println("String1: " + str1 );
        System.out.println("String2: " + str2 );
        System.out.println("Same object? " + (str1==str2));
        
        str2 = new String(str1); //bikin object baru
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object" + (str1 == str2));
        System.out.println("Same Value?" + str1.equals(str2));
    }
}
