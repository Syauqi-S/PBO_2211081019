/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syauqi07032023;

/**
 *
 * @author LABSIKOMP03
 */
public class ContohIncrement {
    public static void main(String[] args){
    int i = 10;
    int j = 3;
    int k = 0;
	int inc1, inc2;
	
    inc1 = Increment1(i,j,k); //memanggil method Increment1
	
    System.out.println("\nIncrement dengan ++j");
    System.out.println("k = " + k);
    System.out.println("j = " + j);
    System.out.println("i = " + i);
    System.out.println("Hasil inc = " + inc1);
 
	
	inc2 = Increment2(i,j,k); //memanggil method Increment2
	
    System.out.println("\nIncrement dengan j++");
    System.out.println("k = " + k);
    System.out.println("j = " + j);
    System.out.println("i = " + i);
    System.out.println("Hasil inc = " + inc2);
	
    }
	public static int Increment1(int i,int j,int k){ //method utk ++j
		k = ++j + i;
		return k;
	}
	
	public static int Increment2(int i,int j,int k){ //method utk j++
		k = j++ + i;
		return k;
	}
}
