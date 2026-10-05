/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mikim
 */
public class Prueba {
    public static void main(String[] args) {

        Tv tv1 = new Tv();
        tv1.marca = "Samsung";
        tv1.pulgadas = 32;
        tv1.volumen = 20;
        tv1.encendido = true;

        System.out.println("==== TV 1 ====");
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen: " + tv1.volumen);

        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
        
      System.out.println("------------------------------------------------------------------");

        Tv tv2 = new Tv();
        tv2.marca = "LG";
        tv2.pulgadas = 65;
        tv2.volumen = 45;
        tv2.encendido = false;

        System.out.println("==== TV 2 ====");
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen: " + tv2.volumen);

        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
      System.out.println("------------------------------------------------------------------");

        Tv tv3 = new Tv();
        tv3.marca = "Sony";
        tv3.pulgadas = 50;
        tv3.volumen = 33;
        tv3.encendido = true;

        System.out.println("==== TV 3 ====");
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen: " + tv3.volumen);

        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
        
    }
}
