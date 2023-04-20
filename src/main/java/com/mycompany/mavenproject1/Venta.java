/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author jomev
 */
public class Venta {
    private Carro carro;
    private Caja caja;

    public Venta(Carro carro, Caja caja) {
        this.carro = carro;
        this.caja = caja;
    }

    public Carro getCarro() {
        return carro;
    }

    public Caja getCaja() {
        return caja;
    }
}
