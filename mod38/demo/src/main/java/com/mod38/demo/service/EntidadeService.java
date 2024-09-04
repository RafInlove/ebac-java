package com.mod38.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mod38.demo.entity.Entidade;
import com.mod38.demo.repository.EntidadeRepository;

import java.util.List;

@Service
public class EntidadeService {

    @Autowired
    private EntidadeRepository entidadeRepository;

    public List<Entidade> findAll() {
        return entidadeRepository.findAll();
    }

    public Entidade save(Entidade entidade) {
        return entidadeRepository.save(entidade);
    }
}
