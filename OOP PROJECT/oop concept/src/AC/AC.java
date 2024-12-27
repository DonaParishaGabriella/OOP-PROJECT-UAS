/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author donaf
 */
public class AC implements InterfaceBeraksi {
    int statusAC;
    
    public void hidupkan(){
    if (statusAC == KEADAAN_MATI){
        statusAC = KEADAAN_HIDUP;
        System.out.println("Hidupkan AC! --> AC Hidup");    
    }else{
        System.out.println("Hidupkan AC! --> AC Sudah Hidup Kok");
    }
    }
    
    public void matikan(){
    if(statusAC == KEADAAN_HIDUP){
        statusAC = KEADAAN_MATI;
        System.out.println("Matikan AC! --> AC Mati");
    }else{
        System.out.println("Matikan AC! --> AC Sudah Mati Kok");
    }
    }
    
    public void dinginkan(){
    if (statusAC == KEADAAN_PANAS){
        statusAC = KEADAAN_DINGIN;
        System.out.println("dinginkan AC! --> AC dingin");    
    }else{
        System.out.println("dinginkan AC! --> AC Sudah dingin Kok");
    }
    }
    
    public void panaskan(){
    if(statusAC == KEADAAN_DINGIN){
        statusAC = KEADAAN_PANAS;
        System.out.println("panaskan AC! --> AC panas");
    }else{
        System.out.println("panaskan AC! --> AC Sudah panas Kok");
    }
    }
}
    
    
