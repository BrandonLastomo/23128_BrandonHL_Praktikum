/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan4;

/**
 *
 * @author brand
 */
public class BangunDatar {
    public final double pi = 3.14;
    
    // persegi panjang
    public double kelilingPersegiPanjang(double p, double l){
        return (2*(p+l));
    }
    public double luasPersegiPanjang(double p, double l){
        return (p*l);
    }
    
    // segitiga
    public double kelilingSegitiga(double s){
        return (3*s);
    }
    public double luasSegitiga(double a, double t){
        return (a*t)/2;
    }
    
    // lingkaran
    public double kelilingLingkaran(double r){
        return (2*pi*r);
    }
    public double luasLingkaran(double r){
        return (pi*r*r);
    }
    
    // persegi empat (bujur sangkar)
    public double kelilingPersegiEmpat(double s){
        return 4*s;
    }
    public double luasPersegiEmpat(double s){
        return (s*s);
    }
}
