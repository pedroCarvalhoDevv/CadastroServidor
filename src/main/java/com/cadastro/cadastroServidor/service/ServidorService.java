package com.cadastro.cadastroServidor.service;

import com.cadastro.cadastroServidor.entity.Servidor;
import com.cadastro.cadastroServidor.repository.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServidorService {

    private ServidorRepository servidorRepository;

    @Autowired
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
    public Optional<Servidor> findById(Long matriculaId){
        return servidorRepository.findById(matriculaId);

    }
    public void delete(Long matriculaId) {
        servidorRepository.deleteById(matriculaId);
    }
}
