/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan1;

/**
 *
 * @author brand
 */
public class MatematikaCanggihBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek dari class MatematikaCanggih
        MatematikaCanggih operasiMatematika = new MatematikaCanggih();
        
        // memanggil method
        operasiMatematika.tambah(1, 2);
        operasiMatematika.kurang(5, 4);
        operasiMatematika.kali(10, 15);
        operasiMatematika.bagi(18, 2);
        operasiMatematika.modulus(6, 2);
    }
    
}
