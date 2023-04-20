package com.mycompany.mavenproject1;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jomev
 */
public class Caja extends Bomba{
    private int dineroEnCaja;
    private int ventaGalones;
    private LocalDate fecha;
    public int getVentaGalones() {
        return ventaGalones;
    }

    
    public Caja(int dineroEnCaja){
        this.dineroEnCaja=dineroEnCaja;
    }

    public Caja() {
    }
    public void venta(int galones){
        this.ventaGalones=galones;
        this.dineroEnCaja+=ventaGalones*getPrecioVenta();
    }
    public int consultaDineroEncaja(){
        return dineroEnCaja;
    }
     public LocalDate getFecha() {
        return fecha;
    }
     public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
          
    
}
