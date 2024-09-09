/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2.Latihan2;

/**
 *
 * @author brand
 */
public class Matematika implements Operator {
    public void pertambahan(int a, int b){
        System.out.println("Pertambahan: " + a + " + " + b + " = " + (a+b));
    }
    public void pengurangan(int a, int b){
        System.out.println("Pengurangan: " + a + " - " + b + " = " + (a-b));
    }
    public void perkalian(int a, int b){
        System.out.println("Perkalian: " + a + " * " + b + " = " + (a*b));
    }
    public void pembagian(int a, int b){
        System.out.println("Pembagian: " + a + " / " + b + " = " + (a/b));
    }
}
