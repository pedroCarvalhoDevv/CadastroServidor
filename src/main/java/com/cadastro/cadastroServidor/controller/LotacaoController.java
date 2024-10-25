package com.cadastro.cadastroServidor.controller;

import com.cadastro.cadastroServidor.model.entity.Lotacao;
import com.cadastro.cadastroServidor.model.dto.LotacaoDto;
import com.cadastro.cadastroServidor.service.LotacaoService;
import jakarta.validation.Valid;
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
    public LotacaoDto create(@Valid @RequestBody LotacaoDto lotacaoDto){
        return lotacaoService.create(lotacaoDto);
    }
    @GetMapping
    List<LotacaoDto> list(){
        return lotacaoService.list();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) {
        Optional<LotacaoDto> lotacao = lotacaoService.findById(id);
        if (lotacaoDto.isPresent()) {
            return ResponseEntity.ok(lotacaoDto.get());
        } else {
            // Retorna 404 com mensagem personalizada no corpo
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ID " + id + " não foi encontrado.");
        }
    }
    @PutMapping
    public Lotacao update(@RequestBody Lotacao lotacao){
        LotacaoDto lotacaoD;
        return lotacaoService.update(new LotacaoDto());
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id")Long id){
    }

}
