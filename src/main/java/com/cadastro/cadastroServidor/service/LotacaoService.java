package com.cadastro.cadastroServidor.service;

import com.cadastro.cadastroServidor.entity.Lotacao;
import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.repository.LotacaoRepository;
import jakarta.persistence.Id;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LotacaoService {
    private LotacaoRepository lotacaoRepository;

    public LotacaoService(LotacaoRepository lotacaoRepository) {
        this.lotacaoRepository = lotacaoRepository;
    }

    public Lotacao create(Lotacao lotacao){
        return lotacaoRepository.save(lotacao);
    }
    public List<Lotacao> list(){
        return lotacaoRepository.findAll();
    }
    public Optional<Lotacao> findById(Long id){
        return lotacaoRepository.findById(id);
    }
    public Lotacao update(Lotacao lotacao){
        return lotacaoRepository.save(lotacao);
    }
    public void delete(Long id){
        lotacaoRepository.deleteById(id);
    }
}
