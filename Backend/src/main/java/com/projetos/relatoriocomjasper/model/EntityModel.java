package com.projetos.relatoriocomjasper.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntityModel {

    private @Id
    @GeneratedValue Long id;
    private String email;
    private String senha;
    private String cargo;

}
