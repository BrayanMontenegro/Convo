/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;

/**
 *
 * @author UNANCH16
 */
public class Revista {
      
    int numero;
    String  titulo;
    int ayo;
    String issn;
    float precio;
    java.sql.Time horaventas;
    
    public Revista(int numero, String titulo, int ayo, String issn, float precio, Time horaventas) {
        this.numero = numero;
        this.titulo = titulo;
        this.ayo = ayo;
        this.issn = issn;
        this.precio = precio;
        this.horaventas = horaventas;
    }

    public Revista(String titulo, int ayo, String issn, float precio, Time horaventas) {
        this.titulo = titulo;
        this.ayo = ayo;
        this.issn = issn;
        this.precio = precio;
        this.horaventas = horaventas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAyo() {
        return ayo;
    }

    public void setAyo(int ayo) {
        this.ayo = ayo;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Time getHoraventas() {
        return horaventas;
    }

    public void setHoraventas(Time horaventas) {
        this.horaventas = horaventas;
    }
    
}
