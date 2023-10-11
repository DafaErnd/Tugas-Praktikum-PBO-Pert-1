/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demonilai;

/**
 *
 * @author dafae
 */
public class Nilai {
     public String nim;
     public String nama;
     public double nilai_absen;
     public double nilai_tugas;
     public double nilai_uts;
     public double nilai_uas;
     
    
    public Nilai(String nim, String nama, double nilai_absen, double nilai_tugas, double nilai_uts, double nilai_uas){
    this.nim = nim;
    this.nama = nama;
    this.nilai_absen = nilai_absen;
    this.nilai_tugas = nilai_tugas;
    this.nilai_uts = nilai_uts;
    this.nilai_uas = nilai_uas;
        
        
    }
    void CetakNilai(){
        double nilai_akhir =  (nilai_absen * 0.10) + (nilai_tugas * 0.20) + (nilai_uts * 0.30) + (nilai_uas * 0.40);
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen: " + nilai_absen);
        System.out.println("Nilai Tugas: " + nilai_tugas);
        System.out.println("Nilai UTS: " + nilai_uts);
        System.out.println("Nilai UAS: " + nilai_uas);
        System.out.println("Nilai Akhir: " + nilai_akhir);
        
    }
}
