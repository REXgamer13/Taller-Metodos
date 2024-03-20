/*Ejercicio 1: Cálculo de precios con descuento Escribe un metodo que reciba el precio de un producto y el 
tanto por ciento de descuento, y te diga el precio con descuento. Por ejemplo, si el precio es 300 y el 
descuento 20, el metodo retorna que el precio final con descuento es de 240. */

import java.util.Scanner;

public class Ejercicio_1 {

public int ejercicio1(int precio, int descuento){
    int precioFinal = precio - (precio * descuento / 100);
    return precioFinal;
}

public static void main(String[] args){

    Ejercicio_1 proceso=new Ejercicio_1();
    Scanner teclado = new Scanner(System.in);


    System.out.println("Introduce el precio del producto: ");
    int precio = teclado.nextInt();

    System.out.println("Introduce el descuento: ");
    int descuento = teclado.nextInt();


System.out.println("El precio final con descuento es de: " + proceso.ejercicio1(precio, descuento));


teclado.close();

}
    
}

