/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6.Latihan1;

/**
 *
 * @author brand
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pemeriksaan terhadap bilangan dari 0 hingga 20
        for(int i = 0; i <= 20; i++){
            // jika habis dibagi 2, bilangan adalah genap
            if(i%2 == 0){
                System.out.println(i + " adalah genap");
            // Selain itu, bilangan adalah ganjil
            } else {
                System.out.println(i + " adalah ganjil");
            }
        }
    }
    
}
