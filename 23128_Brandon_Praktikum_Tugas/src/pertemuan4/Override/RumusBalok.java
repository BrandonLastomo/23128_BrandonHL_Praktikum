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
    
    public RumusBalok(double sisi, double lebar, double tinggi){
        super(sisi);
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    double volume(){
        return sisi*lebar*tinggi;
    }
    
    @Override
    double luasPermukaan(){
        return 2*((sisi*lebar)+(sisi*tinggi)+(lebar*tinggi));
    }
}
