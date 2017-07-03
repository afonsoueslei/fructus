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
public enum EnumNacionalidade {
    BRASILEIRA("Brasileira"),
    NATURALIZADO("Naturalizado"),
    ESTRAGEIRA("Estrangeira");
    
    private final String value;
    
    EnumNacionalidade(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
