/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author enzol
 */
public class vuelo {
    private int num;
    private int h_salida;
    private int h_llegada;
    private Date fecha_salida;
    private String destino;

    public vuelo(int num, float price, int num_asientos,  int h_salida, int h_llegada, Date fecha_salida, String destino) {
        this.num = num;
        this.h_salida = h_salida;
        this.h_llegada = h_llegada;
        this.fecha_salida = fecha_salida;
        this.destino = destino;
    }
    
}
