/*Ejercicio 5: Pasar de días, horas y minutos a segundos. 
Escribe un metodo que reciba los siguientes datos: días, horas y minutos. 
Y retorne con la cantidad de segundos totales que son esos datos. */

import java.util.Scanner;
public class Ejercicio_5 {
    //metodos

    public int segundos(int dias, int horas, int min ){

        int segundos=(dias*86400)+(horas*3600)+(min*60);
        return segundos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ejercicio_5 proceso=new Ejercicio_5();

        System.out.println("");
        System.out.println("Ejercicio 5: Pasar de días, horas y minutos a segundos. \r\n" + //
                        "Escribe un metodo que reciba los siguientes datos: días, horas y minutos. \r\n" + //
                        "Y retorne con la cantidad de segundos totales que son esos datos. ");

        System.out.println("");
        System.out.println("digite '1' para generar el caso con datos ramdom.");
        System.out.println("");
        System.out.println("digite '2' para generar el caso con el ingreso de variables.");
        System.out.println("");
        byte caso=teclado.nextByte();
        switch (caso) {
            case 1:

            int dias=(int) (Math.random()*10);
            int horas=(int)(Math.random()*100);
            int min=(int)(Math.random()*100);
            System.out.println(dias+" dias,"+horas+" horas,"+ min+" min, en segundos es: "+proceso.segundos(dias, horas, min)+" segundos");

                
                break;

            case 2:

            System.out.print("Digite la cantidad de dias: ");
            dias=teclado.nextInt();
            System.out.print("Digite la cantidad de horas: ");
            horas=teclado.nextInt();
            System.out.print("Digite la cantidad de minutos: ");
            min=teclado.nextInt();
            System.out.println("");
            System.out.println(dias +" dias ,"+horas+" horas, "+min+" minutos, en segundos es: "+proceso.segundos(dias, horas, min) +" segundos");

                break;
        
            default:
            System.out.println("Digite un caso valido ( numero) entre '1' o '2' ");
                break;
        }



        teclado.close();
    }
    
}
