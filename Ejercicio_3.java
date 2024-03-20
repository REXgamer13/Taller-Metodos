/*Ejercicio 3: Cambio de dólares a euros. Suponiendo que 1 euro = 1.33250 dólares. 
Escribe un metodo que reciba un número de dólares y retorne el calculo del cambio en euros */

import java.util.Scanner;

public class Ejercicio_3 {

    //metodos
    public double convercion(double dolares){

    double euros=dolares/1.33250;

    return euros;

    }
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        Ejercicio_3 proceso=new Ejercicio_3();

        System.out.println("Ejercicio 3: Cambio de dólares a euros. Suponiendo que 1 euro = 1.33250 dólares. \r\n" + //
                        "Escribe un metodo que reciba un número de dólares y retorne el calculo del cambio en euros */\r\n" + //
                        "");
       
        System.out.println("************************************************************************");
        
        System.out.println("Digite el numero 1 para hacer el caso de prueba con numeros ramdom.");
        System.out.println("");
        
        System.out.println("Digite 2 para hacer el caso de prueba ingresando manualmente los datos.");
        System.out.println("");
        System.out.println("************************************************************************");
        
        int caso =teclado.nextInt();


        
        switch (caso) {
            case 1:
            double dolares=(float)(Math.random()*1000);
            
            System.out.println(dolares+ " Dolares En Euros es: "+ proceso.convercion(dolares));
                
                break;

            case 2:
            System.out.println("Digite la cantidad de dolares que desea convertir a Euros: ");
            dolares = teclado.nextDouble();
            System.out.println("");
            System.out.println(dolares+" Dolares En euros es: "+proceso.convercion(dolares));

                break;
        
            default:
            System.out.println("Digite un numero valido entre 1 y 2. ");
                break;
        }




        teclado.close();
        
    }


    
}
