/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;
import java.io.IOException;

/**
 *
 * @author RIFGI
 */
public class SwitchName {
    public static void main (String args[]) {
        char firstInitial  = 'a';
        System.out.println("Masukkan huruf awal nama Anda:");
        try {
            firstInitial = (char)System.in.read();
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        }
        
        switch (firstInitial) {
            case 'a':
                System.out.println("Nama Anda pasti Asep!");
            break;
            case 'b':
                System.out.println("Nama Anda pasti Brodin!");
            break;
            case 'c':
                System.out.println("Nama Anda pasti Cecep!");
            break;
            default:
                System.out.println("Nama Anda tidak terkenal!");
            break;
        }
    }
}
