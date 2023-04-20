/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author jomev
 */
public class Factura {

    private ArrayList<Carro> listaCarro;
    private ArrayList<Caja> listaCaja;
   
    public Factura() {
        listaCarro=new ArrayList<>();
         listaCaja=new ArrayList<>();        
    }
   public void listarPlacas(){
       for( Carro c:listaCarro){
            System.out.println(c.getPlaca()); 
       }
   }
      public void generarFacturaPorPlaca(String placa){
       for( Carro c:listaCarro){
           if(c.getPlaca()==placa){
               //mostrar solo la factura
           }
            
       }
   }
    public void crearFactura(Carro carro, Caja caja){
       
        this.listaCaja.add(caja);
        this.listaCarro.add( carro);
       
    }
    public void  generarFacturas(){
         ArrayList<String>  factura =new ArrayList<>();
         
        for(int i=0; i<  listaCaja.size();i++){
          String  fac= "Factura\n";
        fac += "Fecha: " + this.listaCaja.get(i).getFecha()+ "\n";
        fac += "Venta de combustible:\n";
        fac += "  Galones: " + this.listaCaja.get(i).getVentaGalones() + "\n";
        fac += "  Precio por galón: " + this.listaCaja.get(i).getPrecioVenta() + "\n";
        fac += "  Total: " + this.listaCaja.get(i).getPrecioVenta() * this.listaCaja.get(i).getVentaGalones()+ "\n";
        fac += "Placa del carro: " + this.listaCarro.get(i).getPlaca() + "\n";
         fac +="--------------------";
         factura.add(fac);
        }
     
       for(String i:factura){
           System.out.println(i);
       }
    }
    public void generarFactura(String placa){
        
        for(int i=0;i<listaCarro.size();i++){
            System.out.println(placa+"-"+listaCarro.get(i).getPlaca());
            if(listaCarro.get(i).getPlaca().equals(placa)){
                System.out.println("factura: "+buscarFactura(i));
                return;
            }
        }
        
    }

    private String buscarFactura(int i) {
      String  fac= "Factura\n";
        fac += "Fecha: " + this.listaCaja.get(i).getFecha()+ "\n";
        fac += "Venta de combustible:\n";
        fac += "  Galones: " + this.listaCaja.get(i).getVentaGalones() + "\n";
        fac += "  Precio por galón: " + this.listaCaja.get(i).getPrecioVenta() + "\n";
        fac += "  Total: " + this.listaCaja.get(i).getPrecioVenta() * this.listaCaja.get(i).getVentaGalones()+ "\n";
        fac += "Placa del carro: " + this.listaCarro.get(i).getPlaca() + "\n";
         fac +="--------------------";
         return fac;
    }
 
   

 
    
}
