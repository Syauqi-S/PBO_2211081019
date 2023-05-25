/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_b.model;

/**
 *
 * @author LEGION Y540
 */

public class Gaji {
    private String golongan;
    private String tanggal;
    
    private Pegawai pegawai; //pegawai nip
    private Pegawai pegawain; //pegawai nama
    private int gapok;
    private int tunjanak;
    private int tunjistri;
    
    public Gaji(){
    }
    
    public Gaji(Pegawai pegawai,Pegawai pegawain, String tanggal){
        this.pegawain = pegawain;
        this.pegawai = pegawai;
        this.golongan = golongan;
        this.tanggal = tanggal;
    }
    
    public Pegawai getPegawai(){
        return pegawai;
    }
    
    public void setPegawai(Pegawai pegawai){
        this.pegawai = pegawai;
    }
    
    public String getGolongan(){
        return golongan;
    }
    
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }
    
    public int getGapok(){
        return gapok;
    }
    
    public void setGapok(int gapok){
        this.gapok = gapok;
    }
}
