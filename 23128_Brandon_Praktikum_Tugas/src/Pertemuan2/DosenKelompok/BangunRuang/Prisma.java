/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author RAKA
 */
class Prisma {
    double alas;
    double tinggiAlas;
    double tinggiPrisma;
    double sisiMiring;

    Prisma(double alas, double tinggiAlas, double sisiMiring, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.sisiMiring = sisiMiring;
        this.tinggiPrisma = tinggiPrisma;
    }

    double hitungVolume() {
        double luasAlas = 0.5 * alas * tinggiAlas;
        return luasAlas * tinggiPrisma;
    }

    double hitungLuasPermukaan() {
        double kelilingAlas = alas + tinggiAlas + sisiMiring;
        double luasAlas = 0.5 * alas * tinggiAlas;
        return 2 * luasAlas + kelilingAlas * tinggiPrisma;
    }
}