package com.projetos.relatoriocomjasper.model;

import com.projetos.relatoriocomjasper.model.enums.CargoUsuario;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "cargo")
    private CargoUsuario cargo;
}
