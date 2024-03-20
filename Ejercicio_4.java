/* Ejercicio 4: Cálculo de perímetro de circunferencia, área del círculo, y volumen de la esfera. 
Suponiendo que pi = 3.1416. Escribe un metodo que reciba el radio y el tipo de calculo, 
y retorne el cálculo del perímetro de la circunferencia (2*pi*r) 
o el área del círculo (pi*r2 ) 
o el volumen de la esfera (V = 4*pi*r3 /3).*/


import java.util.Scanner;

public class Ejercicio_4 {

    //metodos

    public double perimetro(double radio){

        double perimetro =2*3.1416*radio;
        return perimetro;
    }

    public double area(double radio){

        double area=(3.1416)*Math.pow(radio, 2);
        return area;
    }

    public double volumen(double radio){

        double volumen=(((4*3.1416)*Math.pow(radio,3))/3);
        return volumen;
    }

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Ejercicio_4 proceso=new Ejercicio_4();

        System.out.println("");
        System.out.println("Ejercicio 4: Cálculo de perímetro de circunferencia, área del círculo, y volumen de la esfera. Suponiendo que pi = 3.1416. Escribe un metodo que reciba el radio y el tipo de calculo, y retorne el cálculo del perímetro de la circunferencia (2*pi*r) o el área del círculo (pi*r2 ) o el volumen de la esfera (V = 4*pi*r3 /3).");
        System.out.println("");
        System.out.println("introdusca el numero '1' para calcular el perímetro de la circunferencia ");
        System.out.println("");
        System.out.println("introdusca el numero '2' para calcular el área del círculo");
        System.out.println("");
        System.out.println("introdusca el numero '3' para calcualr el volumen de la esfera");
        System.out.println("");
        byte caso=teclado.nextByte();
        System.out.print("Introdusca el valor del radio: ");
        double radio=teclado.nextDouble();

        switch (caso) {

            case 1:
            System.out.println("El perimetro del circulo es: "+proceso.perimetro(radio));
                break;
            case 2:
            System.out.println("El area del circulo es: "+proceso.area(radio));
                    break;
            case 3:
            System.out.println("El volumen del circulo es: "+proceso.volumen(radio));
                    break;

            default:
            System.out.println("Introdusca un numero correcto entre '1' , '2' o '3' ");
                break;
        }

        teclado.close();
    }

}
