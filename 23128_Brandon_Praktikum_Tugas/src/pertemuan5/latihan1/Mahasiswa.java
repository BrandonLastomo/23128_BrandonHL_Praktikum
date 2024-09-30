/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.latihan1;

/**
 *
 * @author brand
 */
public class Mahasiswa {
    String Nama, NPM;
    double NilaiAbsen, NilaiTugas, NilaiUTS, NilaiUAS, NilaiAkhir;
    char grade;
    String keterangan;
    
    double hitungNilaiAkhir(double NilaiAbsen, double NilaiTugas, double NilaiUTS, double NilaiUAS){
        return (NilaiAbsen*0.1)+(NilaiTugas*0.2)+(NilaiUTS*0.3)+(NilaiUAS*0.4);
    }
    
    char menentukanGrade(double nilaiAkhir){
        if(nilaiAkhir >= 76){
            return 'A';
        } else if(nilaiAkhir >= 66){
            return 'B';
        } else if(nilaiAkhir >= 56){
            return 'C';
        } else if(nilaiAkhir >= 46){
            return 'D';
        } else if(nilaiAkhir >= 0){
            return 'E';
        } else {
            return 0;
        }
    }
    
    String menentukanKeterangan(char grade){
        switch(grade){
            case 'A':
                return "Istimewa";
            case 'B':
                return "Baik";
            case 'C':
                return "Cukup";
            case 'D':
                return "Kurang";
            case 'E':
                return "Kurang Sekali";
            default:
                return "invalid";
        }
    }
    
    void printData(Mahasiswa data){
        System.out.println("NPM Mahasiswa: " + data.NPM);
        System.out.println("Nama Mahasiswa: " + data.Nama);
        System.out.println("Nilai Akhir: " + data.NilaiAkhir);
        System.out.println("Grade: " + data.grade);
        System.out.println("Keterangan: " + data.keterangan);
    }
}
