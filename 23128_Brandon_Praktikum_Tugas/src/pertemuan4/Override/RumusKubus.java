/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4.Override;

/**
 *
 * @author brand
 */
public class RumusKubus{
    double sisi;
    
    public RumusKubus(double s){
        this.sisi = s;
    }
    
    double volume(){
        return sisi*sisi;
    }
    
    double luasPermukaan(){
        return 6*(sisi*sisi);
    }
}
