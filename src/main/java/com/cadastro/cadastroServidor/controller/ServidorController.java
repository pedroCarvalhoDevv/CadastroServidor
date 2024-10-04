package com.cadastro.cadastroServidor.controller;

import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.service.ServidorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servidor")
public class ServidorController {
    private ServidorService servidorService;

    public ServidorController(ServidorService servidorService) {
        this.servidorService = servidorService;
    }
    @PostMapping
    public Servidor creat(@RequestBody Servidor servidor){
        return servidorService.create(servidor);
    }
    @GetMapping
    List <Servidor> list(){
        return servidorService.list();
    }
    @GetMapping("/{matriculaId}")
    public ResponseEntity<Servidor> findById(@PathVariable Long matriculaId){
        Optional<Servidor>servidor = servidorService.findById(matriculaId);
        if(servidor.isPresent()){
            return ResponseEntity.ok(servidor.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping
    public Servidor update(@RequestBody Servidor servidor){
        return servidorService.update(servidor);
    }

    @DeleteMapping("{matriculaId}")
    public void delete(@PathVariable("matriculaId") Long matriculaId){

    }
}
