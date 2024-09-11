/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan4;

/**
 *
 * @author brand
 */
public class BangunRuang extends BangunDatar {
    
    // balok
    public double luasPermukaanBalok(double p, double l, double t){
        return (2*((p+l)+(p*t)+(l*t)));
    }
    public double volumeBalok (double p, double l, double t){
        return (luasPersegiPanjang(p, l)*t);
    }
    
    // prisma
    public double luasPermukaanPrisma(double alasSegitiga, double tinggiSegitiga, double t){
        return 2*luasSegitiga(alasSegitiga, tinggiSegitiga) ;
    }
    public double luasSegitiga(double a, double t){
        return (a*t)/2;
    }
    
    // tabung
    public double luasPermukaanTabung(double r, double t){
        return kelilingLingkaran(r)*(pi+t);
    }
    public double volumeTabung(double r, double t){
        return luasLingkaran(r)*t;
    }
    
    // kubus
    public double luasPermukaanKubus(double s){
        return luasPersegiEmpat(s)*6;
    }
    public double volumeKubus(double s){
        return luasPersegiEmpat(s)*s;
    }
}
