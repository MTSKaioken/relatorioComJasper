package com.projetos.relatoriocomjasper.model.enums;

public enum CargoUsuario {

    ADMINISTRADOR(1, "Administrador"),
    USUARIO(2, "Usuario");

    private final Integer codigo;
    private final String descricao;

    private CargoUsuario(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public static CargoUsuario findByCodigo(Integer codigo) {
        for (CargoUsuario tipo : CargoUsuario.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }
}
