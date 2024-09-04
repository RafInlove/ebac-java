package com.mod38.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.mod38.demo.entity.Entidade;
import com.mod38.demo.service.EntidadeService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean
@RequestScoped
@Controller
public class EntidadeController {

    @Autowired
    private EntidadeService entidadeService;

    private Entidade entidade = new Entidade();

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public List<Entidade> getEntidades() {
        return entidadeService.findAll();
    }

    public String save() {
        entidadeService.save(entidade);
        return "success"; // navegação de página JSF
    }
}
