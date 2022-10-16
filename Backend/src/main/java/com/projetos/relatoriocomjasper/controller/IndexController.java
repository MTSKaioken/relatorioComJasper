package com.projetos.relatoriocomjasper.controller;

import com.projetos.relatoriocomjasper.model.EntityModel;
import com.projetos.relatoriocomjasper.repository.EntityModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class IndexController {

    @Autowired
    EntityModelRepository entityModelRepository;

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public EntityModel novoUsuario(@RequestBody EntityModel entityModel){
        return entityModelRepository.save(entityModel);
    }

    @RequestMapping(value = "/cadastro/{id}", method = RequestMethod.GET)
    public Optional<EntityModel> buscarUsuarioPorId(@PathVariable Long id) {
        return entityModelRepository.findById(id);
    }

    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public String teste(){
        return "Teste";
    }
}
