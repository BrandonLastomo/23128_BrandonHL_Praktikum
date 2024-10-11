/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan6.Latihan1;

/**
 *
 * @author brand
 */
public class PrimaNNonPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variabel penampung predikat
        String isPrima = null;
        // pemeriksaan terhadap bilangan dari 0 hingga 20
        for(int i = 0; i <= 20; i++){
            // memeriksa dengan membagi bilangan dengan angka-angka dari 0 hingga 20
            for(int j = 2; j <= 20; j++){
                // jika habis dibagi dengan pembagi, tetapi pembagi bukan bilangan itu sendiri, bilangan bukan prima
                if(i < 2 || i%j == 0 && i != j){
                    isPrima = "bukan prima";
                    j = 20;
                // jika habis dibagi, bilangan prima
                } else {
                    isPrima = "prima";
                }
            }
            // tampilkan predikat
            System.out.println(i + " termasuk bilangan " + isPrima);
        }
    }
    
}
