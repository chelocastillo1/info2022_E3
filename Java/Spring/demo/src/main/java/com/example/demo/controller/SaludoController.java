package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;
import com.example.demo.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController{

    @Autowired
    private ProductoRepository pRepoProducto;

    public SaludoController(){
        //this.pRepoProducto = new ProductoRepository();
    }

    @RequestMapping(value = "/html", method = RequestMethod.GET)
    public String html(){
        return "<html><head><title>Spring Boot App</title></head><body><b>Spring Boot App</b></body></html>";
    }

    @GetMapping("/html")
	public String htm(@RequestParam(name="p1", required=false, defaultValue="parametro1") String p1) {
		return "html";
    }

    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    public String saludo(@RequestParam(required = false) String strNombre){
        return strNombre != null ? String.format("Hola %s", strNombre) : "Hola Mundo!";
    }

    // @RequestMapping(value = "/productos", method = RequestMethod.GET)
    // public String Productos(){
    //     return "1";
    // }

    @RequestMapping(value = "/productos", method = RequestMethod.GET)
    public List<Producto> productoTodos(){
        return pRepoProducto.buscarTodos();
    }
}
