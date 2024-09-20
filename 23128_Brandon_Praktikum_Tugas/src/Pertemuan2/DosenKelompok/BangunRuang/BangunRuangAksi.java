/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author RAKA
 */
public class BangunRuangAksi {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 3, 2);
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());

        Prisma prisma = new Prisma(3, 4, 5, 10);
        System.out.println("Volume Prisma: " + prisma.hitungVolume());
        System.out.println("Luas Permukaan Prisma: " + prisma.hitungLuasPermukaan());

        Tabung tabung = new Tabung(7, 10);
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());

        Kubus kubus = new Kubus(4);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}