package com.kauanmachado.arquiteturaspring;

import com.kauanmachado.arquiteturaspring.todos.TodoEntity;
import com.kauanmachado.arquiteturaspring.todos.TodoRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws Exception{
        DriverManagerDataSource dataSource =  new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

//        TodoRepository repository = new SimpleJpaRepository<TodoEntity, Integer>(null, null);

    }
}
