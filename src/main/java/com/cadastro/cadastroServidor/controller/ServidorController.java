package com.cadastro.cadastroServidor.controller;

import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.service.ServidorService;
import org.springframework.http.HttpStatus;
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
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Optional<Servidor> servidor = servidorService.findById(id);
        if (servidor.isPresent()) {
            return ResponseEntity.ok(servidor.get());
        } else {
            // Retorna 404 com mensagem personalizada no corpo
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ID " + id + "não foi encontrado.");
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
