package com.cadastro.cadastroServidor.service;

import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.repository.ServidorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServidorService {
    private ServidorRepository servidorRepository;

    public ServidorService(ServidorRepository servidorRepository) {
        this.servidorRepository = servidorRepository;
    }

    public Servidor create(Servidor servidor){
        return servidorRepository.save(servidor);
    }
    public List <Servidor> list(){
        return (List<Servidor>) servidorRepository.findAll();
    }
    public Servidor update(Servidor servidor){
        return servidorRepository.save(servidor);
    }
    public Servidor delete(Long matriculaId) {
        servidorRepository.deleteById(matriculaId);
        return delete(matriculaId);
    }
}
