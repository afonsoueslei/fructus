package br.com.fructusDominio;

/**
 * Created by user1 on 09/10/2016.
 */
public enum EnumSexo {
    MASCULINO("masculino"),
    FEMININO("feminino");

    private final String value;
    
    EnumSexo(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
