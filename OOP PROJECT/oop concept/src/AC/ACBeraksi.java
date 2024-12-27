/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author donaf
 */
public class ACBeraksi {
    public static void main(String[] args) {
        
        AC ACKamar = new AC();
                
        System.out.println("Status AC Saat ini: Mati");
        
        ACKamar.hidupkan();
        ACKamar.matikan();
        ACKamar.matikan();
        ACKamar.hidupkan();
        ACKamar.hidupkan();
                
        System.out.println("Status AC Saat ini: Dingin");
        
        ACKamar.dinginkan();
        ACKamar.panaskan();
        ACKamar.panaskan();
        ACKamar.dinginkan();
        ACKamar.dinginkan(); 
    }
}
