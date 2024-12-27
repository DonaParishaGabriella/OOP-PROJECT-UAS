/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author donaf
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilDudu = new Mobil();
        
        mobilDudu.warna = "Biru";
        mobilDudu.tahunProduksi = 1960;
        
        System.out.println("Warna: " + mobilDudu.warna);
        System.out.println("Tahun Produksi: " + mobilDudu.tahunProduksi);             
    }
  
}
