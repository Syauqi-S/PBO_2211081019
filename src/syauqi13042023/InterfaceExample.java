/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi13042023;

/**
 *
 * @author LEGION Y540
 */
public class InterfaceExample {
    public static void main(String[] args){
        
        //anggap Relation sebagai interface port usb, bisa digunakan apa saja (jadi myinteger, dan mydouble)
        Relation MyInteger = new MyInteger(); //new akan tetap dari myinteger
        Relation MyDouble = new MyDouble();
        
        System.out.println("10 dan 11 " + MyInteger.isEqual(10, 11)); //hasil boolean
        System.out.println("10.4 dan 11.6 " + MyDouble.isEqual(10.4, 11.6));
        System.out.println("10 dan 11 " + MyInteger.isGreater(10, 11));
        
    }
}
