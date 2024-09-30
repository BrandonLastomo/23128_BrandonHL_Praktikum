/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.latihan1;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class PendataanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa data = new Mahasiswa();
        
        System.out.print("NPM: ");
        data.NPM = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        data.Nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        data.NilaiAbsen = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        data.NilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        data.NilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        data.NilaiUAS = input.nextDouble();
        
        data.NilaiAkhir = data.hitungNilaiAkhir(data.NilaiAbsen, data.NilaiTugas, data.NilaiUTS, data.NilaiUAS);
        System.out.println("\nData " + data.Nama + "\n===============");
        data.grade = data.menentukanGrade(data.NilaiAkhir);
        data.keterangan = data.menentukanKeterangan(data.grade);
        data.printData(data);
    }
    
}
