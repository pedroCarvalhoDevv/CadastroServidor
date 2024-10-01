package com.cadastro.cadastroServidor.controller;

import com.cadastro.cadastroServidor.entity.Lotacao;
import com.cadastro.cadastroServidor.service.LotacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PutMapping
    public Lotacao update(@RequestBody Lotacao lotacao){
        return lotacaoService.update(lotacao);
    }
    @DeleteMapping("{id}")
    List<Lotacao> delete(@PathVariable("id")Long id){
        return lotacaoService.delete(id);
    }

}
