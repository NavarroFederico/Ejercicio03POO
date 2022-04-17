/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseDePrueba;
import ClasesDeServicios.ServicioOperacion;
import Entidades.Operacion;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        ServicioOperacion servOp = new ServicioOperacion();
        Operacion op1 = servOp.crearOperacion();
        int opcion ;
        
        do {
            System.out.println("Ingrese el numero de la operación deseada ");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            
            opcion= leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es "+ servOp.sumar(op1));
                    break;
                case 2:
                    System.out.println(servOp.restar(op1));
                    
                    break;
                case 3:
                    System.out.println(servOp.multiplicar(op1));
                    
                    break;
                case 4:
                    System.out.println(servOp.dividir(op1));
                    
                    break;
                case 5 :
                    System.out.println("Gracias por usar nuestra App");
                default:
            }
        } while (opcion!=5);
        System.out.println("Fin del Programa");
    }
    
}
