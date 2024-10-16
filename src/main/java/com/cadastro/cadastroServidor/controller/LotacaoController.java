package com.cadastro.cadastroServidor.controller;

import com.cadastro.cadastroServidor.entity.Lotacao;
import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.service.LotacaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lotacao")
public class LotacaoController {
    private LotacaoService lotacaoService;

    public LotacaoController(LotacaoService lotacaoService) {
        this.lotacaoService = lotacaoService;
    }
    @PostMapping
    public Lotacao creat(@RequestBody Lotacao lotacao){
        return lotacaoService.create(lotacao);
    }
    @GetMapping
    List<Lotacao> list(){
        return lotacaoService.list();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Optional<Lotacao> lotacao = lotacaoService.findById(id);
        if (lotacao.isPresent()) {
            return ResponseEntity.ok(lotacao.get());
        } else {
            // Retorna 404 com mensagem personalizada no corpo
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ID " + id + " não foi encontrado.");
        }
    }
    @PutMapping
    public Lotacao update(@RequestBody Lotacao lotacao){
        return lotacaoService.update(lotacao);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Long id){
    }

}
