/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2.AslabMandiri.Latihan2;

/**
 *
 * @author brand
 */
public class OutputOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek dari class Matematika
        Matematika operasiMatematika = new Matematika();
        
        // memanggil method
        operasiMatematika.pertambahan(20, 10);
        operasiMatematika.pengurangan(10, 5);
        operasiMatematika.perkalian(10, 3);
        operasiMatematika.pembagian(21, 2);
    }
    
}
