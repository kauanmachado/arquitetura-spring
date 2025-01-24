package com.kauanmachado.arquiteturaspring.todos;

import com.kauanmachado.arquiteturaspring.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    public BeanGerenciado(TodoValidator validator) {
//        this.validator = validator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator){
//        this.validator = validator;
    }
}
