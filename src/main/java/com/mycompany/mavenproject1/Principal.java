/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jomev
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("con cuanto va a iniiar el día?: ");
        var entrada=sc.nextInt();            
          Caja cajaGeneral=new Caja(entrada);
          Factura f=new Factura();
          
        LocalDate fecha= LocalDate.now();
         int opt=0;
        do{
        System.out.println("Que desea realizar?");
        System.out.println("1. Tanquear un vehículo");
        System.out.println("2. Consultar cuanto tengo en caja");
        System.out.println("3. Generar una factura con placa");
        System.out.println("4. Listar todas las ventas");
        System.out.println("5. Cuantos galones he vendido");
        System.out.println("6. Listar las placas y venta en galones");
        System.out.println("7. Listar las placas ");
        System.out.println("0. para salir\n");
        opt=sc.nextInt();
        switch (opt) {
            case 1:      
               
                Carro car=new Carro();                 
                Caja caja=new Caja();
               
                  System.out.println("La placa para generar la factura: ");
                     car.setPlaca(sc.next());
                     System.out.println("Cuantos galones va a vender?: ");  
                     caja.venta(sc.nextInt());
                     caja.setFecha(fecha);  
                     
                       f.crearFactura(car, caja);
                    
                break;
                case 2:
                      
                 System.out.println("usted tiene en caja : " + cajaGeneral.consultaDineroEncaja());
                break;
                case 3:
               System.out.println("Digíte la placa: " );
               f.generarFactura(sc.next());
                break;
                case 4:
                    f.generarFacturas();
                break;
                case 5:
                
                break;
                case 6:
                f.listarPlacas();
                break;
                
            default:
                System.out.println("Valor no valido");
        }
        }while(opt!=0);
                 
         
        
       
       
       
        
        
      
        
       
       
       
       
        
        
    }
}
