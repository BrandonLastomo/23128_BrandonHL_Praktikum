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

    // constructor rumusKubus
    public RumusKubus(double s){
        this.sisi = s;
    }

    // s*s
    double volume(){
        return sisi*sisi;
    }

    // 6*(s*s)
    double luasPermukaan(){
        return 6*(sisi*sisi);
    }
}
