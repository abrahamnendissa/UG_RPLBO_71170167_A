package com.ug5.soal2;

public class App
{
    public static void infoBuku(Buku book){
        System.out.println();
    }
    public static void main( String[] args ){
        Buku bukuA = new Buku("Cinta itu Alasan Sekaligus Tujuan","Kang Maman",62400,5);
        Buku bukuB = new Buku("Autumn in Paris","Ilana Tan",63200,7);
        Buku bukuC = new Buku("Critical Eleven","Ika Natassa",74400,2);
        System.out.println("\n========== Daftar Buku Gramedia==========\n");
        infoBuku(bukuA);
        infoBuku(bukuB);
        infoBuku(bukuC);
    }
}
