package com.cadastro.cadastroServidor.controller;

import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.service.ServidorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servidor")
public class ServidorController {
    private ServidorService servidorService;

    public ServidorController(ServidorService servidorService) {
        this.servidorService = servidorService;
    }
    @PostMapping
    List<Servidor> creat(@RequestBody Servidor servidor){
        return servidorService.create(servidor);
    }
    @GetMapping
    List<Servidor> list(){
        return servidorService.list();
    }
    @PutMapping
    List<Servidor> update(@RequestBody Servidor servidor){
        return servidorService.update(servidor);
    }
    @DeleteMapping("{matriculaId}")
    List<Servidor> delete(@PathVariable("matriculaId") Long matriculaId){
        return servidorService.delete(matriculaId);

    }
}