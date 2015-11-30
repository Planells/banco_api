/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion.core;

/**
 *
 * @author German
 */
public class BusinessMessage {
    
    private String campo,texto;

    public BusinessMessage() {
    }

    public BusinessMessage(String campo, String texto) {
        this.campo = campo;
        this.texto = texto;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
