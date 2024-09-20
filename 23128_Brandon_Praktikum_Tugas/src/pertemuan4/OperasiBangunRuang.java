/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author brand
 */
public class OperasiBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RumusBangunRuang rumus = new RumusBangunRuang();
        double s = 2.5;
        double p = 3.75;
        double l = 8.52;
        double t = 9.11;
        
        // kubus
        System.out.println("=====Luas Permukaan dan Volume Kubus=====");
        // luas permukaan
        System.out.println("Luas permukaan dari kubus dengan sisi " + s + "cm adalah: " + rumus.luas(s) + " cm");
        // volume
        System.out.println("Volume dari kubus dengan sisi " + s + "cm adalah: " + rumus.volume(s) + " cm");
        System.out.println("==============================");
        
        // balok
        System.out.println("\n=====Luas Permukaan dan Volume Balok=====");
        // luas permukaan
        System.out.println("Luas permukaan dari balok dengan panjang " + p + " cm, lebar " + l + "cm, tinggi " + t + " cm " + "adalah: " + rumus.luas(p, l, t) + " cm");
        // volume
        System.out.println("Volume dari balok dengan panjang " + p + " cm, lebar " + l + "cm, tinggi " + t + " cm " + "adalah: " + rumus.volume(p, l, t) + " cm");
        System.out.println("==============================");
    }
    
}
