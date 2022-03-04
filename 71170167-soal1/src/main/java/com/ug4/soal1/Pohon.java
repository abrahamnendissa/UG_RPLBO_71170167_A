package com.ug4.soal1;

import java.time.LocalDate;
import java.util.Date;

public class Pohon {
    private int daun;
    private int akar;
    private int dahan;
    private int MASAHIDUP;
    private int umur;
    private Buah buah;
    private Musim musim;
    LocalDate tanggalMusim;

    public int getDaun(){
        return daun;
    }

    private void setDaun(int daun) {
        this.daun = daun;
    }


    public int getAkar(){
        return akar;
    }

     private void setAkar(int akar) {
        this.akar = akar;
    }

    public int getDahan(){
        return dahan;
    }
    private void setDahan(int dahan){
        this.dahan = dahan;
    }

    public int getMASAHIDUP(){
        return MASAHIDUP;
    }

    public int getUmur(){
        return umur;
    }
    private void setUmur(int umur){
        this.umur = umur;
    }

    public Buah getBuah() {
        return buah;
    }
    private void setBuah(Buah buah) {
        this.buah = buah;
    }

    public Musim getMusim() {
        return musim;
    }
    public void setMusim(Musim musim) {
        this.musim = musim;
    }

    public LocalDate getTanggalMusim() {
        return tanggalMusim;
    }
    public void setTanggalMusim(LocalDate tanggalMusim) {
        this.tanggalMusim = tanggalMusim;
    }
}

