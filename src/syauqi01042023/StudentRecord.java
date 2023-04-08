/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi01042023;

/**
 *
 * @author LEGION Y540
 */
public class StudentRecord {
    
    protected String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    protected double average;
    private char huruf;
    
    private static int studentCount;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name; //this. mengambil name dari class, dan = name, ngambil dari parameter method
    }

    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    //MathGrade
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }

    //EnglishGrade
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }

    //scienceGrade
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
 
    // average
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public void setAverage(double average){
        this.average = average;
    }
    
    public static int getStudentCount(){ //static menandakan variable static, menandakan miliknya class yang hanya bias dipakai classnya lgsg
        return studentCount;
    }
    
    public void print(String temp){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
    
    public void print(double mGrade, double eGrade, double sGrade){
        System.out.println("Name " + name);
        System.out.println("MathGrade " + mGrade);
        System.out.println("englishGrade " + eGrade);
        System.out.println("ScienceGrade " + sGrade);
    }
    
    //construktor
    public StudentRecord(){ 
        //area inisialisasi kode;
        studentCount++;
    } 
    
    public StudentRecord(String temp){ 
        this.name = temp; 
        studentCount++;
    }
    
    public StudentRecord(String name, String address, int age){ 
        this.name = name; 
        this.address = address;
        this.age = age;
        studentCount++;
    }
    
    public StudentRecord(double mGrade, double eGrade, double sGrade){ 
        mathGrade = mGrade; 
        englishGrade = eGrade; 
        scienceGrade = sGrade; 
        studentCount++;
    }
    
    public char getHuruf(){
        double average1 = average;
        if(average1 > 80 && average1 <= 100){
            huruf = 'A';
        }
        else if(average1 > 65 && average1 <= 80){
            huruf = 'B';
        }
        else if(average1 > 55 && average1 <= 65){
            huruf = 'C';
        }
        else if(average1 > 40 && average1 <= 55){
            huruf = 'D';
        }
        else{
            huruf = 'E';
        }
        return huruf;
    }
    
}
    
