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

    public List<Servidor> create(Servidor servidor){
        servidorRepository.save(servidor);
        return list();
    }
    public List<Servidor> list(){
        return servidorRepository.findAll();
    }
    public List<Servidor> update(Servidor servidor){
        servidorRepository.save(servidor);
        return list();
    }
    public List<Servidor> delete(Long matriculaId){
        servidorRepository.deleteById(matriculaId);
        return list();
    }
}
