/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeServicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ServicioOperacion {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número 1");
        int numero1= leer.nextInt();
        System.out.println("ingrese el número 2");
        int numero2= leer.nextInt();
        
        Operacion nuevaOperacion=new Operacion(numero1, numero2);
        
        return nuevaOperacion;
    }
    public int sumar(Operacion objeto){
        int resultado=0;
        resultado=objeto.getNumero1() + objeto.getNumero2();

        return resultado;
    }
    public int  restar(Operacion objeto){
        int resultado=0;
        resultado= objeto.getNumero1() - objeto.getNumero2();
        return resultado;
    }
    public int multiplicar(Operacion objeto){
        int resultado=0;
        if(objeto.getNumero1()==0|| objeto.getNumero2()==0 ){
            System.out.println("Error el resultado de la multiplicación es  ");
        }else{
        resultado= objeto.getNumero1()* objeto.getNumero2();
        }
        
        return resultado;
    }
    public int dividir(Operacion objeto){
        int resultado=0;
        if( objeto.getNumero2()==0 ){
            System.out.println("Error no es posible dividir por CERO");
        }else{
        resultado= objeto.getNumero1() / objeto.getNumero2();
        
        }       
        return resultado;
    }
}

