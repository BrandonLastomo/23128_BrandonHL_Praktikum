/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.DosenKelompok.Latihan4.rumusBangun;

/**
 *
 * @author brand
 */
public class BangunRuang extends BangunDatar {
    
    // balok
    public double luasPermukaanBalok(double p, double l, double t){
        double luasPermukaan = 2*(luasPersegiPanjang(p, l)+(p*t)+(l*t));
        return luasPermukaan;
    }
    public double volumeBalok (double p, double l, double t){
        double volume = (luasPersegiPanjang(p, l)*t);
        return volume;
    }
    
    // prisma
    public double luasPermukaanPrismaSegitiga(double alasSegitiga, double tinggiSegitiga, 
                                            double sisiMiringSegitiga, double tinggiPrisma){
        double luasAlas = 2*luasSegitiga(alasSegitiga, tinggiSegitiga);
        double luasSelimut = luasPersegiPanjang(tinggiPrisma, alasSegitiga)
                            +luasPersegiPanjang(tinggiPrisma, tinggiSegitiga)
                            +luasPersegiPanjang(tinggiPrisma, sisiMiringSegitiga);
        double luasPermukaan = luasAlas + luasSelimut;
        return luasPermukaan;
    }
    
    public double volumePrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma){
        double luasAlas = luasSegitiga(alasSegitiga, tinggiSegitiga);
        double volume = luasAlas*tinggiPrisma;
        return volume;
    }
    
    // tabung
    public double luasPermukaanTabung(double r, double t){
        double luasPermukaan = kelilingLingkaran(r)*(r+t);
        return luasPermukaan;
    }
    public double volumeTabung(double r, double t){
        double luasPermukaan = luasLingkaran(r)*t;
        return luasPermukaan;
    }
    
    // kubus
    public double luasPermukaanKubus(double s){
        double luasPermukaan = luasPersegi(s)*6;
        return luasPermukaan;
    }
    public double volumeKubus(double s){
        double volume = luasPersegi(s)*s;
        return volume;
    }
}
