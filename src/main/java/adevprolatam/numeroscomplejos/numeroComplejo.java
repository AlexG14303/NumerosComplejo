/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.numeroscomplejos;

/**
 *
 * @author dell
 */
public class numeroComplejo {
       private int r;
       private int img;
       
    public void cargar(String numero) {
       
      String[] partes = numero.split("(?=[-+])|i");

       if (partes.length == 2 || partes.length == 3) {
            
        this.r = Integer.parseInt(partes[0].trim());
       
            if ("-".equals(partes[1]) && partes.length > 2) {
                this.img = -1 * Integer.parseInt(partes[2].trim());
            }else {
                    this.img = Integer.parseInt(partes[1].trim());
            }}
            else 
            {
            throw new IllegalArgumentException("Numero ingresado no es el correcto");
       }
    }

    public String suma(numeroComplejo numero) {
        int sumaReal = this.r + numero.r;
        int sumaImaginaria = this.img + numero.img;
        if(sumaImaginaria >= 0){
                return sumaReal + "+" + sumaImaginaria + "i";
        }else{
                return sumaReal + "" + sumaImaginaria + "i";
        }
    }
       
    public String mostrar(){
        
        if(img >= 0){
                return r+" + "+ img + "i";
        }else{
                 return r+""+ img + "i";
        }
    }
}   
