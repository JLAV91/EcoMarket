package com.ecomarket.shipping_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomarket.shipping_service.model.Envio;
import com.ecomarket.shipping_service.service.EnvioService;

@RestController
@RequestMapping("/envio")
public class EnvioController {

    @Autowired
    private EnvioService envioService;

    @GetMapping
    public ResponseEntity<List<Envio>> listar(){
        List<Envio> envios = envioService.findAll();
        if(envios.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(envios);
    }

}
