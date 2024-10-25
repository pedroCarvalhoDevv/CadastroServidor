package com.cadastro.cadastroServidor.service;

import com.cadastro.cadastroServidor.model.entity.Lotacao;
import com.cadastro.cadastroServidor.model.dto.LotacaoDto;
import com.cadastro.cadastroServidor.repository.LotacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LotacaoService {

    private final LotacaoRepository lotacaoRepository;

    @Autowired
    public LotacaoService(LotacaoRepository lotacaoRepository) {
        this.lotacaoRepository = lotacaoRepository;
    }

    public LotacaoDto create(LotacaoDto lotacaoDto){
//        Lotacao lotacao = new Lotacao(lotacaoDto.getNome());
        return new LotacaoDto (lotacaoDto.getDescricao());

    }
    public List<LotacaoDto> findAll(){
        return lotacaoRepository.findAll();
    }
    public Optional<Lotacao> findById(Long id){
        return lotacaoRepository.findById(id);
    }
    public LotacaoDto update(LotacaoDto lotacaoDto){
        return lotacaoRepository.save(lotacaoDto);
    }
    public void delete(Long id){
        lotacaoRepository.deleteById(id);
    }
}
