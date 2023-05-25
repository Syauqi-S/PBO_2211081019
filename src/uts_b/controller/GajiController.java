/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_b.controller;

/**
 *
 * @author LEGION Y540
 */
import uts_b.model.*;
import uts_b.view.FormGaji;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class GajiController {
    private Gaji gaji;
    private GajiDao gajiDao;
    private FormGaji formGaji;
    
    private PegawaiDao pegawaiDao;
    
    public GajiController(FormGaji formGaji){
        this.formGaji = formGaji;
        gajiDao = new GajiDaoImpl();
        pegawaiDao = new PegawaiDaoImpl();
    }
    
    public void bersihForm(){
        formGaji.getTxtNama().setText("");
        formGaji.getTxtTanggal().setText("");
    }

        

}
