/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author donaf
 */
public class Bank {
    int saldo;
    
        public Bank (int saldo){
            this.saldo = saldo;
        }
        
        public void getSaldo(){
            System.out.println("Selamat Datang di Bank DNA");
            System.out.println("Saldo saat ini Rp. " + saldo);
        }
        public void SimpanUang(int simpan){
            saldo = simpan + saldo;
            System.out.println("Simpan Uang: Rp." + simpan);
            System.out.println("Saldo saat ini Rp. " + saldo);
        }
        public void AmbilUang(int ambil){
            saldo = saldo - ambil;
            System.out.println("Ambil Uang: Rp. " + ambil);
            System.out.println("Saldo saat ini Rp. " + saldo);
        }
        
        public int newSaldo(){
        return saldo;
        
    }   
}
