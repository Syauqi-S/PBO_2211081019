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
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World");
        
        int i,j,k;
        
        for(i=1;i<=5;i++)
        {
            for(j=5;j>5;j--)
            {
                System.out.print(" ");
            }
            for(k=i;k<j;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
