/* Ejercicio 2: Cálculo de área y perímetro. Escribe un metodo que reciba los dos lados de un rectángulo 
y el tipo de calculo y retorne el cálculo del perímetro (suma de los lados) o el área (base por altura).*/

import java.util.Scanner;


public class Ejercicio_2 {

//metododos

public int perimetro(int base, int altura){

    int perimetro=2*(base )+ 2*(altura);
    
    return perimetro;
}

public int area(int base, int altura){

    int area=base*altura;

    return area;
}

public static void main(String[] args) {

Scanner teclado=new Scanner(System.in);

    System.out.println("Ejercicio 2: Cálculo de área y perímetro. Escribe un metodo que reciba los dos lados de un rectángulo \r\n" + //
                "y el tipo de calculo y retorne el cálculo del perímetro (suma de los lados) o el área (base por altura).");
    System.out.println("");
    System.out.println("******************************************************");
    System.out.println("Seleccione el caso 1 para dar un ejemplo ramdom. ");
    System.out.println("");
    System.out.println("Seleccione 2 para introduccir los valores del ejemplo.");
    System.out.println("******************************************************");
    System.out.println("");
    byte caso=teclado.nextByte();

    
    Ejercicio_2 proceso =new Ejercicio_2();
    
    switch (caso) {
        
        case 1:
        
    int base= (int) (Math.random()*100);
    int altura= (int) (Math.random()*100);
    System.out.println("El perimetro del rectangulo es: "+proceso.perimetro(base, altura));
    System.out.println("El area del rectangulo es: "+proceso.area(base, altura));
        
        break;

    case 2:

    System.out.print("Digite la base: ");
    base = teclado.nextInt();
    System.out.print("Digite la altura: ");
    altura = teclado.nextInt();
    System.out.println("");
    System.out.println("El area del rectangulo es: "+ proceso.area(base, altura));
    System.out.println("El perimetro del rectangulo es: "+ proceso.perimetro(base, altura));
    
        break;

    default:
    System.out.println("Digite un numero valido entre 1 y 2. ");
        break;
}

teclado.close();

}




    
}
