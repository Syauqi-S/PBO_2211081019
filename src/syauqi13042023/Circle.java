/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi13042023;

/**
 *
 * @author LEGION Y540
 */
import java.util.Scanner;
public class Circle{
        
    private double r;
    
    public Circle(double r){
        this.r = r;
    }
    
    public double getArea(){
        double area = 3.14*r*r;
        return area;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai circle a(r) : ");
        int a = in.nextInt();
        System.out.print("Masukkan Nilai circle b(r) : ");
        int b = in.nextInt();
        
        Circle Circlea = new Circle(a);
        Circle Circleb = new Circle(b);
        Relation banding = new MyDouble();
        
        System.out.println("Area a : " + Circlea.getArea());
        System.out.println("Area b : " + Circleb.getArea());
        System.out.println("Circle a > Circle b : " + banding.isGreater(Circlea.getArea(),Circleb.getArea()));
        System.out.println("Circle a < Circle b : " + banding.isLess(Circlea.getArea(),Circleb.getArea()));
        System.out.println("Circle a = Circle b : " + banding.isEqual(Circlea.getArea(),Circleb.getArea()));
    }
}
