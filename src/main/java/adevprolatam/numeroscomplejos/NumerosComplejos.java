/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adevprolatam.numeroscomplejos;

/**
 *
 * @author dell
 */
public class NumerosComplejos {

    public static void main(String[] args) {
       numeroComplejo num1 = new numeroComplejo();
       numeroComplejo num2 = new numeroComplejo();

       num1.cargar("7+5i");
       num2.cargar("-8+5i");
       
       System.out.println(       "Primer Numero: " + num1.mostrar());
       System.out.println(       "Segundo Numero: " + num2.mostrar());

       
       String resultadoSuma = num1.suma(num2);
       System.out.println("Resultado de la operacion: " + resultadoSuma);
       
    }
}
