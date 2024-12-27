/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author donaf
 */
public class MatematikaBeraksi {
  public static void main(String[] agrs){
        MatematikaCanggih mc = new MatematikaCanggih();
        mc.pertambahan(34,13);
        mc.pertambahan(3.4,1.3);
        mc.pertambahan(34,13,22);
        mc.pertambahan(3.4,1.3,2.2);
        
        mc.pengurangan(12, 3);
        mc.pengurangan(1.2, 3.0);
        mc.pengurangan(12, 3, 6);
        mc.pengurangan(1.2, 3.0, 6.0);
        mc.perkalian(34, 45);
        mc.perkalian(3.4, 4.5);
        mc.perkalian(34, 45, 32);
        mc.perkalian(3.4, 4.5, 3.2);
        
        mc.pembagian(67, 34);
        mc.pembagian(6.7, 3.4);
        mc.pembagian(67, 34, 44);
        mc.pembagian(6.7, 3.4, 4.4);
        
        mc.modulus(10, 3);
        mc.modulus(2.1, 1.0);
        mc.modulus(2, 10, 14);
        mc.modulus(2.1, 1.0, 1.4);    
    }
}
