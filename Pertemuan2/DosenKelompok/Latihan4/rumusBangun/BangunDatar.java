/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan4.rumusBangun;

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
    public double kelilingSegitiga(double s1, double s2, double s3){
        return (s1+s2+s3);
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
    public double kelilingPersegi(double s){
        return 4*s;
    }
    public double luasPersegi(double s){
        return (s*s);
    }
}