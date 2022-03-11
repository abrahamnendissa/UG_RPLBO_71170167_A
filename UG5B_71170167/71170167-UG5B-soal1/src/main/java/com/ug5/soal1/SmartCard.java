package com.ug5.soal1;

public class SmartCard {
    private String nama;
    private long saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void topUp(Voucher vch){
        vch.setNominal(100000);
        saldo = saldo + 100000;
        System.out.println("Kode Voucher: " + vch.getKode() + "|| Top up sukses!");

    }
}
