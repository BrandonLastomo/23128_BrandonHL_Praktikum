/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.Override;

/**
 *
 * @author brand
 */
public class RumusBalok extends RumusKubus{
    double lebar, tinggi;

    // constructor rumusBalok
    public RumusBalok(double sisi, double lebar, double tinggi){
        // mengisi panjang untuk balok menggunakan variabel sisi dari class rumusBalok
        super(sisi);
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // override method rumus volume balok dari method rumus volume kubus 
    @Override
    double volume(){
        return sisi*lebar*tinggi;
    }
    
    // override method rumus luas permukaan balok dari method rumus luas permukaan kubus
    @Override
    double luasPermukaan(){
        return 2*((sisi*lebar)+(sisi*tinggi)+(lebar*tinggi));
    }
}
