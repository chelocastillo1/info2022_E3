package com.example.demo.controller;
import java.math.BigDecimal;

public class Producto {

    private String pDescripcion;
    private BigDecimal pPrecioU;
    private char pTalle;

    public Producto(String strDescripcion, BigDecimal dPrecioUnitario, char cTalle){
        this.pDescripcion = strDescripcion;
        this.pPrecioU = dPrecioUnitario;
        this.pTalle = cTalle;
    }

    public String getDescripcion(){
        return this.pDescripcion;
    }

    public BigDecimal getPrecioUnitario(){
        return this.pPrecioU;
    }

    public char getTalle(){
        return this.pTalle;
    }
}
