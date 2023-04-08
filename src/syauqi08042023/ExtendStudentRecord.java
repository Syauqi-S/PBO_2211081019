/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi08042023;

import syauqi01042023.StudentRecord;
import javax.swing.JOptionPane;
/**
 *
 * @author LEGION Y540
 */
public class ExtendStudentRecord extends StudentRecord{
    
    private double excelGrade;
    private double pptGrade;
    private double wordGrade;
    
    public double getExcelGrade(){
        return excelGrade;
    }
    
    public void setExcelGrade(double excelGrade){
        this.excelGrade = excelGrade;
    }
    
    public double getPptGrade(){
        return pptGrade;
    }
    
    public void setPptGrade(double pptGrade){
        this.pptGrade = pptGrade;
    }
    
    public double getWordGrade(){
        return wordGrade;
    }
    
    public void setWordGrade(double wordGrade){
        this.wordGrade = wordGrade;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public double getAverage(){
        average = (excelGrade + pptGrade + wordGrade) / 3;
        return average;
    }
    
    public static void main(String[] args){
        ExtendStudentRecord c = new ExtendStudentRecord();
        
        String nama = JOptionPane.showInputDialog("Masukkan nama");
        c.setName(nama);
        
        int excel = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai Excel"));
        c.setExcelGrade(excel);
        int ppt = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai PowerPoint"));
        c.setPptGrade(ppt);
        int word = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai Word"));
        c.setWordGrade(word);
        
        JOptionPane.showMessageDialog(null,"=====Computer Grade=====" + "\nNama : " + c.getName() 
                + "\nNilai Excel      : " + c.getExcelGrade()
                + "\nNilai PowerPoint : " + c.getPptGrade()
                + "\nNilai Word       : " + c.getWordGrade()
                + "\nRata-rata        : " + c.getAverage());
    }
}
