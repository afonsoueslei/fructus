/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fructusDominio;

/**
 *
 * @author auf
 */
public enum EnumEstadoCivil {    
    CASADO("Casado(a)"),
    DIVORCIADO("Divorciado(a)"),
    VIUVO("Viúvo(a)"),
    SEPARADO("Separado(a)"),
    SOLTEIRO("Solteiro(a)"),
    UNIAO("União estável");
    
    private final String value;
    
    EnumEstadoCivil(String value) {
        this.value = value;
    }

     public String getValue() {
        return this.value;
    }
}