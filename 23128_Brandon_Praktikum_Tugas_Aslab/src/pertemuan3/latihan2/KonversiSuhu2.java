/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3.latihan2;

/**
 *
 * @author brand
 */
// melakukan pewarisan method dari class KonversiSuhu ke KonversiSuhu2 menggunakan extends
public class KonversiSuhu2 extends KonversiSuhu{
    protected void fahrenheitToReamur(double suhu){
        System.out.println("Nilai Reamur dari " + suhu + " F" + " adalah " + (suhu-32)*4/9);
    }
}
