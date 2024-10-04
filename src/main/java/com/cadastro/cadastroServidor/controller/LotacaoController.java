package com.cadastro.cadastroServidor.controller;

import com.cadastro.cadastroServidor.entity.Lotacao;
import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.service.LotacaoService;
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
    public ResponseEntity<Lotacao> findById(@PathVariable Long id){
        Optional<Lotacao> lotacao = lotacaoService.findById(id);
        if(lotacao.isPresent()){
            return ResponseEntity.ok(lotacao.get());
        }else{
            return ResponseEntity.notFound().build();
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
