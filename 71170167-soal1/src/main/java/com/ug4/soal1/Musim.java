package com.ug4.soal1;

public class Musim {
    private String nama;
    private int hari;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHari(){
        return hari;
    }

    public void setHari(String hari) {
        this.hari = Integer.parseInt(hari);
    }
}
