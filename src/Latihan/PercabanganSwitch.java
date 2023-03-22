/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author RIFGI
 */
public class PercabanganSwitch {
    public static void main(String[] args) {
        //nilai x diganti sesuai case
        switch(1){
            case 1: System.out.println("Senin"); break;
            case 2: System.out.println("Selasa"); break;
            case 3: System.out.println("Rabu"); break;
            case 4: System.out.println("Kamis"); break;
            case 5: System.out.println("Jumat"); break;
            case 6: System.out.println("Sabtu"); break;
            case 7: System.out.println("Minggu"); break;
            default: System.out.println("Salah input hari");
            break;
        }
    }
}
