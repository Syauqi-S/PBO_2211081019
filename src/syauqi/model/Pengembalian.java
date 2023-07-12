/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syauqi.model;

/**
 *
 * @author LEGION Y540
 */
public class Pengembalian {
    private Anggota anggota;
    private Buku buku;
    private Peminjaman peminjaman;
    private String tgldikembalikan;
    private int terlambat;
    private double denda;

    public Pengembalian(){
    }

    public Pengembalian(Anggota anggota, Buku buku, Peminjaman peminjaman, String tgldikembalikan, int terlambat, double denda) {
        this.anggota = anggota;
        this.buku = buku;
        this.peminjaman = peminjaman;
        this.tgldikembalikan = tgldikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    public String getTgldikembalikan() {
        return tgldikembalikan;
    }

    public void setTgldikembalikan(String tgldikembalikan) {
        this.tgldikembalikan = tgldikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
    
    
    
    
}
