/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan3;

/**
 *
 * @author brand
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek dari class MatematikaCanggih
        MatematikaCanggih operasiMatematika = new MatematikaCanggih("23128", "Brandon");
        
        // memanggil method
        operasiMatematika.tambah(12.5, 28.7, 14.2);
        operasiMatematika.tambah(12.6, 28, 14);
        operasiMatematika.tambah(23, 34.5);
        operasiMatematika.tambah(3.4, 9);
    }
    
}
