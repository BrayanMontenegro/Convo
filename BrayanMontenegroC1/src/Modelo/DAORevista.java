/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.*;

/**
 *
 * @author UNANCH16
 */
public class DAORevista {
    public Revista Insertan(String titulo, int ayo, String issn, float precio, java.sql.Time horaventas){
        String transaccion = "INSERT INTO Revista VAULES("
                +titulo+ "', '"
                +ayo+"', '"
                +issn+"', '"
                +precio+"', '"
                +horaventas+"' )'";
        if (new DateBase().Actualizar(transaccion) > 0) {
            return new Revista(titulo, ayo, issn, precio, horaventas);
        }
        return null;
    }
    public int Actualizar(int numero, String titulo, int ayo, String issn, float precio,
            java.sql.Time horaventas) {
         String transaccion = "UPDATE Revista SET titulo='"
                + titulo + "', ayo='"
                + ayo +"', issn='"
                + issn +"', precio='"
                + precio +"', horaventas='"
                + horaventas +"' WHERE numero="
                + numero;
                
                return new DateBase().Actualizar(transaccion);
    }
    public List ObtenerDatos() {
        String transaccion = "SELECT * FROM Revista";
        
        List<Map> registros =new DateBase().Listar(transaccion);
        List<Revista> revistas = new ArrayList();
        
        for (Map registro : registros) {
            Revista re = new Revista(
            (int) registro.get("numero"),
            (String) registro.get("titulo"),
            (int) registro.get("ayo"),
            (String) registro.get("issn"),
            (Float.parseFloat( registro.get("precio").toString())),
            (java.sql.Time.valueOf( registro.get("horaventas").toString())));
            revistas.add(re);
        }
      return revistas;
    }
    public int Eliminar(int numero) {
     String transaccion = "DELETE FROM Revista WHERE numero='"+numero+ "'";
     
     return new DateBase().Actualizar(transaccion);
    }
    
    
}
