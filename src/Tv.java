/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mikim
 */
public class Tv {

     String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    public void encender() {
        System.out.println("La TV se está encendiendo...");
    }

    public void apagar() {
        System.out.println("La TV se está apagando...");
    }

    public void subirVolumen() {
        System.out.println("Subiendo el volumen...");
        volumen++;
    }

    public void bajarVolumen() {
        System.out.println("Bajando el volumen...");
        volumen--;
    }
}
        


