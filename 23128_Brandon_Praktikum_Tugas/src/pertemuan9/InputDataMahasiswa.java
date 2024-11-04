/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;
import java.util.ArrayList;

/**
 *
 * @author brand
 */
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa;
    
    public InputDataMahasiswa(){
        listMahasiswa = new ArrayList();
    }
    
    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, double NilaiAkhir){
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, NilaiAkhir);
        listMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getAll(){
        return listMahasiswa;
    }
    
    public void deleteData(int index){
        listMahasiswa.remove(index);
    }
}
