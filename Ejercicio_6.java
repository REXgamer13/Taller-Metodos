/*Ejercicio 6: Pasar de segundos a días, horas y minutos. 
Escribe un metodo que reciba los segundos y el tipo, y le retorne el número de días o horas o minutos */

import java.util.Scanner;

public class Ejercicio_6 {

    // metodo

    public void convercion(int segundos,byte caso){
        

        switch (caso) {
            case 1:
            int dias=segundos/86400;
            System.out.println(segundos+ " segundos en dias son: "+ dias);
                
                break;

            case 2:
            int horas=segundos/3600;
            System.out.println(segundos+ " segundos en horas son: "+ horas);

                break;

            case 3:
            int min=segundos/60;
            System.out.println(segundos+ " segundos en minutos son: "+ min);

                break;
        
            default:
            System.out.println("Digite un caso valido entre '1' , '2' o '3' ");
                break;
        }
        
    }
       

        public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        Ejercicio_6 proceso=new Ejercicio_6();
        System.out.println("*************************************************************************************************************************************************************");
        System.out.println("Ejercicio 6: Pasar de segundos a días, horas y minutos. Escribe un metodo que reciba los segundos y el tipo, y le retorne el número de días o horas o minutos");
        System.out.println("*************************************************************************************************************************************************************");
        System.out.print("Digite la cantidad de segundos:");
        int segundos=teclado.nextInt();
        System.out.println("");

        System.out.println("digite '1' para la convercion a dias.");
        System.out.println("");
        System.out.println("dgite '2' para la convercion a horas.");
        System.out.println("");
        System.out.println("digite '3' para la convercion a minutos.");
        System.out.println("");
        System.out.print("caso: ");
        byte caso=teclado.nextByte();
        
        proceso.convercion(segundos,caso);

        teclado.close();
}



    
}
