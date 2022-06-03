package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.controller.Producto;

@Repository
public class ProductoRepository{

    public List<Producto> buscarTodos(){
        return List.of(
            new Producto("descripcion", BigDecimal.valueOf(100.5), 'M'),
            new Producto("descripcion", BigDecimal.valueOf(100.5), 'L'),
            new Producto("descripcion", BigDecimal.valueOf(100.5), 'S')
        );
    }
}
