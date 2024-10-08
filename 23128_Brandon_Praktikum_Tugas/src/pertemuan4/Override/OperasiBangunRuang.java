/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4.Override;

/**
 *
 * @author brand
 */
public class OperasiBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RumusKubus operasiKubus = new RumusKubus(2.75);
        RumusBalok operasiBalok = new RumusBalok(2.75, 3.5, 1.9);
        
        System.out.println("===Kubus===");
        System.out.println("Volume Kubus dengan sisi sepanjang 2.75 cm adalah: "
                + operasiKubus.volume() + " cm");
        System.out.println("Luas Permukaan Kubus dengan sisi sepanjang 2.75 cm adalah: "
                + operasiKubus.luasPermukaan() + " cm");
        System.out.println("====================\n");
        
        System.out.println("===Balok===");
        System.out.println("Volume Balok dengan panjang sepanjang 2.75 cm, "
                + "lebar sepanjang 3.5 cm, "
                + "dan tinggi sepanjang 1.9cm adalah: "
                + operasiBalok.volume() + " cm");
        System.out.println("Luas Permukaan Balok dengan panjang sepanjang 2.75 cm, "
                + "lebar sepanjang 3.5 cm, "
                + "dan tinggi sepanjang 1.9cm adalah: "
                + operasiBalok.luasPermukaan() + " cm");
        System.out.println("====================");
    }
    
}
