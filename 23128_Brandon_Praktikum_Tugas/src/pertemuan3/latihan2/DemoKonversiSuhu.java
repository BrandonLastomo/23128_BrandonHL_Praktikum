/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3.latihan2;

/**
 *
 * @author brand
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek dari class KonversiSuhu2
        KonversiSuhu2 kalkulatorSuhu = new KonversiSuhu2();
        
        // memanggil method
        kalkulatorSuhu.celciusToFahrenheit(100);
        kalkulatorSuhu.celciusToReamur(100);
        kalkulatorSuhu.fahrenheitToReamur(100);
    }
    
}
