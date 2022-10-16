package com.projetos.relatoriocomjasper.repository;

import com.projetos.relatoriocomjasper.model.EntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityModelRepository extends JpaRepository<EntityModel, Long> {
}
