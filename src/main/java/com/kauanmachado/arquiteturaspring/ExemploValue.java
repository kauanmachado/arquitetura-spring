package com.kauanmachado.arquiteturaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

    @Value("${app.config.variavel}")
    private String var;

    public void imprimirVariavel(){
        System.out.println(var);
    }
}
