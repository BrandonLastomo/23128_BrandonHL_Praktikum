/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author brand
 */
public class RumusBangunRuang {
    // overloading rumus luas dan volume
    
    // kubus
    // luas: 6s^2
    double luas(double s){
        return 6*(s*s);
    }
    // volume: s^3
    double volume(double s){
        return s*s*s;
    }
    
    // balok
    // luas: 2*((p*l)+(p*t)+(l*t))
    double luas(double p, double l, double t){
        return 2*((p*l)+(p*t)+(l*t));
    }
    // volume: p*l*t
    double volume(double p, double l, double t){
        return p*l*t;
    }
}